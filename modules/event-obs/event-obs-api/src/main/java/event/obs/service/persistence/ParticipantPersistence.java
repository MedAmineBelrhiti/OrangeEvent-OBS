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

import event.obs.exception.NoSuchParticipantException;
import event.obs.model.Participant;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the participant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantUtil
 * @generated
 */
@ProviderType
public interface ParticipantPersistence extends BasePersistence<Participant> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParticipantUtil} to access the participant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the participants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching participants
	 */
	public java.util.List<Participant> findByUuid(String uuid);

	/**
	 * Returns a range of all the participants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of matching participants
	 */
	public java.util.List<Participant> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the participants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching participants
	 */
	public java.util.List<Participant> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the participants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching participants
	 */
	public java.util.List<Participant> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first participant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participant
	 * @throws NoSuchParticipantException if a matching participant could not be found
	 */
	public Participant findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Participant>
				orderByComparator)
		throws NoSuchParticipantException;

	/**
	 * Returns the first participant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participant, or <code>null</code> if a matching participant could not be found
	 */
	public Participant fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns the last participant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participant
	 * @throws NoSuchParticipantException if a matching participant could not be found
	 */
	public Participant findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Participant>
				orderByComparator)
		throws NoSuchParticipantException;

	/**
	 * Returns the last participant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participant, or <code>null</code> if a matching participant could not be found
	 */
	public Participant fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns the participants before and after the current participant in the ordered set where uuid = &#63;.
	 *
	 * @param idParticipant the primary key of the current participant
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next participant
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public Participant[] findByUuid_PrevAndNext(
			long idParticipant, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Participant>
				orderByComparator)
		throws NoSuchParticipantException;

	/**
	 * Removes all the participants where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of participants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching participants
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the participant where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchParticipantException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching participant
	 * @throws NoSuchParticipantException if a matching participant could not be found
	 */
	public Participant findByUUID_G(String uuid, long groupId)
		throws NoSuchParticipantException;

	/**
	 * Returns the participant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching participant, or <code>null</code> if a matching participant could not be found
	 */
	public Participant fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the participant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching participant, or <code>null</code> if a matching participant could not be found
	 */
	public Participant fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the participant where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the participant that was removed
	 */
	public Participant removeByUUID_G(String uuid, long groupId)
		throws NoSuchParticipantException;

	/**
	 * Returns the number of participants where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching participants
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the participants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching participants
	 */
	public java.util.List<Participant> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the participants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of matching participants
	 */
	public java.util.List<Participant> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the participants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching participants
	 */
	public java.util.List<Participant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the participants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching participants
	 */
	public java.util.List<Participant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first participant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participant
	 * @throws NoSuchParticipantException if a matching participant could not be found
	 */
	public Participant findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Participant>
				orderByComparator)
		throws NoSuchParticipantException;

	/**
	 * Returns the first participant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching participant, or <code>null</code> if a matching participant could not be found
	 */
	public Participant fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns the last participant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participant
	 * @throws NoSuchParticipantException if a matching participant could not be found
	 */
	public Participant findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Participant>
				orderByComparator)
		throws NoSuchParticipantException;

	/**
	 * Returns the last participant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching participant, or <code>null</code> if a matching participant could not be found
	 */
	public Participant fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns the participants before and after the current participant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idParticipant the primary key of the current participant
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next participant
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public Participant[] findByUuid_C_PrevAndNext(
			long idParticipant, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Participant>
				orderByComparator)
		throws NoSuchParticipantException;

	/**
	 * Removes all the participants where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of participants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching participants
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the participant in the entity cache if it is enabled.
	 *
	 * @param participant the participant
	 */
	public void cacheResult(Participant participant);

	/**
	 * Caches the participants in the entity cache if it is enabled.
	 *
	 * @param participants the participants
	 */
	public void cacheResult(java.util.List<Participant> participants);

	/**
	 * Creates a new participant with the primary key. Does not add the participant to the database.
	 *
	 * @param idParticipant the primary key for the new participant
	 * @return the new participant
	 */
	public Participant create(long idParticipant);

	/**
	 * Removes the participant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant that was removed
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public Participant remove(long idParticipant)
		throws NoSuchParticipantException;

	public Participant updateImpl(Participant participant);

	/**
	 * Returns the participant with the primary key or throws a <code>NoSuchParticipantException</code> if it could not be found.
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public Participant findByPrimaryKey(long idParticipant)
		throws NoSuchParticipantException;

	/**
	 * Returns the participant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant, or <code>null</code> if a participant with the primary key could not be found
	 */
	public Participant fetchByPrimaryKey(long idParticipant);

	/**
	 * Returns all the participants.
	 *
	 * @return the participants
	 */
	public java.util.List<Participant> findAll();

	/**
	 * Returns a range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of participants
	 */
	public java.util.List<Participant> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of participants
	 */
	public java.util.List<Participant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of participants
	 */
	public java.util.List<Participant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the participants from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of participants.
	 *
	 * @return the number of participants
	 */
	public int countAll();

}