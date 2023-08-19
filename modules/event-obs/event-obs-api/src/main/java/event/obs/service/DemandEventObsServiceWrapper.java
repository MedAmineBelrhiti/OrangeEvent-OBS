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

package event.obs.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DemandEventObsService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsService
 * @generated
 */
public class DemandEventObsServiceWrapper
	implements DemandEventObsService, ServiceWrapper<DemandEventObsService> {

	public DemandEventObsServiceWrapper() {
		this(null);
	}

	public DemandEventObsServiceWrapper(
		DemandEventObsService demandEventObsService) {

		_demandEventObsService = demandEventObsService;
	}

	@Override
	public event.obs.model.DemandEventObs addDemand(
		String content, String firstName, String lastName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _demandEventObsService.addDemand(
			content, firstName, lastName, serviceContext);
	}

	@Override
	public event.obs.model.DemandEventObs ApproveDemand(
		long idDemand,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _demandEventObsService.ApproveDemand(idDemand, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demandEventObsService.getOSGiServiceIdentifier();
	}

	@Override
	public DemandEventObsService getWrappedService() {
		return _demandEventObsService;
	}

	@Override
	public void setWrappedService(DemandEventObsService demandEventObsService) {
		_demandEventObsService = demandEventObsService;
	}

	private DemandEventObsService _demandEventObsService;

}