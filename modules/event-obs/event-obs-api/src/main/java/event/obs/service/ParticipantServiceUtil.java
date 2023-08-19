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

import event.obs.model.Participant;

/**
 * Provides the remote service utility for Participant. This utility wraps
 * <code>event.obs.service.impl.ParticipantServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantService
 * @generated
 */
public class ParticipantServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.ParticipantServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Participant addParticipant(
		long userId, String entite,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addParticipant(userId, entite, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ParticipantService getService() {
		return _service;
	}

	private static volatile ParticipantService _service;

}