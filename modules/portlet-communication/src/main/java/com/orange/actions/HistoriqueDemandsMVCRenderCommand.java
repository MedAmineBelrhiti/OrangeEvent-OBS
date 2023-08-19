package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import event.obs.model.DemandEventObs;
import event.obs.service.DemandEventObsLocalService;
import event.obs.service.DemandEventObsLocalServiceUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

import static com.orange.constants.PortletCommunicationPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name="+ PORTLETCOMMUNICATION,
                "mvc.command.name=" +HISTORIQUE_DEMAND_PATH
        },
        service = MVCRenderCommand.class
)
public class HistoriqueDemandsMVCRenderCommand implements MVCRenderCommand {
    @Reference
    DemandEventObsLocalService demandEventObsLocalService;
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        List<DemandEventObs> listDemand = DemandEventObsLocalServiceUtil.getDemandEventObses(0, DemandEventObsLocalServiceUtil.getDemandEventObsesCount());

        boolean allApproved = true;

        for (DemandEventObs demand : listDemand) {
            if (APPROVED.equals(demand.getStatus())) {
                allApproved = false;
                break;
            }
        }
        renderRequest.setAttribute(MVC_RENDER_COMMAND,HISTORIQUE_DEMAND_PATH);
        renderRequest.setAttribute(HISTORIQUE_DEMAND_PARAM,demandEventObsLocalService.findByStatus(APPROVED));
        renderRequest.setAttribute(ALL_APPROVED_PARAM,allApproved);
        return PATH_HISTORIQUE_DEMANDE_JSP;
    }
}
