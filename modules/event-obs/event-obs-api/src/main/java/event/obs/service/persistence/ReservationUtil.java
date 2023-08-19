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

package event.obs.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import event.obs.model.Reservation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the reservation service. This utility wraps <code>event.obs.service.persistence.impl.ReservationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReservationPersistence
 * @generated
 */
public class ReservationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Reservation reservation) {
		getPersistence().clearCache(reservation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Reservation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Reservation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Reservation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Reservation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Reservation update(Reservation reservation) {
		return getPersistence().update(reservation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Reservation update(
		Reservation reservation, ServiceContext serviceContext) {

		return getPersistence().update(reservation, serviceContext);
	}

	/**
	 * Returns all the reservations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching reservations
	 */
	public static List<Reservation> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the reservations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of matching reservations
	 */
	public static List<Reservation> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the reservations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByUuid_First(
			String uuid, OrderByComparator<Reservation> orderByComparator)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByUuid_First(
		String uuid, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByUuid_Last(
			String uuid, OrderByComparator<Reservation> orderByComparator)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByUuid_Last(
		String uuid, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where uuid = &#63;.
	 *
	 * @param idReservation the primary key of the current reservation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation[] findByUuid_PrevAndNext(
			long idReservation, String uuid,
			OrderByComparator<Reservation> orderByComparator)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUuid_PrevAndNext(
			idReservation, uuid, orderByComparator);
	}

	/**
	 * Removes all the reservations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of reservations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching reservations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the reservation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReservationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the reservation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the reservation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the reservation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the reservation that was removed
	 */
	public static Reservation removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of reservations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching reservations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching reservations
	 */
	public static List<Reservation> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of matching reservations
	 */
	public static List<Reservation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservations
	 */
	public static List<Reservation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Reservation> orderByComparator)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public static Reservation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Reservation> orderByComparator)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public static Reservation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idReservation the primary key of the current reservation
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation[] findByUuid_C_PrevAndNext(
			long idReservation, String uuid, long companyId,
			OrderByComparator<Reservation> orderByComparator)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idReservation, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the reservations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching reservations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the reservation in the entity cache if it is enabled.
	 *
	 * @param reservation the reservation
	 */
	public static void cacheResult(Reservation reservation) {
		getPersistence().cacheResult(reservation);
	}

	/**
	 * Caches the reservations in the entity cache if it is enabled.
	 *
	 * @param reservations the reservations
	 */
	public static void cacheResult(List<Reservation> reservations) {
		getPersistence().cacheResult(reservations);
	}

	/**
	 * Creates a new reservation with the primary key. Does not add the reservation to the database.
	 *
	 * @param idReservation the primary key for the new reservation
	 * @return the new reservation
	 */
	public static Reservation create(long idReservation) {
		return getPersistence().create(idReservation);
	}

	/**
	 * Removes the reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation that was removed
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation remove(long idReservation)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().remove(idReservation);
	}

	public static Reservation updateImpl(Reservation reservation) {
		return getPersistence().updateImpl(reservation);
	}

	/**
	 * Returns the reservation with the primary key or throws a <code>NoSuchReservationException</code> if it could not be found.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public static Reservation findByPrimaryKey(long idReservation)
		throws event.obs.exception.NoSuchReservationException {

		return getPersistence().findByPrimaryKey(idReservation);
	}

	/**
	 * Returns the reservation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation, or <code>null</code> if a reservation with the primary key could not be found
	 */
	public static Reservation fetchByPrimaryKey(long idReservation) {
		return getPersistence().fetchByPrimaryKey(idReservation);
	}

	/**
	 * Returns all the reservations.
	 *
	 * @return the reservations
	 */
	public static List<Reservation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @return the range of reservations
	 */
	public static List<Reservation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reservations
	 */
	public static List<Reservation> findAll(
		int start, int end, OrderByComparator<Reservation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservations
	 * @param end the upper bound of the range of reservations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of reservations
	 */
	public static List<Reservation> findAll(
		int start, int end, OrderByComparator<Reservation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the reservations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of reservations.
	 *
	 * @return the number of reservations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ReservationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ReservationPersistence _persistence;

}