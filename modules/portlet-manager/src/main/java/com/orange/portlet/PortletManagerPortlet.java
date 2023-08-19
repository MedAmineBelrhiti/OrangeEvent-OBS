package com.orange.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

import static com.orange.constants.PortletManagerPortletKeys.*;

/**
 * @author QJDY2305
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template="+ PATH_VIEW_JSP,
		"javax.portlet.name=" + PORTLETMANAGER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletManagerPortlet extends MVCPortlet {
	@Reference(target = "(&(javax.portlet.name=" + PORTLETMANAGER +")(mvc.command.name=" + PATH_DEFAULT_PAGE + "))")
	MVCRenderCommand renderCommand;
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String defaultLandingPage = renderCommand.render(renderRequest,renderResponse);
		include(defaultLandingPage,renderRequest,renderResponse);
	}
}