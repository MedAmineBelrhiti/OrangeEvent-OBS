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

import com.liferay.portal.kernel.service.ServiceContext;
import event.obs.model.DemandEventObs;
import event.obs.service.base.DemandEventObsServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=obs",
		"json.web.service.context.path=DemandEventObs"
	},
	service = AopService.class
)
public class DemandEventObsServiceImpl extends DemandEventObsServiceBaseImpl {
	public DemandEventObs addDemand(String content, String firstName, String lastName, ServiceContext serviceContext)
	{
		return demandEventObsLocalService.addDemand(content,firstName,lastName);
	}
	public DemandEventObs ApproveDemand(long idDemand, ServiceContext serviceContext){
		return demandEventObsLocalService.ApproveDemand(idDemand);
	}
}