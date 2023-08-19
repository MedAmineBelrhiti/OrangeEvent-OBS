package lifecycle.login.preaction.api;

import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static constants.LoginPostActionKeys.*;

@Component(
        immediate = true,
        property = "key=login.events.post",
        service = LifecycleAction.class
)
public class LoginPostAction implements LifecycleAction {
    private static final Log _log = LogFactoryUtil.getLog(LoginPostAction.class);
    @Override
    public void processLifecycleEvent(LifecycleEvent lifecycleEvent)  {
        System.out.println("login.event.post=" + lifecycleEvent);
        HttpServletRequest request = lifecycleEvent.getRequest();
        HttpServletResponse response = lifecycleEvent.getResponse();
        long userID = PortalUtil.getUserId(request);
        try {
            User user = UserLocalServiceUtil.getUserById(userID);
            List<Role> roles = RoleLocalServiceUtil.getUserRoles(user.getUserId());
            List<String> roleNames = roles.stream()
                    .map(Role::getName)
                    .collect(Collectors.toList());
            if (roleNames.contains(ADMIN) && roleNames.contains(ROLE_POWER_USER) ) {
                response.sendRedirect(PATH_ADMIN);
                return;
            }
            if (!roleNames.contains(ADMIN) && roleNames.contains(DEV) ) {
                response.sendRedirect(PATH_TEST);
                return;
            }
            if (!roleNames.contains(ADMIN) && roleNames.contains(ROLE_MANAGER) ) {
                response.sendRedirect(PATH_GROUP_MANAGER);
                return;
            }
            if(!roleNames.contains(ADMIN) && roleNames.contains(ROLE_COMMUNICATION))  {
                response.sendRedirect(PATH_GROUP_COMM);
                return;
            }
            if(!roleNames.contains(ADMIN) && roleNames.contains(ROLE_PARTICIPANT))  {
                response.sendRedirect(PATH_PARTICIPANT);
                return;
            }
            System.out.println("nom du role: " + roleNames);
        } catch (PortalException | IOException e) {
            throw new RuntimeException(e);
        }
        if (_log.isInfoEnabled()) {
            _log.info("Blade Login Post Action");
        }
    }
}
