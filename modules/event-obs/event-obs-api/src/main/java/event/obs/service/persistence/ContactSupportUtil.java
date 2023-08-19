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

import event.obs.model.ContactSupport;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the contact support service. This utility wraps <code>event.obs.service.persistence.impl.ContactSupportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupportPersistence
 * @generated
 */
public class ContactSupportUtil {

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
	public static void clearCache(ContactSupport contactSupport) {
		getPersistence().clearCache(contactSupport);
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
	public static Map<Serializable, ContactSupport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ContactSupport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ContactSupport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ContactSupport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ContactSupport update(ContactSupport contactSupport) {
		return getPersistence().update(contactSupport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ContactSupport update(
		ContactSupport contactSupport, ServiceContext serviceContext) {

		return getPersistence().update(contactSupport, serviceContext);
	}

	/**
	 * Returns all the contact supports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contact supports
	 */
	public static List<ContactSupport> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the contact supports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @return the range of matching contact supports
	 */
	public static List<ContactSupport> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the contact supports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contact supports
	 */
	public static List<ContactSupport> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contact supports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contact supports
	 */
	public static List<ContactSupport> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ContactSupport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public static ContactSupport findByUuid_First(
			String uuid, OrderByComparator<ContactSupport> orderByComparator)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchByUuid_First(
		String uuid, OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public static ContactSupport findByUuid_Last(
			String uuid, OrderByComparator<ContactSupport> orderByComparator)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchByUuid_Last(
		String uuid, OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the contact supports before and after the current contact support in the ordered set where uuid = &#63;.
	 *
	 * @param idMessage the primary key of the current contact support
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact support
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public static ContactSupport[] findByUuid_PrevAndNext(
			long idMessage, String uuid,
			OrderByComparator<ContactSupport> orderByComparator)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUuid_PrevAndNext(
			idMessage, uuid, orderByComparator);
	}

	/**
	 * Removes all the contact supports where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of contact supports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contact supports
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the contact support where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContactSupportException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public static ContactSupport findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contact support where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contact support where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the contact support where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contact support that was removed
	 */
	public static ContactSupport removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of contact supports where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contact supports
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contact supports
	 */
	public static List<ContactSupport> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @return the range of matching contact supports
	 */
	public static List<ContactSupport> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contact supports
	 */
	public static List<ContactSupport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contact supports
	 */
	public static List<ContactSupport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ContactSupport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public static ContactSupport findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ContactSupport> orderByComparator)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public static ContactSupport findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ContactSupport> orderByComparator)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the contact supports before and after the current contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idMessage the primary key of the current contact support
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact support
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public static ContactSupport[] findByUuid_C_PrevAndNext(
			long idMessage, String uuid, long companyId,
			OrderByComparator<ContactSupport> orderByComparator)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idMessage, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the contact supports where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contact supports
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the contact support in the entity cache if it is enabled.
	 *
	 * @param contactSupport the contact support
	 */
	public static void cacheResult(ContactSupport contactSupport) {
		getPersistence().cacheResult(contactSupport);
	}

	/**
	 * Caches the contact supports in the entity cache if it is enabled.
	 *
	 * @param contactSupports the contact supports
	 */
	public static void cacheResult(List<ContactSupport> contactSupports) {
		getPersistence().cacheResult(contactSupports);
	}

	/**
	 * Creates a new contact support with the primary key. Does not add the contact support to the database.
	 *
	 * @param idMessage the primary key for the new contact support
	 * @return the new contact support
	 */
	public static ContactSupport create(long idMessage) {
		return getPersistence().create(idMessage);
	}

	/**
	 * Removes the contact support with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support that was removed
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public static ContactSupport remove(long idMessage)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().remove(idMessage);
	}

	public static ContactSupport updateImpl(ContactSupport contactSupport) {
		return getPersistence().updateImpl(contactSupport);
	}

	/**
	 * Returns the contact support with the primary key or throws a <code>NoSuchContactSupportException</code> if it could not be found.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public static ContactSupport findByPrimaryKey(long idMessage)
		throws event.obs.exception.NoSuchContactSupportException {

		return getPersistence().findByPrimaryKey(idMessage);
	}

	/**
	 * Returns the contact support with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support, or <code>null</code> if a contact support with the primary key could not be found
	 */
	public static ContactSupport fetchByPrimaryKey(long idMessage) {
		return getPersistence().fetchByPrimaryKey(idMessage);
	}

	/**
	 * Returns all the contact supports.
	 *
	 * @return the contact supports
	 */
	public static List<ContactSupport> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contact supports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @return the range of contact supports
	 */
	public static List<ContactSupport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contact supports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contact supports
	 */
	public static List<ContactSupport> findAll(
		int start, int end,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contact supports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of contact supports
	 */
	public static List<ContactSupport> findAll(
		int start, int end, OrderByComparator<ContactSupport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the contact supports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contact supports.
	 *
	 * @return the number of contact supports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContactSupportPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ContactSupportPersistence _persistence;

}