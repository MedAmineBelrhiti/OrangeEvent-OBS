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
import com.liferay.portal.kernel.service.ServiceContext;
import event.obs.model.Reservation;
import event.obs.service.base.ReservationServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=obs",
		"json.web.service.context.path=Reservation"
	},
	service = AopService.class
)
public class ReservationServiceImpl extends ReservationServiceBaseImpl {
	public Reservation addReservation(long idEvent, long idUser, String firstName, String lastName, String entite, ServiceContext serviceContext) throws PortalException {
		return reservationLocalService.addReservation(idEvent,idUser,firstName,lastName,entite);
	}
}