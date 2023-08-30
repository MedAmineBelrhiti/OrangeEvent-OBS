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

import com.liferay.portal.kernel.exception.PortalException;

import event.obs.model.EvenementObs;

import java.util.List;

/**
 * Provides the remote service utility for EvenementObs. This utility wraps
 * <code>event.obs.service.impl.EvenementObsServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObsService
 * @generated
 */
public class EvenementObsServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.EvenementObsServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static EvenementObs addEvenement(
		java.util.Date startDate, java.util.Date endDate, String lieu,
		String description, java.util.Date votingEndDate, String titre,
		int nbrUserMax, String managerName, String entityName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addEvenement(
			startDate, endDate, lieu, description, votingEndDate, titre,
			nbrUserMax, managerName, entityName, serviceContext);
	}

	public static List<EvenementObs> getEventsByEntityName(
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().getEventsByEntityName(serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static EvenementObs incrementNbrUserConfirmed(long idEvent) {
		return getService().incrementNbrUserConfirmed(idEvent);
	}

	public static EvenementObsService getService() {
		return _service;
	}

	private static volatile EvenementObsService _service;

}