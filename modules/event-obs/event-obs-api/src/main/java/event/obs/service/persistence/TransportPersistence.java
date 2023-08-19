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

import event.obs.exception.NoSuchTransportException;
import event.obs.model.Transport;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the transport service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransportUtil
 * @generated
 */
@ProviderType
public interface TransportPersistence extends BasePersistence<Transport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TransportUtil} to access the transport persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the transports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching transports
	 */
	public java.util.List<Transport> findByUuid(String uuid);

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
	public java.util.List<Transport> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Transport> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

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
	public java.util.List<Transport> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public Transport findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Transport>
				orderByComparator)
		throws NoSuchTransportException;

	/**
	 * Returns the first transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public Transport fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

	/**
	 * Returns the last transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public Transport findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Transport>
				orderByComparator)
		throws NoSuchTransportException;

	/**
	 * Returns the last transport in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public Transport fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

	/**
	 * Returns the transports before and after the current transport in the ordered set where uuid = &#63;.
	 *
	 * @param idTransport the primary key of the current transport
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transport
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public Transport[] findByUuid_PrevAndNext(
			long idTransport, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Transport>
				orderByComparator)
		throws NoSuchTransportException;

	/**
	 * Removes all the transports where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of transports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching transports
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the transport where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTransportException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public Transport findByUUID_G(String uuid, long groupId)
		throws NoSuchTransportException;

	/**
	 * Returns the transport where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public Transport fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the transport where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public Transport fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the transport where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the transport that was removed
	 */
	public Transport removeByUUID_G(String uuid, long groupId)
		throws NoSuchTransportException;

	/**
	 * Returns the number of transports where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching transports
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the transports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching transports
	 */
	public java.util.List<Transport> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Transport> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Transport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

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
	public java.util.List<Transport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public Transport findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Transport>
				orderByComparator)
		throws NoSuchTransportException;

	/**
	 * Returns the first transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public Transport fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

	/**
	 * Returns the last transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport
	 * @throws NoSuchTransportException if a matching transport could not be found
	 */
	public Transport findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Transport>
				orderByComparator)
		throws NoSuchTransportException;

	/**
	 * Returns the last transport in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transport, or <code>null</code> if a matching transport could not be found
	 */
	public Transport fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

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
	public Transport[] findByUuid_C_PrevAndNext(
			long idTransport, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Transport>
				orderByComparator)
		throws NoSuchTransportException;

	/**
	 * Removes all the transports where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of transports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching transports
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the transport in the entity cache if it is enabled.
	 *
	 * @param transport the transport
	 */
	public void cacheResult(Transport transport);

	/**
	 * Caches the transports in the entity cache if it is enabled.
	 *
	 * @param transports the transports
	 */
	public void cacheResult(java.util.List<Transport> transports);

	/**
	 * Creates a new transport with the primary key. Does not add the transport to the database.
	 *
	 * @param idTransport the primary key for the new transport
	 * @return the new transport
	 */
	public Transport create(long idTransport);

	/**
	 * Removes the transport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport that was removed
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public Transport remove(long idTransport) throws NoSuchTransportException;

	public Transport updateImpl(Transport transport);

	/**
	 * Returns the transport with the primary key or throws a <code>NoSuchTransportException</code> if it could not be found.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport
	 * @throws NoSuchTransportException if a transport with the primary key could not be found
	 */
	public Transport findByPrimaryKey(long idTransport)
		throws NoSuchTransportException;

	/**
	 * Returns the transport with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport, or <code>null</code> if a transport with the primary key could not be found
	 */
	public Transport fetchByPrimaryKey(long idTransport);

	/**
	 * Returns all the transports.
	 *
	 * @return the transports
	 */
	public java.util.List<Transport> findAll();

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
	public java.util.List<Transport> findAll(int start, int end);

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
	public java.util.List<Transport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator);

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
	public java.util.List<Transport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Transport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the transports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of transports.
	 *
	 * @return the number of transports
	 */
	public int countAll();

}