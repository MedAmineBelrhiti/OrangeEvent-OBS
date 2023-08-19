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
 * Provides a wrapper for {@link EntiteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntiteLocalService
 * @generated
 */
public class EntiteLocalServiceWrapper
	implements EntiteLocalService, ServiceWrapper<EntiteLocalService> {

	public EntiteLocalServiceWrapper() {
		this(null);
	}

	public EntiteLocalServiceWrapper(EntiteLocalService entiteLocalService) {
		_entiteLocalService = entiteLocalService;
	}

	/**
	 * Adds the entite to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entite the entite
	 * @return the entite that was added
	 */
	@Override
	public event.obs.model.Entite addEntite(event.obs.model.Entite entite) {
		return _entiteLocalService.addEntite(entite);
	}

	@Override
	public event.obs.model.Entite addEntite(String libelle) {
		return _entiteLocalService.addEntite(libelle);
	}

	/**
	 * Creates a new entite with the primary key. Does not add the entite to the database.
	 *
	 * @param idEntite the primary key for the new entite
	 * @return the new entite
	 */
	@Override
	public event.obs.model.Entite createEntite(long idEntite) {
		return _entiteLocalService.createEntite(idEntite);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entiteLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the entite from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entite the entite
	 * @return the entite that was removed
	 */
	@Override
	public event.obs.model.Entite deleteEntite(event.obs.model.Entite entite) {
		return _entiteLocalService.deleteEntite(entite);
	}

	/**
	 * Deletes the entite with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite that was removed
	 * @throws PortalException if a entite with the primary key could not be found
	 */
	@Override
	public event.obs.model.Entite deleteEntite(long idEntite)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entiteLocalService.deleteEntite(idEntite);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entiteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _entiteLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _entiteLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entiteLocalService.dynamicQuery();
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

		return _entiteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EntiteModelImpl</code>.
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

		return _entiteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EntiteModelImpl</code>.
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

		return _entiteLocalService.dynamicQuery(
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

		return _entiteLocalService.dynamicQueryCount(dynamicQuery);
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

		return _entiteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public event.obs.model.Entite fetchEntite(long idEntite) {
		return _entiteLocalService.fetchEntite(idEntite);
	}

	/**
	 * Returns the entite matching the UUID and group.
	 *
	 * @param uuid the entite's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entite, or <code>null</code> if a matching entite could not be found
	 */
	@Override
	public event.obs.model.Entite fetchEntiteByUuidAndGroupId(
		String uuid, long groupId) {

		return _entiteLocalService.fetchEntiteByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _entiteLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the entite with the primary key.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite
	 * @throws PortalException if a entite with the primary key could not be found
	 */
	@Override
	public event.obs.model.Entite getEntite(long idEntite)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entiteLocalService.getEntite(idEntite);
	}

	/**
	 * Returns the entite matching the UUID and group.
	 *
	 * @param uuid the entite's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entite
	 * @throws PortalException if a matching entite could not be found
	 */
	@Override
	public event.obs.model.Entite getEntiteByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entiteLocalService.getEntiteByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the entites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EntiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @return the range of entites
	 */
	@Override
	public java.util.List<event.obs.model.Entite> getEntites(
		int start, int end) {

		return _entiteLocalService.getEntites(start, end);
	}

	/**
	 * Returns all the entites matching the UUID and company.
	 *
	 * @param uuid the UUID of the entites
	 * @param companyId the primary key of the company
	 * @return the matching entites, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Entite> getEntitesByUuidAndCompanyId(
		String uuid, long companyId) {

		return _entiteLocalService.getEntitesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of entites matching the UUID and company.
	 *
	 * @param uuid the UUID of the entites
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of entites
	 * @param end the upper bound of the range of entites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching entites, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Entite> getEntitesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<event.obs.model.Entite>
			orderByComparator) {

		return _entiteLocalService.getEntitesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of entites.
	 *
	 * @return the number of entites
	 */
	@Override
	public int getEntitesCount() {
		return _entiteLocalService.getEntitesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _entiteLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _entiteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entiteLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _entiteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the entite in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EntiteLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param entite the entite
	 * @return the entite that was updated
	 */
	@Override
	public event.obs.model.Entite updateEntite(event.obs.model.Entite entite) {
		return _entiteLocalService.updateEntite(entite);
	}

	@Override
	public EntiteLocalService getWrappedService() {
		return _entiteLocalService;
	}

	@Override
	public void setWrappedService(EntiteLocalService entiteLocalService) {
		_entiteLocalService = entiteLocalService;
	}

	private EntiteLocalService _entiteLocalService;

}