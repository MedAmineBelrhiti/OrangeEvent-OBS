/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package event.obs.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import event.obs.model.EvenementObs;
import event.obs.service.base.EvenementObsServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=obs",
		"json.web.service.context.path=EvenementObs"
	},
	service = AopService.class
)
public class EvenementObsServiceImpl extends EvenementObsServiceBaseImpl {
	public EvenementObs addEvenement (Date startDate, Date endDate, String lieu, String description, Date votingEndDate, String titre, int nbrUserMax , String managerName, String entityName, ServiceContext serviceContext){
		return evenementObsLocalService.addEvenement(startDate,endDate,lieu,description,votingEndDate,titre,nbrUserMax,managerName,entityName);
	}
	public List<EvenementObs> getEventsByEntityName(int start , int end , ServiceContext serviceContext) throws PortalException {
		long currentUserId = serviceContext.getUserId();
		User user = userService.getUserById(currentUserId);
		String entityName = (String) user.getExpandoBridge().getAttribute("entite");

		return evenementObsPersistence.findByEntites(entityName , start , end);
	}
}