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

import event.obs.model.ContactSupport;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ContactSupport. This utility wraps
 * <code>event.obs.service.impl.ContactSupportLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupportLocalService
 * @generated
 */
public class ContactSupportLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.ContactSupportLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the contact support to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactSupportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contactSupport the contact support
	 * @return the contact support that was added
	 */
	public static ContactSupport addContactSupport(
		ContactSupport contactSupport) {

		return getService().addContactSupport(contactSupport);
	}

	public static ContactSupport addReclamataion(
		String nom, String prenom, String entite, String objet, String email,
		String telephone, String message) {

		return getService().addReclamataion(
			nom, prenom, entite, objet, email, telephone, message);
	}

	/**
	 * Creates a new contact support with the primary key. Does not add the contact support to the database.
	 *
	 * @param idMessage the primary key for the new contact support
	 * @return the new contact support
	 */
	public static ContactSupport createContactSupport(long idMessage) {
		return getService().createContactSupport(idMessage);
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
	 * Deletes the contact support from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactSupportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contactSupport the contact support
	 * @return the contact support that was removed
	 */
	public static ContactSupport deleteContactSupport(
		ContactSupport contactSupport) {

		return getService().deleteContactSupport(contactSupport);
	}

	/**
	 * Deletes the contact support with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactSupportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support that was removed
	 * @throws PortalException if a contact support with the primary key could not be found
	 */
	public static ContactSupport deleteContactSupport(long idMessage)
		throws PortalException {

		return getService().deleteContactSupport(idMessage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ContactSupportModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ContactSupportModelImpl</code>.
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

	public static ContactSupport fetchContactSupport(long idMessage) {
		return getService().fetchContactSupport(idMessage);
	}

	/**
	 * Returns the contact support matching the UUID and group.
	 *
	 * @param uuid the contact support's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	public static ContactSupport fetchContactSupportByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchContactSupportByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the contact support with the primary key.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support
	 * @throws PortalException if a contact support with the primary key could not be found
	 */
	public static ContactSupport getContactSupport(long idMessage)
		throws PortalException {

		return getService().getContactSupport(idMessage);
	}

	/**
	 * Returns the contact support matching the UUID and group.
	 *
	 * @param uuid the contact support's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contact support
	 * @throws PortalException if a matching contact support could not be found
	 */
	public static ContactSupport getContactSupportByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getContactSupportByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the contact supports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ContactSupportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @return the range of contact supports
	 */
	public static List<ContactSupport> getContactSupports(int start, int end) {
		return getService().getContactSupports(start, end);
	}

	/**
	 * Returns all the contact supports matching the UUID and company.
	 *
	 * @param uuid the UUID of the contact supports
	 * @param companyId the primary key of the company
	 * @return the matching contact supports, or an empty list if no matches were found
	 */
	public static List<ContactSupport> getContactSupportsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getContactSupportsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of contact supports matching the UUID and company.
	 *
	 * @param uuid the UUID of the contact supports
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of contact supports
	 * @param end the upper bound of the range of contact supports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching contact supports, or an empty list if no matches were found
	 */
	public static List<ContactSupport> getContactSupportsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ContactSupport> orderByComparator) {

		return getService().getContactSupportsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contact supports.
	 *
	 * @return the number of contact supports
	 */
	public static int getContactSupportsCount() {
		return getService().getContactSupportsCount();
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
	 * Updates the contact support in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContactSupportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contactSupport the contact support
	 * @return the contact support that was updated
	 */
	public static ContactSupport updateContactSupport(
		ContactSupport contactSupport) {

		return getService().updateContactSupport(contactSupport);
	}

	public static ContactSupportLocalService getService() {
		return _service;
	}

	private static volatile ContactSupportLocalService _service;

}