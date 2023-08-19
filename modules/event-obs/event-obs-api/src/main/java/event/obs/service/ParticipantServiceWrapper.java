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
 * Provides a wrapper for {@link ParticipantService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantService
 * @generated
 */
public class ParticipantServiceWrapper
	implements ParticipantService, ServiceWrapper<ParticipantService> {

	public ParticipantServiceWrapper() {
		this(null);
	}

	public ParticipantServiceWrapper(ParticipantService participantService) {
		_participantService = participantService;
	}

	@Override
	public event.obs.model.Participant addParticipant(
		long userId, String entite,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _participantService.addParticipant(
			userId, entite, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _participantService.getOSGiServiceIdentifier();
	}

	@Override
	public ParticipantService getWrappedService() {
		return _participantService;
	}

	@Override
	public void setWrappedService(ParticipantService participantService) {
		_participantService = participantService;
	}

	private ParticipantService _participantService;

}