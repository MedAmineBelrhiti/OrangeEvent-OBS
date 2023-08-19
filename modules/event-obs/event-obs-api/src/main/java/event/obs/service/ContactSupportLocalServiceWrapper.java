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
 * Provides a wrapper for {@link ContactSupportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupportLocalService
 * @generated
 */
public class ContactSupportLocalServiceWrapper
	implements ContactSupportLocalService,
			   ServiceWrapper<ContactSupportLocalService> {

	public ContactSupportLocalServiceWrapper() {
		this(null);
	}

	public ContactSupportLocalServiceWrapper(
		ContactSupportLocalService contactSupportLocalService) {

		_contactSupportLocalService = contactSupportLocalService;
	}

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
	@Override
	public event.obs.model.ContactSupport addContactSupport(
		event.obs.model.ContactSupport contactSupport) {

		return _contactSupportLocalService.addContactSupport(contactSupport);
	}

	@Override
	public event.obs.model.ContactSupport addReclamataion(
		String nom, String prenom, String entite, String objet, String email,
		String telephone, String message) {

		return _contactSupportLocalService.addReclamataion(
			nom, prenom, entite, objet, email, telephone, message);
	}

	/**
	 * Creates a new contact support with the primary key. Does not add the contact support to the database.
	 *
	 * @param idMessage the primary key for the new contact support
	 * @return the new contact support
	 */
	@Override
	public event.obs.model.ContactSupport createContactSupport(long idMessage) {
		return _contactSupportLocalService.createContactSupport(idMessage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactSupportLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public event.obs.model.ContactSupport deleteContactSupport(
		event.obs.model.ContactSupport contactSupport) {

		return _contactSupportLocalService.deleteContactSupport(contactSupport);
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
	@Override
	public event.obs.model.ContactSupport deleteContactSupport(long idMessage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactSupportLocalService.deleteContactSupport(idMessage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactSupportLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _contactSupportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _contactSupportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contactSupportLocalService.dynamicQuery();
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

		return _contactSupportLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _contactSupportLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _contactSupportLocalService.dynamicQuery(
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

		return _contactSupportLocalService.dynamicQueryCount(dynamicQuery);
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

		return _contactSupportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.ContactSupport fetchContactSupport(long idMessage) {
		return _contactSupportLocalService.fetchContactSupport(idMessage);
	}

	/**
	 * Returns the contact support matching the UUID and group.
	 *
	 * @param uuid the contact support's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contact support, or <code>null</code> if a matching contact support could not be found
	 */
	@Override
	public event.obs.model.ContactSupport fetchContactSupportByUuidAndGroupId(
		String uuid, long groupId) {

		return _contactSupportLocalService.fetchContactSupportByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _contactSupportLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the contact support with the primary key.
	 *
	 * @param idMessage the primary key of the contact support
	 * @return the contact support
	 * @throws PortalException if a contact support with the primary key could not be found
	 */
	@Override
	public event.obs.model.ContactSupport getContactSupport(long idMessage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactSupportLocalService.getContactSupport(idMessage);
	}

	/**
	 * Returns the contact support matching the UUID and group.
	 *
	 * @param uuid the contact support's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contact support
	 * @throws PortalException if a matching contact support could not be found
	 */
	@Override
	public event.obs.model.ContactSupport getContactSupportByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactSupportLocalService.getContactSupportByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<event.obs.model.ContactSupport> getContactSupports(
		int start, int end) {

		return _contactSupportLocalService.getContactSupports(start, end);
	}

	/**
	 * Returns all the contact supports matching the UUID and company.
	 *
	 * @param uuid the UUID of the contact supports
	 * @param companyId the primary key of the company
	 * @return the matching contact supports, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.ContactSupport>
		getContactSupportsByUuidAndCompanyId(String uuid, long companyId) {

		return _contactSupportLocalService.getContactSupportsByUuidAndCompanyId(
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
	@Override
	public java.util.List<event.obs.model.ContactSupport>
		getContactSupportsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.ContactSupport> orderByComparator) {

		return _contactSupportLocalService.getContactSupportsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contact supports.
	 *
	 * @return the number of contact supports
	 */
	@Override
	public int getContactSupportsCount() {
		return _contactSupportLocalService.getContactSupportsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _contactSupportLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _contactSupportLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contactSupportLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contactSupportLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public event.obs.model.ContactSupport updateContactSupport(
		event.obs.model.ContactSupport contactSupport) {

		return _contactSupportLocalService.updateContactSupport(contactSupport);
	}

	@Override
	public ContactSupportLocalService getWrappedService() {
		return _contactSupportLocalService;
	}

	@Override
	public void setWrappedService(
		ContactSupportLocalService contactSupportLocalService) {

		_contactSupportLocalService = contactSupportLocalService;
	}

	private ContactSupportLocalService _contactSupportLocalService;

}