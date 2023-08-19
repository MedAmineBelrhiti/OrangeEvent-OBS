package com.orange.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import event.obs.service.EvenementObsService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.orange.constants.PortletCommunicationPortletKeys.*;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + PORTLETCOMMUNICATION,
                "mvc.command.name=addEvent"
        },
        service = MVCActionCommand.class )
public class AddEventMvcCommandAction extends BaseMVCActionCommand {
    @Reference
    EvenementObsService evenementObsService;
    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        Date startDate = ParamUtil.getDate(actionRequest, START_DATE,
                new SimpleDateFormat(DATE_FORMAT));
        Date endDate = ParamUtil.getDate(actionRequest, END_DATE,
                new SimpleDateFormat(DATE_FORMAT));
        String lieu = ParamUtil.getString(actionRequest,LIEU);
        String description = ParamUtil.getString(actionRequest,DESCRIPTION);
        Date votingEndDate = ParamUtil.getDate(actionRequest, VOTING_END_DATE,
                new SimpleDateFormat(DATE_FORMAT));
        int nbrUserMax = (int) ParamUtil.getLong(actionRequest, NBR_USER_MAX);
        String manager = ParamUtil.getString(actionRequest,MANAGER_NAME);
        String titre = ParamUtil.getString(actionRequest,TITRE);
        String  entityName= ParamUtil.getString(actionRequest,ENTITY_NAME);
        ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
        //ADD EVENT
        evenementObsService.addEvenement(startDate,endDate,lieu,description,votingEndDate,titre,nbrUserMax,manager,entityName,serviceContext);
    }
}
