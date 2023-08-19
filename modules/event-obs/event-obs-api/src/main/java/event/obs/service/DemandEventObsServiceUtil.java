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

import event.obs.model.DemandEventObs;

/**
 * Provides the remote service utility for DemandEventObs. This utility wraps
 * <code>event.obs.service.impl.DemandEventObsServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsService
 * @generated
 */
public class DemandEventObsServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.DemandEventObsServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DemandEventObs addDemand(
		String content, String firstName, String lastName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addDemand(
			content, firstName, lastName, serviceContext);
	}

	public static DemandEventObs ApproveDemand(
		long idDemand,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().ApproveDemand(idDemand, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DemandEventObsService getService() {
		return _service;
	}

	private static volatile DemandEventObsService _service;

}