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

import event.obs.model.Entite;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the entite service. This utility wraps <code>event.obs.service.persistence.impl.EntitePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntitePersistence
 * @generated
 */
public class EntiteUtil {

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
	public static void clearCache(Entite entite) {
		getPersistence().clearCache(entite);
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
	public static Map<Serializable, Entite> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entite> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Entite> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Entite update(Entite entite) {
		return getPersistence().update(entite);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Entite update(Entite entite, ServiceContext serviceContext) {
		return getPersistence().update(entite, serviceContext);
	}

	/**
	 * Returns all the entites where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entites
	 */
	public static List<Entite> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the entites where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @return the range of matching entites
	 */
	public static List<Entite> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the entites where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entites
	 */
	public static List<Entite> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entite> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entites where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entites
	 */
	public static List<Entite> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Entite> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public static Entite findByUuid_First(
			String uuid, OrderByComparator<Entite> orderByComparator)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public static Entite fetchByUuid_First(
		String uuid, OrderByComparator<Entite> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public static Entite findByUuid_Last(
			String uuid, OrderByComparator<Entite> orderByComparator)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public static Entite fetchByUuid_Last(
		String uuid, OrderByComparator<Entite> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the entites before and after the current entite in the ordered set where uuid = &#63;.
	 *
	 * @param idEntite the primary key of the current entite
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entite
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public static Entite[] findByUuid_PrevAndNext(
			long idEntite, String uuid,
			OrderByComparator<Entite> orderByComparator)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUuid_PrevAndNext(
			idEntite, uuid, orderByComparator);
	}

	/**
	 * Removes all the entites where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of entites where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entites
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the entite where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntiteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public static Entite findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the entite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public static Entite fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the entite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public static Entite fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the entite where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the entite that was removed
	 */
	public static Entite removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of entites where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching entites
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the entites where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching entites
	 */
	public static List<Entite> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the entites where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @return the range of matching entites
	 */
	public static List<Entite> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the entites where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching entites
	 */
	public static List<Entite> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Entite> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entites where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching entites
	 */
	public static List<Entite> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Entite> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public static Entite findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Entite> orderByComparator)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public static Entite fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Entite> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public static Entite findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Entite> orderByComparator)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public static Entite fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Entite> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the entites before and after the current entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idEntite the primary key of the current entite
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entite
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public static Entite[] findByUuid_C_PrevAndNext(
			long idEntite, String uuid, long companyId,
			OrderByComparator<Entite> orderByComparator)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idEntite, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the entites where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of entites where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching entites
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the entite in the entity cache if it is enabled.
	 *
	 * @param entite the entite
	 */
	public static void cacheResult(Entite entite) {
		getPersistence().cacheResult(entite);
	}

	/**
	 * Caches the entites in the entity cache if it is enabled.
	 *
	 * @param entites the entites
	 */
	public static void cacheResult(List<Entite> entites) {
		getPersistence().cacheResult(entites);
	}

	/**
	 * Creates a new entite with the primary key. Does not add the entite to the database.
	 *
	 * @param idEntite the primary key for the new entite
	 * @return the new entite
	 */
	public static Entite create(long idEntite) {
		return getPersistence().create(idEntite);
	}

	/**
	 * Removes the entite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite that was removed
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public static Entite remove(long idEntite)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().remove(idEntite);
	}

	public static Entite updateImpl(Entite entite) {
		return getPersistence().updateImpl(entite);
	}

	/**
	 * Returns the entite with the primary key or throws a <code>NoSuchEntiteException</code> if it could not be found.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public static Entite findByPrimaryKey(long idEntite)
		throws event.obs.exception.NoSuchEntiteException {

		return getPersistence().findByPrimaryKey(idEntite);
	}

	/**
	 * Returns the entite with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite, or <code>null</code> if a entite with the primary key could not be found
	 */
	public static Entite fetchByPrimaryKey(long idEntite) {
		return getPersistence().fetchByPrimaryKey(idEntite);
	}

	/**
	 * Returns all the entites.
	 *
	 * @return the entites
	 */
	public static List<Entite> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the entites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @return the range of entites
	 */
	public static List<Entite> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the entites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of entites
	 */
	public static List<Entite> findAll(
		int start, int end, OrderByComparator<Entite> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the entites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of entites
	 */
	public static List<Entite> findAll(
		int start, int end, OrderByComparator<Entite> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the entites from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of entites.
	 *
	 * @return the number of entites
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EntitePersistence getPersistence() {
		return _persistence;
	}

	private static volatile EntitePersistence _persistence;

}