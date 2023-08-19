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

import event.obs.model.DemandEventObs;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the demand event obs service. This utility wraps <code>event.obs.service.persistence.impl.DemandEventObsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsPersistence
 * @generated
 */
public class DemandEventObsUtil {

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
	public static void clearCache(DemandEventObs demandEventObs) {
		getPersistence().clearCache(demandEventObs);
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
	public static Map<Serializable, DemandEventObs> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DemandEventObs> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DemandEventObs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DemandEventObs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DemandEventObs update(DemandEventObs demandEventObs) {
		return getPersistence().update(demandEventObs);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DemandEventObs update(
		DemandEventObs demandEventObs, ServiceContext serviceContext) {

		return getPersistence().update(demandEventObs, serviceContext);
	}

	/**
	 * Returns all the demand event obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the demand event obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByUuid_First(
			String uuid, OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByUuid_First(
		String uuid, OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByUuid_Last(
			String uuid, OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByUuid_Last(
		String uuid, OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs[] findByUuid_PrevAndNext(
			long idDemand, String uuid,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUuid_PrevAndNext(
			idDemand, uuid, orderByComparator);
	}

	/**
	 * Removes all the demand event obses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of demand event obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demand event obses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDemandEventObsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the demand event obs where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the demand event obs that was removed
	 */
	public static DemandEventObs removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of demand event obses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching demand event obses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demand event obses
	 */
	public static List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs[] findByUuid_C_PrevAndNext(
			long idDemand, String uuid, long companyId,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idDemand, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the demand event obses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching demand event obses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the demand event obses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching demand event obses
	 */
	public static List<DemandEventObs> findByStatus(String status) {
		return getPersistence().findByStatus(status);
	}

	/**
	 * Returns a range of all the demand event obses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of matching demand event obses
	 */
	public static List<DemandEventObs> findByStatus(
		String status, int start, int end) {

		return getPersistence().findByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the demand event obses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demand event obses
	 */
	public static List<DemandEventObs> findByStatus(
		String status, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demand event obses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demand event obses
	 */
	public static List<DemandEventObs> findByStatus(
		String status, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByStatus_First(
			String status, OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByStatus_First(
		String status, OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public static DemandEventObs findByStatus_Last(
			String status, OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchByStatus_Last(
		String status, OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where status = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs[] findByStatus_PrevAndNext(
			long idDemand, String status,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByStatus_PrevAndNext(
			idDemand, status, orderByComparator);
	}

	/**
	 * Removes all the demand event obses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeByStatus(String status) {
		getPersistence().removeByStatus(status);
	}

	/**
	 * Returns the number of demand event obses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching demand event obses
	 */
	public static int countByStatus(String status) {
		return getPersistence().countByStatus(status);
	}

	/**
	 * Caches the demand event obs in the entity cache if it is enabled.
	 *
	 * @param demandEventObs the demand event obs
	 */
	public static void cacheResult(DemandEventObs demandEventObs) {
		getPersistence().cacheResult(demandEventObs);
	}

	/**
	 * Caches the demand event obses in the entity cache if it is enabled.
	 *
	 * @param demandEventObses the demand event obses
	 */
	public static void cacheResult(List<DemandEventObs> demandEventObses) {
		getPersistence().cacheResult(demandEventObses);
	}

	/**
	 * Creates a new demand event obs with the primary key. Does not add the demand event obs to the database.
	 *
	 * @param idDemand the primary key for the new demand event obs
	 * @return the new demand event obs
	 */
	public static DemandEventObs create(long idDemand) {
		return getPersistence().create(idDemand);
	}

	/**
	 * Removes the demand event obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs that was removed
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs remove(long idDemand)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().remove(idDemand);
	}

	public static DemandEventObs updateImpl(DemandEventObs demandEventObs) {
		return getPersistence().updateImpl(demandEventObs);
	}

	/**
	 * Returns the demand event obs with the primary key or throws a <code>NoSuchDemandEventObsException</code> if it could not be found.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs findByPrimaryKey(long idDemand)
		throws event.obs.exception.NoSuchDemandEventObsException {

		return getPersistence().findByPrimaryKey(idDemand);
	}

	/**
	 * Returns the demand event obs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs, or <code>null</code> if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs fetchByPrimaryKey(long idDemand) {
		return getPersistence().fetchByPrimaryKey(idDemand);
	}

	/**
	 * Returns all the demand event obses.
	 *
	 * @return the demand event obses
	 */
	public static List<DemandEventObs> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of demand event obses
	 */
	public static List<DemandEventObs> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demand event obses
	 */
	public static List<DemandEventObs> findAll(
		int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demand event obses
	 */
	public static List<DemandEventObs> findAll(
		int start, int end, OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the demand event obses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of demand event obses.
	 *
	 * @return the number of demand event obses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DemandEventObsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DemandEventObsPersistence _persistence;

}