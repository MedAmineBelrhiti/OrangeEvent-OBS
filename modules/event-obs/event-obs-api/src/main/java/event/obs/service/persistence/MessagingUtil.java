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

import event.obs.model.Messaging;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the messaging service. This utility wraps <code>event.obs.service.persistence.impl.MessagingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessagingPersistence
 * @generated
 */
public class MessagingUtil {

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
	public static void clearCache(Messaging messaging) {
		getPersistence().clearCache(messaging);
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
	public static Map<Serializable, Messaging> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Messaging> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Messaging> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Messaging> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Messaging update(Messaging messaging) {
		return getPersistence().update(messaging);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Messaging update(
		Messaging messaging, ServiceContext serviceContext) {

		return getPersistence().update(messaging, serviceContext);
	}

	/**
	 * Returns all the messagings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching messagings
	 */
	public static List<Messaging> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the messagings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @return the range of matching messagings
	 */
	public static List<Messaging> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the messagings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching messagings
	 */
	public static List<Messaging> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the messagings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching messagings
	 */
	public static List<Messaging> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Messaging> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first messaging in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching messaging
	 * @throws NoSuchMessagingException if a matching messaging could not be found
	 */
	public static Messaging findByUuid_First(
			String uuid, OrderByComparator<Messaging> orderByComparator)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first messaging in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchByUuid_First(
		String uuid, OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last messaging in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching messaging
	 * @throws NoSuchMessagingException if a matching messaging could not be found
	 */
	public static Messaging findByUuid_Last(
			String uuid, OrderByComparator<Messaging> orderByComparator)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last messaging in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchByUuid_Last(
		String uuid, OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the messagings before and after the current messaging in the ordered set where uuid = &#63;.
	 *
	 * @param idMessage the primary key of the current messaging
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next messaging
	 * @throws NoSuchMessagingException if a messaging with the primary key could not be found
	 */
	public static Messaging[] findByUuid_PrevAndNext(
			long idMessage, String uuid,
			OrderByComparator<Messaging> orderByComparator)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUuid_PrevAndNext(
			idMessage, uuid, orderByComparator);
	}

	/**
	 * Removes all the messagings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of messagings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching messagings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the messaging where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMessagingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching messaging
	 * @throws NoSuchMessagingException if a matching messaging could not be found
	 */
	public static Messaging findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the messaging where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the messaging where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the messaging where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the messaging that was removed
	 */
	public static Messaging removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of messagings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching messagings
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the messagings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching messagings
	 */
	public static List<Messaging> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the messagings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @return the range of matching messagings
	 */
	public static List<Messaging> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the messagings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching messagings
	 */
	public static List<Messaging> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the messagings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching messagings
	 */
	public static List<Messaging> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Messaging> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first messaging in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching messaging
	 * @throws NoSuchMessagingException if a matching messaging could not be found
	 */
	public static Messaging findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Messaging> orderByComparator)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first messaging in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last messaging in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching messaging
	 * @throws NoSuchMessagingException if a matching messaging could not be found
	 */
	public static Messaging findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Messaging> orderByComparator)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last messaging in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the messagings before and after the current messaging in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idMessage the primary key of the current messaging
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next messaging
	 * @throws NoSuchMessagingException if a messaging with the primary key could not be found
	 */
	public static Messaging[] findByUuid_C_PrevAndNext(
			long idMessage, String uuid, long companyId,
			OrderByComparator<Messaging> orderByComparator)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idMessage, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the messagings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of messagings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching messagings
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the messaging in the entity cache if it is enabled.
	 *
	 * @param messaging the messaging
	 */
	public static void cacheResult(Messaging messaging) {
		getPersistence().cacheResult(messaging);
	}

	/**
	 * Caches the messagings in the entity cache if it is enabled.
	 *
	 * @param messagings the messagings
	 */
	public static void cacheResult(List<Messaging> messagings) {
		getPersistence().cacheResult(messagings);
	}

	/**
	 * Creates a new messaging with the primary key. Does not add the messaging to the database.
	 *
	 * @param idMessage the primary key for the new messaging
	 * @return the new messaging
	 */
	public static Messaging create(long idMessage) {
		return getPersistence().create(idMessage);
	}

	/**
	 * Removes the messaging with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idMessage the primary key of the messaging
	 * @return the messaging that was removed
	 * @throws NoSuchMessagingException if a messaging with the primary key could not be found
	 */
	public static Messaging remove(long idMessage)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().remove(idMessage);
	}

	public static Messaging updateImpl(Messaging messaging) {
		return getPersistence().updateImpl(messaging);
	}

	/**
	 * Returns the messaging with the primary key or throws a <code>NoSuchMessagingException</code> if it could not be found.
	 *
	 * @param idMessage the primary key of the messaging
	 * @return the messaging
	 * @throws NoSuchMessagingException if a messaging with the primary key could not be found
	 */
	public static Messaging findByPrimaryKey(long idMessage)
		throws event.obs.exception.NoSuchMessagingException {

		return getPersistence().findByPrimaryKey(idMessage);
	}

	/**
	 * Returns the messaging with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idMessage the primary key of the messaging
	 * @return the messaging, or <code>null</code> if a messaging with the primary key could not be found
	 */
	public static Messaging fetchByPrimaryKey(long idMessage) {
		return getPersistence().fetchByPrimaryKey(idMessage);
	}

	/**
	 * Returns all the messagings.
	 *
	 * @return the messagings
	 */
	public static List<Messaging> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the messagings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @return the range of messagings
	 */
	public static List<Messaging> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the messagings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of messagings
	 */
	public static List<Messaging> findAll(
		int start, int end, OrderByComparator<Messaging> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the messagings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of messagings
	 */
	public static List<Messaging> findAll(
		int start, int end, OrderByComparator<Messaging> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the messagings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of messagings.
	 *
	 * @return the number of messagings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MessagingPersistence getPersistence() {
		return _persistence;
	}

	private static volatile MessagingPersistence _persistence;

}