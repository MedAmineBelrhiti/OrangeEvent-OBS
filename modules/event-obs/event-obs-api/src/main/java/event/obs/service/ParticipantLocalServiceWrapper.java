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

package event.obs.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ParticipantLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantLocalService
 * @generated
 */
public class ParticipantLocalServiceWrapper
	implements ParticipantLocalService,
			   ServiceWrapper<ParticipantLocalService> {

	public ParticipantLocalServiceWrapper() {
		this(null);
	}

	public ParticipantLocalServiceWrapper(
		ParticipantLocalService participantLocalService) {

		_participantLocalService = participantLocalService;
	}

	@Override
	public event.obs.model.Participant addParticipant(
		long userId, String entite) {

		return _participantLocalService.addParticipant(userId, entite);
	}

	/**
	 * Adds the participant to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was added
	 */
	@Override
	public event.obs.model.Participant addParticipant(
		event.obs.model.Participant participant) {

		return _participantLocalService.addParticipant(participant);
	}

	/**
	 * Creates a new participant with the primary key. Does not add the participant to the database.
	 *
	 * @param idParticipant the primary key for the new participant
	 * @return the new participant
	 */
	@Override
	public event.obs.model.Participant createParticipant(long idParticipant) {
		return _participantLocalService.createParticipant(idParticipant);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the participant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant that was removed
	 * @throws PortalException if a participant with the primary key could not be found
	 */
	@Override
	public event.obs.model.Participant deleteParticipant(long idParticipant)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.deleteParticipant(idParticipant);
	}

	/**
	 * Deletes the participant from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was removed
	 */
	@Override
	public event.obs.model.Participant deleteParticipant(
		event.obs.model.Participant participant) {

		return _participantLocalService.deleteParticipant(participant);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _participantLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _participantLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _participantLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _participantLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _participantLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _participantLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _participantLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _participantLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.Participant fetchParticipant(long idParticipant) {
		return _participantLocalService.fetchParticipant(idParticipant);
	}

	/**
	 * Returns the participant matching the UUID and group.
	 *
	 * @param uuid the participant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching participant, or <code>null</code> if a matching participant could not be found
	 */
	@Override
	public event.obs.model.Participant fetchParticipantByUuidAndGroupId(
		String uuid, long groupId) {

		return _participantLocalService.fetchParticipantByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _participantLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _participantLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _participantLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _participantLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the participant with the primary key.
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant
	 * @throws PortalException if a participant with the primary key could not be found
	 */
	@Override
	public event.obs.model.Participant getParticipant(long idParticipant)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.getParticipant(idParticipant);
	}

	/**
	 * Returns the participant matching the UUID and group.
	 *
	 * @param uuid the participant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching participant
	 * @throws PortalException if a matching participant could not be found
	 */
	@Override
	public event.obs.model.Participant getParticipantByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.getParticipantByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of participants
	 */
	@Override
	public java.util.List<event.obs.model.Participant> getParticipants(
		int start, int end) {

		return _participantLocalService.getParticipants(start, end);
	}

	/**
	 * Returns all the participants matching the UUID and company.
	 *
	 * @param uuid the UUID of the participants
	 * @param companyId the primary key of the company
	 * @return the matching participants, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Participant>
		getParticipantsByUuidAndCompanyId(String uuid, long companyId) {

		return _participantLocalService.getParticipantsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of participants matching the UUID and company.
	 *
	 * @param uuid the UUID of the participants
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching participants, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Participant>
		getParticipantsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.Participant> orderByComparator) {

		return _participantLocalService.getParticipantsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of participants.
	 *
	 * @return the number of participants
	 */
	@Override
	public int getParticipantsCount() {
		return _participantLocalService.getParticipantsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the participant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was updated
	 */
	@Override
	public event.obs.model.Participant updateParticipant(
		event.obs.model.Participant participant) {

		return _participantLocalService.updateParticipant(participant);
	}

	@Override
	public ParticipantLocalService getWrappedService() {
		return _participantLocalService;
	}

	@Override
	public void setWrappedService(
		ParticipantLocalService participantLocalService) {

		_participantLocalService = participantLocalService;
	}

	private ParticipantLocalService _participantLocalService;

}