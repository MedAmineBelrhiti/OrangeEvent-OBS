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

import event.obs.model.Transport;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the transport service. This utility wraps <code>event.obs.service.persistence.impl.TransportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransportPersistence
 * @generated
 */
public class TransportUtil {

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
	public static void clearCache(Transport transport) {
		getPersistence().clearCache(transport);
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
	public static Map<Serializable, Transport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Transport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Transport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Transport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Transport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Transport update(Transport transport) {
		return getPersistence().update(transport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Transport update(
		Transport transport, ServiceContext serviceContext) {

		return getPersistence().update(transport, serviceContext);
	}

	/**
	 * Returns all the transports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching transports
	 */
	public static List<Transport> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the transports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @return the range of matching transports
	 */
	public static List<Transport> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the transports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transports
	 */
	public static List<Transport> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Transport> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the transports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching transports
	 */
	public static List<Transport> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Transport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public static Transport findByUuid_First(
			String uuid, OrderByComparator<Transport> orderByComparator)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public static Transport fetchByUuid_First(
		String uuid, OrderByComparator<Transport> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public static Transport findByUuid_Last(
			String uuid, OrderByComparator<Transport> orderByComparator)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public static Transport fetchByUuid_Last(
		String uuid, OrderByComparator<Transport> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the transports before and after the current transport in the ordered set where uuid = &#63;.
	 *
	 * @param idTransport the primary key of the current transport
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transport
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public static Transport[] findByUuid_PrevAndNext(
			long idTransport, String uuid,
			OrderByComparator<Transport> orderByComparator)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUuid_PrevAndNext(
			idTransport, uuid, orderByComparator);
	}

	/**
	 * Removes all the transports where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of transports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching transports
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the transport where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTransportException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public static Transport findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the transport where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public static Transport fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the transport where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public static Transport fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the transport where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the transport that was removed
	 */
	public static Transport removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of transports where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching transports
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the transports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching transports
	 */
	public static List<Transport> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the transports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @return the range of matching transports
	 */
	public static List<Transport> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the transports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transports
	 */
	public static List<Transport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Transport> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the transports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching transports
	 */
	public static List<Transport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Transport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public static Transport findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Transport> orderByComparator)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public static Transport fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Transport> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public static Transport findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Transport> orderByComparator)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public static Transport fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Transport> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the transports before and after the current transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idTransport the primary key of the current transport
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transport
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public static Transport[] findByUuid_C_PrevAndNext(
			long idTransport, String uuid, long companyId,
			OrderByComparator<Transport> orderByComparator)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idTransport, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the transports where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of transports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching transports
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the transport in the entity cache if it is enabled.
	 *
	 * @param transport the transport
	 */
	public static void cacheResult(Transport transport) {
		getPersistence().cacheResult(transport);
	}

	/**
	 * Caches the transports in the entity cache if it is enabled.
	 *
	 * @param transports the transports
	 */
	public static void cacheResult(List<Transport> transports) {
		getPersistence().cacheResult(transports);
	}

	/**
	 * Creates a new transport with the primary key. Does not add the transport to the database.
	 *
	 * @param idTransport the primary key for the new transport
	 * @return the new transport
	 */
	public static Transport create(long idTransport) {
		return getPersistence().create(idTransport);
	}

	/**
	 * Removes the transport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport that was removed
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public static Transport remove(long idTransport)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().remove(idTransport);
	}

	public static Transport updateImpl(Transport transport) {
		return getPersistence().updateImpl(transport);
	}

	/**
	 * Returns the transport with the primary key or throws a <code>NoSuchTransportException</code> if it could not be found.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public static Transport findByPrimaryKey(long idTransport)
		throws event.obs.exception.NoSuchTransportException {

		return getPersistence().findByPrimaryKey(idTransport);
	}

	/**
	 * Returns the transport with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport, or <code>null</code> if a transport with the primary key could not be found
	 */
	public static Transport fetchByPrimaryKey(long idTransport) {
		return getPersistence().fetchByPrimaryKey(idTransport);
	}

	/**
	 * Returns all the transports.
	 *
	 * @return the transports
	 */
	public static List<Transport> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the transports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @return the range of transports
	 */
	public static List<Transport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the transports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of transports
	 */
	public static List<Transport> findAll(
		int start, int end, OrderByComparator<Transport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the transports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TransportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of transports
	 */
	public static List<Transport> findAll(
		int start, int end, OrderByComparator<Transport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the transports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of transports.
	 *
	 * @return the number of transports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TransportPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TransportPersistence _persistence;

}