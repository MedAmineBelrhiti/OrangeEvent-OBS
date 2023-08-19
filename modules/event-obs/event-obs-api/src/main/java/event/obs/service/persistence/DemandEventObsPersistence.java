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

import event.obs.exception.NoSuchDemandEventObsException;
import event.obs.model.DemandEventObs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the demand event obs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsUtil
 * @generated
 */
@ProviderType
public interface DemandEventObsPersistence
	extends BasePersistence<DemandEventObs> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DemandEventObsUtil} to access the demand event obs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the demand event obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demand event obses
	 */
	public java.util.List<DemandEventObs> findByUuid(String uuid);

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
	public java.util.List<DemandEventObs> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<DemandEventObs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

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
	public java.util.List<DemandEventObs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public DemandEventObs[] findByUuid_PrevAndNext(
			long idDemand, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Removes all the demand event obses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of demand event obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demand event obses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDemandEventObsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByUUID_G(String uuid, long groupId)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the demand event obs where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the demand event obs that was removed
	 */
	public DemandEventObs removeByUUID_G(String uuid, long groupId)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the number of demand event obses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching demand event obses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching demand event obses
	 */
	public java.util.List<DemandEventObs> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

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
	public java.util.List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

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
	public DemandEventObs[] findByUuid_C_PrevAndNext(
			long idDemand, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Removes all the demand event obses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching demand event obses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the demand event obses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching demand event obses
	 */
	public java.util.List<DemandEventObs> findByStatus(String status);

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
	public java.util.List<DemandEventObs> findByStatus(
		String status, int start, int end);

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
	public java.util.List<DemandEventObs> findByStatus(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

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
	public java.util.List<DemandEventObs> findByStatus(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByStatus_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the first demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByStatus_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

	/**
	 * Returns the last demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	public DemandEventObs findByStatus_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the last demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public DemandEventObs fetchByStatus_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where status = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public DemandEventObs[] findByStatus_PrevAndNext(
			long idDemand, String status,
			com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
				orderByComparator)
		throws NoSuchDemandEventObsException;

	/**
	 * Removes all the demand event obses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(String status);

	/**
	 * Returns the number of demand event obses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching demand event obses
	 */
	public int countByStatus(String status);

	/**
	 * Caches the demand event obs in the entity cache if it is enabled.
	 *
	 * @param demandEventObs the demand event obs
	 */
	public void cacheResult(DemandEventObs demandEventObs);

	/**
	 * Caches the demand event obses in the entity cache if it is enabled.
	 *
	 * @param demandEventObses the demand event obses
	 */
	public void cacheResult(java.util.List<DemandEventObs> demandEventObses);

	/**
	 * Creates a new demand event obs with the primary key. Does not add the demand event obs to the database.
	 *
	 * @param idDemand the primary key for the new demand event obs
	 * @return the new demand event obs
	 */
	public DemandEventObs create(long idDemand);

	/**
	 * Removes the demand event obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs that was removed
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public DemandEventObs remove(long idDemand)
		throws NoSuchDemandEventObsException;

	public DemandEventObs updateImpl(DemandEventObs demandEventObs);

	/**
	 * Returns the demand event obs with the primary key or throws a <code>NoSuchDemandEventObsException</code> if it could not be found.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	public DemandEventObs findByPrimaryKey(long idDemand)
		throws NoSuchDemandEventObsException;

	/**
	 * Returns the demand event obs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs, or <code>null</code> if a demand event obs with the primary key could not be found
	 */
	public DemandEventObs fetchByPrimaryKey(long idDemand);

	/**
	 * Returns all the demand event obses.
	 *
	 * @return the demand event obses
	 */
	public java.util.List<DemandEventObs> findAll();

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
	public java.util.List<DemandEventObs> findAll(int start, int end);

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
	public java.util.List<DemandEventObs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator);

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
	public java.util.List<DemandEventObs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DemandEventObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the demand event obses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of demand event obses.
	 *
	 * @return the number of demand event obses
	 */
	public int countAll();

}