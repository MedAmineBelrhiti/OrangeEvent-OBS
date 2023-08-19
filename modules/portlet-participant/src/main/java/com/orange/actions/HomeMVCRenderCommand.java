package com.orange.actions;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import event.obs.model.EvenementObs;
import event.obs.service.EvenementObsService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import java.util.List;

import static com.orange.constants.PortletParticipantPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + PORTLETPARTICIPANT,
                "mvc.command.name=" + HOME_PAGE_PATH
        },
        service = MVCRenderCommand.class
)
public class HomeMVCRenderCommand implements MVCRenderCommand {
    @Reference
    EvenementObsService evenementObsService;
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(renderRequest);
            List<EvenementObs> eventOBS = evenementObsService.getEventsByEntityName(0,10,serviceContext);
            renderRequest.setAttribute(MVC_RENDER_COMMAND, HOME_PAGE_PATH);
            renderRequest.setAttribute(EVENEMENT_PARAM, eventOBS);
        } catch (PortalException e) {
            throw new RuntimeException(e);
        }
        return HOME_PAGE_PATH_JSP;
    }
}
