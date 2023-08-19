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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import event.obs.model.Messaging;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Messaging. This utility wraps
 * <code>event.obs.service.impl.MessagingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MessagingLocalService
 * @generated
 */
public class MessagingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.MessagingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static Messaging addMessaging(Messaging messaging) {
		return getService().addMessaging(messaging);
	}

	/**
	 * Creates a new messaging with the primary key. Does not add the messaging to the database.
	 *
	 * @param idMessage the primary key for the new messaging
	 * @return the new messaging
	 */
	public static Messaging createMessaging(long idMessage) {
		return getService().createMessaging(idMessage);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static Messaging deleteMessaging(long idMessage)
		throws PortalException {

		return getService().deleteMessaging(idMessage);
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
	public static Messaging deleteMessaging(Messaging messaging) {
		return getService().deleteMessaging(messaging);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Messaging fetchMessaging(long idMessage) {
		return getService().fetchMessaging(idMessage);
	}

	/**
	 * Returns the messaging matching the UUID and group.
	 *
	 * @param uuid the messaging's UUID
	 * @param groupId the primary key of the group
	 * @return the matching messaging, or <code>null</code> if a matching messaging could not be found
	 */
	public static Messaging fetchMessagingByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMessagingByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the messaging with the primary key.
	 *
	 * @param idMessage the primary key of the messaging
	 * @return the messaging
	 * @throws PortalException if a messaging with the primary key could not be found
	 */
	public static Messaging getMessaging(long idMessage)
		throws PortalException {

		return getService().getMessaging(idMessage);
	}

	/**
	 * Returns the messaging matching the UUID and group.
	 *
	 * @param uuid the messaging's UUID
	 * @param groupId the primary key of the group
	 * @return the matching messaging
	 * @throws PortalException if a matching messaging could not be found
	 */
	public static Messaging getMessagingByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMessagingByUuidAndGroupId(uuid, groupId);
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
	public static List<Messaging> getMessagings(int start, int end) {
		return getService().getMessagings(start, end);
	}

	/**
	 * Returns all the messagings matching the UUID and company.
	 *
	 * @param uuid the UUID of the messagings
	 * @param companyId the primary key of the company
	 * @return the matching messagings, or an empty list if no matches were found
	 */
	public static List<Messaging> getMessagingsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMessagingsByUuidAndCompanyId(uuid, companyId);
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
	public static List<Messaging> getMessagingsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Messaging> orderByComparator) {

		return getService().getMessagingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of messagings.
	 *
	 * @return the number of messagings
	 */
	public static int getMessagingsCount() {
		return getService().getMessagingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static Messaging updateMessaging(Messaging messaging) {
		return getService().updateMessaging(messaging);
	}

	public static MessagingLocalService getService() {
		return _service;
	}

	private static volatile MessagingLocalService _service;

}