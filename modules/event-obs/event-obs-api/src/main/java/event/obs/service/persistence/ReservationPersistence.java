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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import event.obs.exception.NoSuchReservationException;
import event.obs.model.Reservation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the reservation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReservationUtil
 * @generated
 */
@ProviderType
public interface ReservationPersistence extends BasePersistence<Reservation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReservationUtil} to access the reservation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the reservations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching reservations
	 */
	public java.util.List<Reservation> findByUuid(String uuid);

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
	public java.util.List<Reservation> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Reservation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the reservations before and after the current reservation in the ordered set where uuid = &#63;.
	 *
	 * @param idReservation the primary key of the current reservation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation[] findByUuid_PrevAndNext(
			long idReservation, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Removes all the reservations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of reservations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching reservations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the reservation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReservationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByUUID_G(String uuid, long groupId)
		throws NoSuchReservationException;

	/**
	 * Returns the reservation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the reservation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the reservation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the reservation that was removed
	 */
	public Reservation removeByUUID_G(String uuid, long groupId)
		throws NoSuchReservationException;

	/**
	 * Returns the number of reservations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching reservations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching reservations
	 */
	public java.util.List<Reservation> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Reservation> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Reservation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the first reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation
	 * @throws NoSuchReservationException if a matching reservation could not be found
	 */
	public Reservation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Returns the last reservation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reservation, or <code>null</code> if a matching reservation could not be found
	 */
	public Reservation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public Reservation[] findByUuid_C_PrevAndNext(
			long idReservation, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Reservation>
				orderByComparator)
		throws NoSuchReservationException;

	/**
	 * Removes all the reservations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of reservations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching reservations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the reservation in the entity cache if it is enabled.
	 *
	 * @param reservation the reservation
	 */
	public void cacheResult(Reservation reservation);

	/**
	 * Caches the reservations in the entity cache if it is enabled.
	 *
	 * @param reservations the reservations
	 */
	public void cacheResult(java.util.List<Reservation> reservations);

	/**
	 * Creates a new reservation with the primary key. Does not add the reservation to the database.
	 *
	 * @param idReservation the primary key for the new reservation
	 * @return the new reservation
	 */
	public Reservation create(long idReservation);

	/**
	 * Removes the reservation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation that was removed
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation remove(long idReservation)
		throws NoSuchReservationException;

	public Reservation updateImpl(Reservation reservation);

	/**
	 * Returns the reservation with the primary key or throws a <code>NoSuchReservationException</code> if it could not be found.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation
	 * @throws NoSuchReservationException if a reservation with the primary key could not be found
	 */
	public Reservation findByPrimaryKey(long idReservation)
		throws NoSuchReservationException;

	/**
	 * Returns the reservation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idReservation the primary key of the reservation
	 * @return the reservation, or <code>null</code> if a reservation with the primary key could not be found
	 */
	public Reservation fetchByPrimaryKey(long idReservation);

	/**
	 * Returns all the reservations.
	 *
	 * @return the reservations
	 */
	public java.util.List<Reservation> findAll();

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
	public java.util.List<Reservation> findAll(int start, int end);

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
	public java.util.List<Reservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator);

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
	public java.util.List<Reservation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reservation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the reservations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of reservations.
	 *
	 * @return the number of reservations
	 */
	public int countAll();

}