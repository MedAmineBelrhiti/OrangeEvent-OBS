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

import event.obs.model.EvenementObs;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the evenement obs service. This utility wraps <code>event.obs.service.persistence.impl.EvenementObsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObsPersistence
 * @generated
 */
public class EvenementObsUtil {

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
	public static void clearCache(EvenementObs evenementObs) {
		getPersistence().clearCache(evenementObs);
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
	public static Map<Serializable, EvenementObs> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EvenementObs> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EvenementObs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EvenementObs> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EvenementObs update(EvenementObs evenementObs) {
		return getPersistence().update(evenementObs);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EvenementObs update(
		EvenementObs evenementObs, ServiceContext serviceContext) {

		return getPersistence().update(evenementObs, serviceContext);
	}

	/**
	 * Returns all the evenement obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching evenement obses
	 */
	public static List<EvenementObs> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the evenement obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @return the range of matching evenement obses
	 */
	public static List<EvenementObs> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the evenement obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evenement obses
	 */
	public static List<EvenementObs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evenement obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evenement obses
	 */
	public static List<EvenementObs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByUuid_First(
			String uuid, OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByUuid_First(
		String uuid, OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByUuid_Last(
			String uuid, OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByUuid_Last(
		String uuid, OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the evenement obses before and after the current evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param idEvent the primary key of the current evenement obs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs[] findByUuid_PrevAndNext(
			long idEvent, String uuid,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUuid_PrevAndNext(
			idEvent, uuid, orderByComparator);
	}

	/**
	 * Removes all the evenement obses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of evenement obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching evenement obses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the evenement obs where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEvenementObsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the evenement obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the evenement obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the evenement obs where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the evenement obs that was removed
	 */
	public static EvenementObs removeByUUID_G(String uuid, long groupId)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of evenement obses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching evenement obses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching evenement obses
	 */
	public static List<EvenementObs> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @return the range of matching evenement obses
	 */
	public static List<EvenementObs> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evenement obses
	 */
	public static List<EvenementObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evenement obses
	 */
	public static List<EvenementObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the evenement obses before and after the current evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idEvent the primary key of the current evenement obs
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs[] findByUuid_C_PrevAndNext(
			long idEvent, String uuid, long companyId,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idEvent, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the evenement obses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching evenement obses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the evenement obses where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @return the matching evenement obses
	 */
	public static List<EvenementObs> findByEntites(String entityName) {
		return getPersistence().findByEntites(entityName);
	}

	/**
	 * Returns a range of all the evenement obses where entityName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param entityName the entity name
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @return the range of matching evenement obses
	 */
	public static List<EvenementObs> findByEntites(
		String entityName, int start, int end) {

		return getPersistence().findByEntites(entityName, start, end);
	}

	/**
	 * Returns an ordered range of all the evenement obses where entityName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param entityName the entity name
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching evenement obses
	 */
	public static List<EvenementObs> findByEntites(
		String entityName, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().findByEntites(
			entityName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evenement obses where entityName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param entityName the entity name
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching evenement obses
	 */
	public static List<EvenementObs> findByEntites(
		String entityName, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEntites(
			entityName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByEntites_First(
			String entityName,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByEntites_First(
			entityName, orderByComparator);
	}

	/**
	 * Returns the first evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByEntites_First(
		String entityName, OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().fetchByEntites_First(
			entityName, orderByComparator);
	}

	/**
	 * Returns the last evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public static EvenementObs findByEntites_Last(
			String entityName,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByEntites_Last(
			entityName, orderByComparator);
	}

	/**
	 * Returns the last evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchByEntites_Last(
		String entityName, OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().fetchByEntites_Last(
			entityName, orderByComparator);
	}

	/**
	 * Returns the evenement obses before and after the current evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param idEvent the primary key of the current evenement obs
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs[] findByEntites_PrevAndNext(
			long idEvent, String entityName,
			OrderByComparator<EvenementObs> orderByComparator)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByEntites_PrevAndNext(
			idEvent, entityName, orderByComparator);
	}

	/**
	 * Removes all the evenement obses where entityName = &#63; from the database.
	 *
	 * @param entityName the entity name
	 */
	public static void removeByEntites(String entityName) {
		getPersistence().removeByEntites(entityName);
	}

	/**
	 * Returns the number of evenement obses where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @return the number of matching evenement obses
	 */
	public static int countByEntites(String entityName) {
		return getPersistence().countByEntites(entityName);
	}

	/**
	 * Caches the evenement obs in the entity cache if it is enabled.
	 *
	 * @param evenementObs the evenement obs
	 */
	public static void cacheResult(EvenementObs evenementObs) {
		getPersistence().cacheResult(evenementObs);
	}

	/**
	 * Caches the evenement obses in the entity cache if it is enabled.
	 *
	 * @param evenementObses the evenement obses
	 */
	public static void cacheResult(List<EvenementObs> evenementObses) {
		getPersistence().cacheResult(evenementObses);
	}

	/**
	 * Creates a new evenement obs with the primary key. Does not add the evenement obs to the database.
	 *
	 * @param idEvent the primary key for the new evenement obs
	 * @return the new evenement obs
	 */
	public static EvenementObs create(long idEvent) {
		return getPersistence().create(idEvent);
	}

	/**
	 * Removes the evenement obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs that was removed
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs remove(long idEvent)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().remove(idEvent);
	}

	public static EvenementObs updateImpl(EvenementObs evenementObs) {
		return getPersistence().updateImpl(evenementObs);
	}

	/**
	 * Returns the evenement obs with the primary key or throws a <code>NoSuchEvenementObsException</code> if it could not be found.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs findByPrimaryKey(long idEvent)
		throws event.obs.exception.NoSuchEvenementObsException {

		return getPersistence().findByPrimaryKey(idEvent);
	}

	/**
	 * Returns the evenement obs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs, or <code>null</code> if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs fetchByPrimaryKey(long idEvent) {
		return getPersistence().fetchByPrimaryKey(idEvent);
	}

	/**
	 * Returns all the evenement obses.
	 *
	 * @return the evenement obses
	 */
	public static List<EvenementObs> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the evenement obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @return the range of evenement obses
	 */
	public static List<EvenementObs> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the evenement obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of evenement obses
	 */
	public static List<EvenementObs> findAll(
		int start, int end, OrderByComparator<EvenementObs> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the evenement obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of evenement obses
	 */
	public static List<EvenementObs> findAll(
		int start, int end, OrderByComparator<EvenementObs> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the evenement obses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of evenement obses.
	 *
	 * @return the number of evenement obses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EvenementObsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EvenementObsPersistence _persistence;

}