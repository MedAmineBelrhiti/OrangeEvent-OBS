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

import event.obs.exception.NoSuchEntiteException;
import event.obs.model.Entite;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the entite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntiteUtil
 * @generated
 */
@ProviderType
public interface EntitePersistence extends BasePersistence<Entite> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EntiteUtil} to access the entite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the entites where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching entites
	 */
	public java.util.List<Entite> findByUuid(String uuid);

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
	public java.util.List<Entite> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Entite> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

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
	public java.util.List<Entite> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public Entite findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entite>
				orderByComparator)
		throws NoSuchEntiteException;

	/**
	 * Returns the first entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public Entite fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

	/**
	 * Returns the last entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public Entite findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entite>
				orderByComparator)
		throws NoSuchEntiteException;

	/**
	 * Returns the last entite in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public Entite fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

	/**
	 * Returns the entites before and after the current entite in the ordered set where uuid = &#63;.
	 *
	 * @param idEntite the primary key of the current entite
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next entite
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public Entite[] findByUuid_PrevAndNext(
			long idEntite, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Entite>
				orderByComparator)
		throws NoSuchEntiteException;

	/**
	 * Removes all the entites where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of entites where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching entites
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the entite where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntiteException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public Entite findByUUID_G(String uuid, long groupId)
		throws NoSuchEntiteException;

	/**
	 * Returns the entite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public Entite fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the entite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public Entite fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the entite where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the entite that was removed
	 */
	public Entite removeByUUID_G(String uuid, long groupId)
		throws NoSuchEntiteException;

	/**
	 * Returns the number of entites where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching entites
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the entites where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching entites
	 */
	public java.util.List<Entite> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Entite> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Entite> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

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
	public java.util.List<Entite> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public Entite findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Entite>
				orderByComparator)
		throws NoSuchEntiteException;

	/**
	 * Returns the first entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public Entite fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

	/**
	 * Returns the last entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite
	 * @throws NoSuchEntiteException if a matching entite could not be found
	 */
	public Entite findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Entite>
				orderByComparator)
		throws NoSuchEntiteException;

	/**
	 * Returns the last entite in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching entite, or <code>null</code> if a matching entite could not be found
	 */
	public Entite fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

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
	public Entite[] findByUuid_C_PrevAndNext(
			long idEntite, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Entite>
				orderByComparator)
		throws NoSuchEntiteException;

	/**
	 * Removes all the entites where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of entites where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching entites
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the entite in the entity cache if it is enabled.
	 *
	 * @param entite the entite
	 */
	public void cacheResult(Entite entite);

	/**
	 * Caches the entites in the entity cache if it is enabled.
	 *
	 * @param entites the entites
	 */
	public void cacheResult(java.util.List<Entite> entites);

	/**
	 * Creates a new entite with the primary key. Does not add the entite to the database.
	 *
	 * @param idEntite the primary key for the new entite
	 * @return the new entite
	 */
	public Entite create(long idEntite);

	/**
	 * Removes the entite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite that was removed
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public Entite remove(long idEntite) throws NoSuchEntiteException;

	public Entite updateImpl(Entite entite);

	/**
	 * Returns the entite with the primary key or throws a <code>NoSuchEntiteException</code> if it could not be found.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite
	 * @throws NoSuchEntiteException if a entite with the primary key could not be found
	 */
	public Entite findByPrimaryKey(long idEntite) throws NoSuchEntiteException;

	/**
	 * Returns the entite with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite, or <code>null</code> if a entite with the primary key could not be found
	 */
	public Entite fetchByPrimaryKey(long idEntite);

	/**
	 * Returns all the entites.
	 *
	 * @return the entites
	 */
	public java.util.List<Entite> findAll();

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
	public java.util.List<Entite> findAll(int start, int end);

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
	public java.util.List<Entite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator);

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
	public java.util.List<Entite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Entite>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the entites from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of entites.
	 *
	 * @return the number of entites
	 */
	public int countAll();

}