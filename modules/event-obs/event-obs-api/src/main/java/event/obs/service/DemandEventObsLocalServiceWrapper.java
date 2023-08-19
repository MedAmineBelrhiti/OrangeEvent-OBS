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
 * Provides a wrapper for {@link DemandEventObsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsLocalService
 * @generated
 */
public class DemandEventObsLocalServiceWrapper
	implements DemandEventObsLocalService,
			   ServiceWrapper<DemandEventObsLocalService> {

	public DemandEventObsLocalServiceWrapper() {
		this(null);
	}

	public DemandEventObsLocalServiceWrapper(
		DemandEventObsLocalService demandEventObsLocalService) {

		_demandEventObsLocalService = demandEventObsLocalService;
	}

	@Override
	public event.obs.model.DemandEventObs addDemand(
		String content, String firstName, String lastName) {

		return _demandEventObsLocalService.addDemand(
			content, firstName, lastName);
	}

	/**
	 * Adds the demand event obs to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemandEventObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demandEventObs the demand event obs
	 * @return the demand event obs that was added
	 */
	@Override
	public event.obs.model.DemandEventObs addDemandEventObs(
		event.obs.model.DemandEventObs demandEventObs) {

		return _demandEventObsLocalService.addDemandEventObs(demandEventObs);
	}

	@Override
	public event.obs.model.DemandEventObs ApproveDemand(long idDemand) {
		return _demandEventObsLocalService.ApproveDemand(idDemand);
	}

	/**
	 * Creates a new demand event obs with the primary key. Does not add the demand event obs to the database.
	 *
	 * @param idDemand the primary key for the new demand event obs
	 * @return the new demand event obs
	 */
	@Override
	public event.obs.model.DemandEventObs createDemandEventObs(long idDemand) {
		return _demandEventObsLocalService.createDemandEventObs(idDemand);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demandEventObsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the demand event obs from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemandEventObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demandEventObs the demand event obs
	 * @return the demand event obs that was removed
	 */
	@Override
	public event.obs.model.DemandEventObs deleteDemandEventObs(
		event.obs.model.DemandEventObs demandEventObs) {

		return _demandEventObsLocalService.deleteDemandEventObs(demandEventObs);
	}

	/**
	 * Deletes the demand event obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemandEventObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs that was removed
	 * @throws PortalException if a demand event obs with the primary key could not be found
	 */
	@Override
	public event.obs.model.DemandEventObs deleteDemandEventObs(long idDemand)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demandEventObsLocalService.deleteDemandEventObs(idDemand);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demandEventObsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _demandEventObsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _demandEventObsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _demandEventObsLocalService.dynamicQuery();
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

		return _demandEventObsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.DemandEventObsModelImpl</code>.
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

		return _demandEventObsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.DemandEventObsModelImpl</code>.
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

		return _demandEventObsLocalService.dynamicQuery(
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

		return _demandEventObsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _demandEventObsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.DemandEventObs fetchDemandEventObs(long idDemand) {
		return _demandEventObsLocalService.fetchDemandEventObs(idDemand);
	}

	/**
	 * Returns the demand event obs matching the UUID and group.
	 *
	 * @param uuid the demand event obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public event.obs.model.DemandEventObs fetchDemandEventObsByUuidAndGroupId(
		String uuid, long groupId) {

		return _demandEventObsLocalService.fetchDemandEventObsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<event.obs.model.DemandEventObs> findByStatus(
		String status) {

		return _demandEventObsLocalService.findByStatus(status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _demandEventObsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the demand event obs with the primary key.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs
	 * @throws PortalException if a demand event obs with the primary key could not be found
	 */
	@Override
	public event.obs.model.DemandEventObs getDemandEventObs(long idDemand)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demandEventObsLocalService.getDemandEventObs(idDemand);
	}

	/**
	 * Returns the demand event obs matching the UUID and group.
	 *
	 * @param uuid the demand event obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching demand event obs
	 * @throws PortalException if a matching demand event obs could not be found
	 */
	@Override
	public event.obs.model.DemandEventObs getDemandEventObsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demandEventObsLocalService.getDemandEventObsByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of demand event obses
	 */
	@Override
	public java.util.List<event.obs.model.DemandEventObs> getDemandEventObses(
		int start, int end) {

		return _demandEventObsLocalService.getDemandEventObses(start, end);
	}

	/**
	 * Returns all the demand event obses matching the UUID and company.
	 *
	 * @param uuid the UUID of the demand event obses
	 * @param companyId the primary key of the company
	 * @return the matching demand event obses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.DemandEventObs>
		getDemandEventObsesByUuidAndCompanyId(String uuid, long companyId) {

		return _demandEventObsLocalService.
			getDemandEventObsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of demand event obses matching the UUID and company.
	 *
	 * @param uuid the UUID of the demand event obses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching demand event obses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.DemandEventObs>
		getDemandEventObsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.DemandEventObs> orderByComparator) {

		return _demandEventObsLocalService.
			getDemandEventObsesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of demand event obses.
	 *
	 * @return the number of demand event obses
	 */
	@Override
	public int getDemandEventObsesCount() {
		return _demandEventObsLocalService.getDemandEventObsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _demandEventObsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _demandEventObsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demandEventObsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demandEventObsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the demand event obs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemandEventObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demandEventObs the demand event obs
	 * @return the demand event obs that was updated
	 */
	@Override
	public event.obs.model.DemandEventObs updateDemandEventObs(
		event.obs.model.DemandEventObs demandEventObs) {

		return _demandEventObsLocalService.updateDemandEventObs(demandEventObs);
	}

	@Override
	public DemandEventObsLocalService getWrappedService() {
		return _demandEventObsLocalService;
	}

	@Override
	public void setWrappedService(
		DemandEventObsLocalService demandEventObsLocalService) {

		_demandEventObsLocalService = demandEventObsLocalService;
	}

	private DemandEventObsLocalService _demandEventObsLocalService;

}