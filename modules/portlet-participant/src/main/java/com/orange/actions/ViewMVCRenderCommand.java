package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import static com.orange.constants.PortletParticipantPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name="+ PORTLETPARTICIPANT,
                "mvc.command.name=" +PATH_VIEW
        },
        service = MVCRenderCommand.class
)
public class ViewMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        return DEFAULT_PAGE;
    }
}
