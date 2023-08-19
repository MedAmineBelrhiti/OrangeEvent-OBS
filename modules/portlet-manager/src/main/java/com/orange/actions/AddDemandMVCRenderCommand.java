package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import static com.orange.constants.PortletManagerPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name="+ PORTLETMANAGER,
                "mvc.command.name=" +PATH_ADD_DEMAND
        },
        service = MVCRenderCommand.class
)
public class AddDemandMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        return PATH_ADD_DEMAND_JSP;
    }
}
