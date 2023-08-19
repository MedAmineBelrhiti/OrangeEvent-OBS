package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import event.obs.model.EvenementObs;
import event.obs.service.EvenementObsLocalServiceUtil;
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
                "mvc.command.name=" +PATH_LIST_EVENT
        },
        service = MVCRenderCommand.class
)
public class EventListMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        List<EvenementObs> evenementObs = EvenementObsLocalServiceUtil.getEvenementObses(0,EvenementObsLocalServiceUtil.getEvenementObsesCount());
        renderRequest.setAttribute(MVC_RENDER_COMMAND, PATH_LIST_EVENT);
        renderRequest.setAttribute(EVENEMENT_PARAM,evenementObs);
        return LIST_EVENT_JSP;
    }
}
