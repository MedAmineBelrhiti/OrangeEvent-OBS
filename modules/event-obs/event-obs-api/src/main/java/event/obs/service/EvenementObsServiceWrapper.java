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
 * Provides a wrapper for {@link EvenementObsService}.
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObsService
 * @generated
 */
public class EvenementObsServiceWrapper
	implements EvenementObsService, ServiceWrapper<EvenementObsService> {

	public EvenementObsServiceWrapper() {
		this(null);
	}

	public EvenementObsServiceWrapper(EvenementObsService evenementObsService) {
		_evenementObsService = evenementObsService;
	}

	@Override
	public event.obs.model.EvenementObs addEvenement(
		java.util.Date startDate, java.util.Date endDate, String lieu,
		String description, java.util.Date votingEndDate, String titre,
		int nbrUserMax, String managerName, String entityName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _evenementObsService.addEvenement(
			startDate, endDate, lieu, description, votingEndDate, titre,
			nbrUserMax, managerName, entityName, serviceContext);
	}

	@Override
	public java.util.List<event.obs.model.EvenementObs> getEventsByEntityName(
			int start, int end,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsService.getEventsByEntityName(
			start, end, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evenementObsService.getOSGiServiceIdentifier();
	}

	@Override
	public EvenementObsService getWrappedService() {
		return _evenementObsService;
	}

	@Override
	public void setWrappedService(EvenementObsService evenementObsService) {
		_evenementObsService = evenementObsService;
	}

	private EvenementObsService _evenementObsService;

}