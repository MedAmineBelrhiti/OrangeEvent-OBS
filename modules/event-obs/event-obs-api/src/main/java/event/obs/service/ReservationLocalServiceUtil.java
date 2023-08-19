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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import event.obs.model.Reservation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Reservation. This utility wraps
 * <code>event.obs.service.impl.ReservationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ReservationLocalService
 * @generated
 */
public class ReservationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.ReservationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the reservation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param reservation the reservation
	 * @return the reservation that was added
	 */
	public static Reservation addReservation(Reservation reservation) {
		return getService().addReservation(reservation);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new reservation with the primary key. Does not add the reservation to the database.
	 *
	 * @param idReservation the primary key for the new reservation
	 * @return the new reservation
	 */
	public static Reservation createReservation(long idReservation) {
		return getService().createReservation(idReservation);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation that was removed
	 * @throws PortalException if a reservation with the primary key could not be found
	 */
	public static Reservation deleteReservation(long idReservation)
		throws PortalException {

		return getService().deleteReservation(idReservation);
	}

	/**
	 * Deletes the reservation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param reservation the reservation
	 * @return the reservation that was removed
	 */
	public static Reservation deleteReservation(Reservation reservation) {
		return getService().deleteReservation(reservation);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Reservation fetchReservation(long idReservation) {
		return getService().fetchReservation(idReservation);
	}

	/**
	 * Returns the reservation matching the UUID and group.
	 *
	 * @param uuid the reservation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchReservationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchReservationByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the reservation with the primary key.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation
	 * @throws PortalException if a reservation with the primary key could not be found
	 */
	public static Reservation getReservation(long idReservation)
		throws PortalException {

		return getService().getReservation(idReservation);
	}

	/**
	 * Returns the reservation matching the UUID and group.
	 *
	 * @param uuid the reservation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reservation
	 * @throws PortalException if a matching reservation could not be found
	 */
	public static Reservation getReservationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getReservationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of reservations
	 */
	public static List<Reservation> getReservations(int start, int end) {
		return getService().getReservations(start, end);
	}

	/**
	 * Returns all the reservations matching the UUID and company.
	 *
	 * @param uuid the UUID of the reservations
	 * @param companyId the primary key of the company
	 * @return the matching reservations, or an empty list if no matches were found
	 */
	public static List<Reservation> getReservationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getReservationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of reservations matching the UUID and company.
	 *
	 * @param uuid the UUID of the reservations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching reservations, or an empty list if no matches were found
	 */
	public static List<Reservation> getReservationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getService().getReservationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of reservations.
	 *
	 * @return the number of reservations
	 */
	public static int getReservationsCount() {
		return getService().getReservationsCount();
	}

	/**
	 * Updates the reservation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param reservation the reservation
	 * @return the reservation that was updated
	 */
	public static Reservation updateReservation(Reservation reservation) {
		return getService().updateReservation(reservation);
	}

	public static ReservationLocalService getService() {
		return _service;
	}

	private static volatile ReservationLocalService _service;

}