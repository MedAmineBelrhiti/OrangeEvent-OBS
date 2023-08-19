package com.orange.actions;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.WebKeys;
import event.obs.model.DemandEventObs;
import event.obs.service.DemandEventObsLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.ArrayList;
import java.util.List;

import static com.orange.constants.PortletManagerPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + PORTLETMANAGER,
                "mvc.command.name=" + PATH_DEMAND_LIST
        }
)
public class ListDemandMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

        List<DemandEventObs> listDemands = DemandEventObsLocalServiceUtil.getDemandEventObses(0,DemandEventObsLocalServiceUtil.getDemandEventObsesCount());
        User currentUser = (User) renderRequest.getAttribute(WebKeys.USER);
        String currentUserFirstName = currentUser.getFirstName();
        String currentUserLastName = currentUser.getLastName();
        List<DemandEventObs> filteredDemands = new ArrayList<>();

        for (DemandEventObs demand : listDemands) {
            String demandFirstName = demand.getFirstName();
            String demandLastName = demand.getLastName();

            if (currentUserFirstName.equals(demandFirstName) && currentUserLastName.equals(demandLastName)) {
                filteredDemands.add(demand);
            }
        }
        renderRequest.setAttribute(MVC_RENDER_COMMAND,PATH_DEMAND_LIST);
        renderRequest.setAttribute(DEMANDS_PARAM,filteredDemands);
        return PATH_VIEW_DEMANDS_JSP;
    }
}
