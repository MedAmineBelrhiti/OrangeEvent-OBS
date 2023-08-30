package com.orange.actions;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.util.ParamUtil;
import event.obs.service.DemandEventObsService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import static com.orange.constants.PortletManagerPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + PORTLETMANAGER,
                "mvc.command.name=addDemand"
        },
        service = MVCActionCommand.class )
public class AddDemandMVCActionCommand extends BaseMVCActionCommand {
    @Reference
    DemandEventObsService demandEventObsService;
    @Reference
    UserService userService;
    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String content = ParamUtil.getString(actionRequest,CONTENT);
        ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
        long currentUserId = serviceContext.getUserId();
        User user = userService.getUserById(currentUserId);
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        demandEventObsService.addDemand(content,firstName,lastName,serviceContext);
    }
}
