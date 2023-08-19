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

import event.obs.exception.NoSuchEvenementObsException;
import event.obs.model.EvenementObs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the evenement obs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObsUtil
 * @generated
 */
@ProviderType
public interface EvenementObsPersistence extends BasePersistence<EvenementObs> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EvenementObsUtil} to access the evenement obs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the evenement obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching evenement obses
	 */
	public java.util.List<EvenementObs> findByUuid(String uuid);

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
	public java.util.List<EvenementObs> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<EvenementObs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

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
	public java.util.List<EvenementObs> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

	/**
	 * Returns the evenement obses before and after the current evenement obs in the ordered set where uuid = &#63;.
	 *
	 * @param idEvent the primary key of the current evenement obs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public EvenementObs[] findByUuid_PrevAndNext(
			long idEvent, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Removes all the evenement obses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of evenement obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching evenement obses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the evenement obs where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEvenementObsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByUUID_G(String uuid, long groupId)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the evenement obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the evenement obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the evenement obs where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the evenement obs that was removed
	 */
	public EvenementObs removeByUUID_G(String uuid, long groupId)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the number of evenement obses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching evenement obses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching evenement obses
	 */
	public java.util.List<EvenementObs> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<EvenementObs> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<EvenementObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

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
	public java.util.List<EvenementObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the first evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the last evenement obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

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
	public EvenementObs[] findByUuid_C_PrevAndNext(
			long idEvent, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Removes all the evenement obses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of evenement obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching evenement obses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the evenement obses where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @return the matching evenement obses
	 */
	public java.util.List<EvenementObs> findByEntites(String entityName);

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
	public java.util.List<EvenementObs> findByEntites(
		String entityName, int start, int end);

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
	public java.util.List<EvenementObs> findByEntites(
		String entityName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

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
	public java.util.List<EvenementObs> findByEntites(
		String entityName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByEntites_First(
			String entityName,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the first evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByEntites_First(
		String entityName,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

	/**
	 * Returns the last evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs
	 * @throws NoSuchEvenementObsException if a matching evenement obs could not be found
	 */
	public EvenementObs findByEntites_Last(
			String entityName,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the last evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public EvenementObs fetchByEntites_Last(
		String entityName,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

	/**
	 * Returns the evenement obses before and after the current evenement obs in the ordered set where entityName = &#63;.
	 *
	 * @param idEvent the primary key of the current evenement obs
	 * @param entityName the entity name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public EvenementObs[] findByEntites_PrevAndNext(
			long idEvent, String entityName,
			com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
				orderByComparator)
		throws NoSuchEvenementObsException;

	/**
	 * Removes all the evenement obses where entityName = &#63; from the database.
	 *
	 * @param entityName the entity name
	 */
	public void removeByEntites(String entityName);

	/**
	 * Returns the number of evenement obses where entityName = &#63;.
	 *
	 * @param entityName the entity name
	 * @return the number of matching evenement obses
	 */
	public int countByEntites(String entityName);

	/**
	 * Caches the evenement obs in the entity cache if it is enabled.
	 *
	 * @param evenementObs the evenement obs
	 */
	public void cacheResult(EvenementObs evenementObs);

	/**
	 * Caches the evenement obses in the entity cache if it is enabled.
	 *
	 * @param evenementObses the evenement obses
	 */
	public void cacheResult(java.util.List<EvenementObs> evenementObses);

	/**
	 * Creates a new evenement obs with the primary key. Does not add the evenement obs to the database.
	 *
	 * @param idEvent the primary key for the new evenement obs
	 * @return the new evenement obs
	 */
	public EvenementObs create(long idEvent);

	/**
	 * Removes the evenement obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs that was removed
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public EvenementObs remove(long idEvent) throws NoSuchEvenementObsException;

	public EvenementObs updateImpl(EvenementObs evenementObs);

	/**
	 * Returns the evenement obs with the primary key or throws a <code>NoSuchEvenementObsException</code> if it could not be found.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs
	 * @throws NoSuchEvenementObsException if a evenement obs with the primary key could not be found
	 */
	public EvenementObs findByPrimaryKey(long idEvent)
		throws NoSuchEvenementObsException;

	/**
	 * Returns the evenement obs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs, or <code>null</code> if a evenement obs with the primary key could not be found
	 */
	public EvenementObs fetchByPrimaryKey(long idEvent);

	/**
	 * Returns all the evenement obses.
	 *
	 * @return the evenement obses
	 */
	public java.util.List<EvenementObs> findAll();

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
	public java.util.List<EvenementObs> findAll(int start, int end);

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
	public java.util.List<EvenementObs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator);

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
	public java.util.List<EvenementObs> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EvenementObs>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the evenement obses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of evenement obses.
	 *
	 * @return the number of evenement obses
	 */
	public int countAll();

}