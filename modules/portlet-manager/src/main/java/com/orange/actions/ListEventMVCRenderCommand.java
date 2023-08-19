package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import event.obs.model.EvenementObs;
import event.obs.service.EvenementObsLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

import static com.orange.constants.PortletManagerPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name="+ PORTLETMANAGER,
                "mvc.command.name="+ PATH_EVENT_LIST
        },
        service = MVCRenderCommand.class

)
public class ListEventMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        List<EvenementObs> evenementObs = EvenementObsLocalServiceUtil.getEvenementObses(0,EvenementObsLocalServiceUtil.getEvenementObsesCount());
        renderRequest.setAttribute(EVENTS_PARAM,evenementObs);
        renderRequest.setAttribute(MVC_RENDER_COMMAND,PATH_EVENT_LIST);
        return PATH_EVENTS_JSP;
    }
}
