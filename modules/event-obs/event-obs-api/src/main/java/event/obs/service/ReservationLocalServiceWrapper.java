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
 * Provides a wrapper for {@link ReservationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ReservationLocalService
 * @generated
 */
public class ReservationLocalServiceWrapper
	implements ReservationLocalService,
			   ServiceWrapper<ReservationLocalService> {

	public ReservationLocalServiceWrapper() {
		this(null);
	}

	public ReservationLocalServiceWrapper(
		ReservationLocalService reservationLocalService) {

		_reservationLocalService = reservationLocalService;
	}

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
	@Override
	public event.obs.model.Reservation addReservation(
		event.obs.model.Reservation reservation) {

		return _reservationLocalService.addReservation(reservation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new reservation with the primary key. Does not add the reservation to the database.
	 *
	 * @param idReservation the primary key for the new reservation
	 * @return the new reservation
	 */
	@Override
	public event.obs.model.Reservation createReservation(long idReservation) {
		return _reservationLocalService.createReservation(idReservation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public event.obs.model.Reservation deleteReservation(long idReservation)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationLocalService.deleteReservation(idReservation);
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
	@Override
	public event.obs.model.Reservation deleteReservation(
		event.obs.model.Reservation reservation) {

		return _reservationLocalService.deleteReservation(reservation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _reservationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _reservationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _reservationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _reservationLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _reservationLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _reservationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _reservationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _reservationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.Reservation fetchReservation(long idReservation) {
		return _reservationLocalService.fetchReservation(idReservation);
	}

	/**
	 * Returns the reservation matching the UUID and group.
	 *
	 * @param uuid the reservation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	@Override
	public event.obs.model.Reservation fetchReservationByUuidAndGroupId(
		String uuid, long groupId) {

		return _reservationLocalService.fetchReservationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _reservationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _reservationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _reservationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _reservationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the reservation with the primary key.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation
	 * @throws PortalException if a reservation with the primary key could not be found
	 */
	@Override
	public event.obs.model.Reservation getReservation(long idReservation)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationLocalService.getReservation(idReservation);
	}

	/**
	 * Returns the reservation matching the UUID and group.
	 *
	 * @param uuid the reservation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reservation
	 * @throws PortalException if a matching reservation could not be found
	 */
	@Override
	public event.obs.model.Reservation getReservationByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservationLocalService.getReservationByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<event.obs.model.Reservation> getReservations(
		int start, int end) {

		return _reservationLocalService.getReservations(start, end);
	}

	/**
	 * Returns all the reservations matching the UUID and company.
	 *
	 * @param uuid the UUID of the reservations
	 * @param companyId the primary key of the company
	 * @return the matching reservations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Reservation>
		getReservationsByUuidAndCompanyId(String uuid, long companyId) {

		return _reservationLocalService.getReservationsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<event.obs.model.Reservation>
		getReservationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.Reservation> orderByComparator) {

		return _reservationLocalService.getReservationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of reservations.
	 *
	 * @return the number of reservations
	 */
	@Override
	public int getReservationsCount() {
		return _reservationLocalService.getReservationsCount();
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
	@Override
	public event.obs.model.Reservation updateReservation(
		event.obs.model.Reservation reservation) {

		return _reservationLocalService.updateReservation(reservation);
	}

	@Override
	public ReservationLocalService getWrappedService() {
		return _reservationLocalService;
	}

	@Override
	public void setWrappedService(
		ReservationLocalService reservationLocalService) {

		_reservationLocalService = reservationLocalService;
	}

	private ReservationLocalService _reservationLocalService;

}