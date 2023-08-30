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
import com.liferay.portal.kernel.service.ServiceContextFactory;
import event.obs.model.EvenementObs;
import event.obs.model.Reservation;
import event.obs.service.EvenementObsLocalService;
import event.obs.service.EvenementObsService;
import event.obs.service.base.ReservationLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=event.obs.model.Reservation",
	service = AopService.class
)
public class ReservationLocalServiceImpl extends ReservationLocalServiceBaseImpl {
	@Reference
	EvenementObsService service;
		public Reservation addReservation(long idEvent,long idUser,String firstName,String lastName,String entite) throws PortalException {
			long idReservation = counterLocalService.increment(Reservation.class.getName());
			Reservation reservation = reservationPersistence.create(idReservation);
			reservation.setIdEvent(idEvent);
			reservation.setIdUser(idUser);
			reservation.setNom(lastName);
			reservation.setPrenom(firstName);
			reservation.setEntite(entite);
			reservationLocalService.addReservation(reservation);
			service.incrementNbrUserConfirmed(idEvent);
			return reservation;
		}
}