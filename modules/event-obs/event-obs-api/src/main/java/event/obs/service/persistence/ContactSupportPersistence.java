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

import event.obs.exception.NoSuchContactSupportException;
import event.obs.model.ContactSupport;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contact support service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupportUtil
 * @generated
 */
@ProviderType
public interface ContactSupportPersistence
	extends BasePersistence<ContactSupport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContactSupportUtil} to access the contact support persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contact supports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contact supports
	 */
	public java.util.List<ContactSupport> findByUuid(String uuid);

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
	public java.util.List<ContactSupport> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ContactSupport> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

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
	public java.util.List<ContactSupport> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public ContactSupport findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
				orderByComparator)
		throws NoSuchContactSupportException;

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public ContactSupport fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public ContactSupport findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
				orderByComparator)
		throws NoSuchContactSupportException;

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public ContactSupport fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

	/**
	 * Returns the contact supports before and after the current contact support in the ordered set where uuid = &#63;.
	 *
	 * @param idMessage the primary key of the current contact support
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contact support
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public ContactSupport[] findByUuid_PrevAndNext(
			long idMessage, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
				orderByComparator)
		throws NoSuchContactSupportException;

	/**
	 * Removes all the contact supports where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of contact supports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contact supports
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the contact support where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContactSupportException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public ContactSupport findByUUID_G(String uuid, long groupId)
		throws NoSuchContactSupportException;

	/**
	 * Returns the contact support where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public ContactSupport fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the contact support where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public ContactSupport fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the contact support where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contact support that was removed
	 */
	public ContactSupport removeByUUID_G(String uuid, long groupId)
		throws NoSuchContactSupportException;

	/**
	 * Returns the number of contact supports where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contact supports
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contact supports
	 */
	public java.util.List<ContactSupport> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<ContactSupport> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ContactSupport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

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
	public java.util.List<ContactSupport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public ContactSupport findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
				orderByComparator)
		throws NoSuchContactSupportException;

	/**
	 * Returns the first contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public ContactSupport fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support
	 * @throws NoSuchContactSupportException if a matching contact support could not be found
	 */
	public ContactSupport findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
				orderByComparator)
		throws NoSuchContactSupportException;

	/**
	 * Returns the last contact support in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public ContactSupport fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

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
	public ContactSupport[] findByUuid_C_PrevAndNext(
			long idMessage, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
				orderByComparator)
		throws NoSuchContactSupportException;

	/**
	 * Removes all the contact supports where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of contact supports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contact supports
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the contact support in the entity cache if it is enabled.
	 *
	 * @param contactSupport the contact support
	 */
	public void cacheResult(ContactSupport contactSupport);

	/**
	 * Caches the contact supports in the entity cache if it is enabled.
	 *
	 * @param contactSupports the contact supports
	 */
	public void cacheResult(java.util.List<ContactSupport> contactSupports);

	/**
	 * Creates a new contact support with the primary key. Does not add the contact support to the database.
	 *
	 * @param idMessage the primary key for the new contact support
	 * @return the new contact support
	 */
	public ContactSupport create(long idMessage);

	/**
	 * Removes the contact support with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support that was removed
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public ContactSupport remove(long idMessage)
		throws NoSuchContactSupportException;

	public ContactSupport updateImpl(ContactSupport contactSupport);

	/**
	 * Returns the contact support with the primary key or throws a <code>NoSuchContactSupportException</code> if it could not be found.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support
	 * @throws NoSuchContactSupportException if a contact support with the primary key could not be found
	 */
	public ContactSupport findByPrimaryKey(long idMessage)
		throws NoSuchContactSupportException;

	/**
	 * Returns the contact support with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support, or <code>null</code> if a contact support with the primary key could not be found
	 */
	public ContactSupport fetchByPrimaryKey(long idMessage);

	/**
	 * Returns all the contact supports.
	 *
	 * @return the contact supports
	 */
	public java.util.List<ContactSupport> findAll();

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
	public java.util.List<ContactSupport> findAll(int start, int end);

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
	public java.util.List<ContactSupport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator);

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
	public java.util.List<ContactSupport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContactSupport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the contact supports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contact supports.
	 *
	 * @return the number of contact supports
	 */
	public int countAll();

}