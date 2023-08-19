package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import event.obs.model.Entite;
import event.obs.service.EntiteLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import java.util.List;

import static com.orange.constants.PortletCommunicationPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" +PORTLETCOMMUNICATION,
                "mvc.command.name=" +PATH_ADD_EVENT
        },
        service = MVCRenderCommand.class
)
public class AddEventMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        List<Entite> entites = EntiteLocalServiceUtil.getEntites(0, EntiteLocalServiceUtil.getEntitesCount());
        renderRequest.setAttribute(MVC_RENDER_COMMAND, PATH_ADD_EVENT);
        renderRequest.setAttribute(ENTITES,entites);
        return PATH_ADD_EVENT_JSP;
    }
}
