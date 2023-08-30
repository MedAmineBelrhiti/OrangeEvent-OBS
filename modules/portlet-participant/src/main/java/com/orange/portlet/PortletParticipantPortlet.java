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

import static com.orange.constants.PortletParticipantPortletKeys.*;

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
				"javax.portlet.init-param.view-template="+HOME_PAGE_PATH_JSP,
				"javax.portlet.name=" + PORTLETPARTICIPANT,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
)
public class PortletParticipantPortlet extends MVCPortlet {
	@Reference(target = "(&(javax.portlet.name=" + PORTLETPARTICIPANT +")(mvc.command.name=" + PATH_LIST_EVENT + "))")
	private MVCRenderCommand defaultPage;
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		String defaultPageView = defaultPage.render(renderRequest, renderResponse);

		include(defaultPageView, renderRequest, renderResponse);

	}
}