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
 * Provides a wrapper for {@link MessagingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MessagingLocalService
 * @generated
 */
public class MessagingLocalServiceWrapper
	implements MessagingLocalService, ServiceWrapper<MessagingLocalService> {

	public MessagingLocalServiceWrapper() {
		this(null);
	}

	public MessagingLocalServiceWrapper(
		MessagingLocalService messagingLocalService) {

		_messagingLocalService = messagingLocalService;
	}

	/**
	 * Adds the messaging to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MessagingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param messaging the messaging
	 * @return the messaging that was added
	 */
	@Override
	public event.obs.model.Messaging addMessaging(
		event.obs.model.Messaging messaging) {

		return _messagingLocalService.addMessaging(messaging);
	}

	/**
	 * Creates a new messaging with the primary key. Does not add the messaging to the database.
	 *
	 * @param idMessage the primary key for the new messaging
	 * @return the new messaging
	 */
	@Override
	public event.obs.model.Messaging createMessaging(long idMessage) {
		return _messagingLocalService.createMessaging(idMessage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _messagingLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the messaging with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MessagingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idMessage the primary key of the messaging
	 * @return the messaging that was removed
	 * @throws PortalException if a messaging with the primary key could not be found
	 */
	@Override
	public event.obs.model.Messaging deleteMessaging(long idMessage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _messagingLocalService.deleteMessaging(idMessage);
	}

	/**
	 * Deletes the messaging from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MessagingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param messaging the messaging
	 * @return the messaging that was removed
	 */
	@Override
	public event.obs.model.Messaging deleteMessaging(
		event.obs.model.Messaging messaging) {

		return _messagingLocalService.deleteMessaging(messaging);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _messagingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _messagingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _messagingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _messagingLocalService.dynamicQuery();
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

		return _messagingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.MessagingModelImpl</code>.
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

		return _messagingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.MessagingModelImpl</code>.
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

		return _messagingLocalService.dynamicQuery(
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

		return _messagingLocalService.dynamicQueryCount(dynamicQuery);
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

		return _messagingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.Messaging fetchMessaging(long idMessage) {
		return _messagingLocalService.fetchMessaging(idMessage);
	}

	/**
	 * Returns the messaging matching the UUID and group.
	 *
	 * @param uuid the messaging's UUID
	 * @param groupId the primary key of the group
	 * @return the matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	@Override
	public event.obs.model.Messaging fetchMessagingByUuidAndGroupId(
		String uuid, long groupId) {

		return _messagingLocalService.fetchMessagingByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _messagingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _messagingLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _messagingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the messaging with the primary key.
	 *
	 * @param idMessage the primary key of the messaging
	 * @return the messaging
	 * @throws PortalException if a messaging with the primary key could not be found
	 */
	@Override
	public event.obs.model.Messaging getMessaging(long idMessage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _messagingLocalService.getMessaging(idMessage);
	}

	/**
	 * Returns the messaging matching the UUID and group.
	 *
	 * @param uuid the messaging's UUID
	 * @param groupId the primary key of the group
	 * @return the matching messaging
	 * @throws PortalException if a matching messaging could not be found
	 */
	@Override
	public event.obs.model.Messaging getMessagingByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _messagingLocalService.getMessagingByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the messagings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.MessagingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @return the range of messagings
	 */
	@Override
	public java.util.List<event.obs.model.Messaging> getMessagings(
		int start, int end) {

		return _messagingLocalService.getMessagings(start, end);
	}

	/**
	 * Returns all the messagings matching the UUID and company.
	 *
	 * @param uuid the UUID of the messagings
	 * @param companyId the primary key of the company
	 * @return the matching messagings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Messaging>
		getMessagingsByUuidAndCompanyId(String uuid, long companyId) {

		return _messagingLocalService.getMessagingsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of messagings matching the UUID and company.
	 *
	 * @param uuid the UUID of the messagings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of messagings
	 * @param end the upper bound of the range of messagings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching messagings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Messaging>
		getMessagingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.Messaging> orderByComparator) {

		return _messagingLocalService.getMessagingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of messagings.
	 *
	 * @return the number of messagings
	 */
	@Override
	public int getMessagingsCount() {
		return _messagingLocalService.getMessagingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _messagingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _messagingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the messaging in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MessagingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param messaging the messaging
	 * @return the messaging that was updated
	 */
	@Override
	public event.obs.model.Messaging updateMessaging(
		event.obs.model.Messaging messaging) {

		return _messagingLocalService.updateMessaging(messaging);
	}

	@Override
	public MessagingLocalService getWrappedService() {
		return _messagingLocalService;
	}

	@Override
	public void setWrappedService(MessagingLocalService messagingLocalService) {
		_messagingLocalService = messagingLocalService;
	}

	private MessagingLocalService _messagingLocalService;

}