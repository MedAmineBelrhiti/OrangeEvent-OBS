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
 * Provides a wrapper for {@link ReservationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ReservationService
 * @generated
 */
public class ReservationServiceWrapper
	implements ReservationService, ServiceWrapper<ReservationService> {

	public ReservationServiceWrapper() {
		this(null);
	}

	public ReservationServiceWrapper(ReservationService reservationService) {
		_reservationService = reservationService;
	}

	@Override
	public event.obs.model.Reservation addReservation(
			long idEvent, long idUser, String firstName, String lastName,
			String entite,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationService.addReservation(
			idEvent, idUser, firstName, lastName, entite, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _reservationService.getOSGiServiceIdentifier();
	}

	@Override
	public ReservationService getWrappedService() {
		return _reservationService;
	}

	@Override
	public void setWrappedService(ReservationService reservationService) {
		_reservationService = reservationService;
	}

	private ReservationService _reservationService;

}