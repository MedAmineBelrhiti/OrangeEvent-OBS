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
 * Provides a wrapper for {@link EvenementObsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObsLocalService
 * @generated
 */
public class EvenementObsLocalServiceWrapper
	implements EvenementObsLocalService,
			   ServiceWrapper<EvenementObsLocalService> {

	public EvenementObsLocalServiceWrapper() {
		this(null);
	}

	public EvenementObsLocalServiceWrapper(
		EvenementObsLocalService evenementObsLocalService) {

		_evenementObsLocalService = evenementObsLocalService;
	}

	@Override
	public event.obs.model.EvenementObs addEvenement(
		java.util.Date startDate, java.util.Date endDate, String lieu,
		String description, java.util.Date votingEndDate, String titre,
		int nbrUserMax, String managerName, String entityName) {

		return _evenementObsLocalService.addEvenement(
			startDate, endDate, lieu, description, votingEndDate, titre,
			nbrUserMax, managerName, entityName);
	}

	/**
	 * Adds the evenement obs to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EvenementObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evenementObs the evenement obs
	 * @return the evenement obs that was added
	 */
	@Override
	public event.obs.model.EvenementObs addEvenementObs(
		event.obs.model.EvenementObs evenementObs) {

		return _evenementObsLocalService.addEvenementObs(evenementObs);
	}

	/**
	 * Creates a new evenement obs with the primary key. Does not add the evenement obs to the database.
	 *
	 * @param idEvent the primary key for the new evenement obs
	 * @return the new evenement obs
	 */
	@Override
	public event.obs.model.EvenementObs createEvenementObs(long idEvent) {
		return _evenementObsLocalService.createEvenementObs(idEvent);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the evenement obs from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EvenementObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evenementObs the evenement obs
	 * @return the evenement obs that was removed
	 */
	@Override
	public event.obs.model.EvenementObs deleteEvenementObs(
		event.obs.model.EvenementObs evenementObs) {

		return _evenementObsLocalService.deleteEvenementObs(evenementObs);
	}

	/**
	 * Deletes the evenement obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EvenementObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs that was removed
	 * @throws PortalException if a evenement obs with the primary key could not be found
	 */
	@Override
	public event.obs.model.EvenementObs deleteEvenementObs(long idEvent)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsLocalService.deleteEvenementObs(idEvent);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _evenementObsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _evenementObsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evenementObsLocalService.dynamicQuery();
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

		return _evenementObsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EvenementObsModelImpl</code>.
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

		return _evenementObsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EvenementObsModelImpl</code>.
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

		return _evenementObsLocalService.dynamicQuery(
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

		return _evenementObsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _evenementObsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.EvenementObs fetchEvenementObs(long idEvent) {
		return _evenementObsLocalService.fetchEvenementObs(idEvent);
	}

	/**
	 * Returns the evenement obs matching the UUID and group.
	 *
	 * @param uuid the evenement obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	@Override
	public event.obs.model.EvenementObs fetchEvenementObsByUuidAndGroupId(
		String uuid, long groupId) {

		return _evenementObsLocalService.fetchEvenementObsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evenementObsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the evenement obs with the primary key.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs
	 * @throws PortalException if a evenement obs with the primary key could not be found
	 */
	@Override
	public event.obs.model.EvenementObs getEvenementObs(long idEvent)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsLocalService.getEvenementObs(idEvent);
	}

	/**
	 * Returns the evenement obs matching the UUID and group.
	 *
	 * @param uuid the evenement obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching evenement obs
	 * @throws PortalException if a matching evenement obs could not be found
	 */
	@Override
	public event.obs.model.EvenementObs getEvenementObsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsLocalService.getEvenementObsByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the evenement obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EvenementObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @return the range of evenement obses
	 */
	@Override
	public java.util.List<event.obs.model.EvenementObs> getEvenementObses(
		int start, int end) {

		return _evenementObsLocalService.getEvenementObses(start, end);
	}

	/**
	 * Returns all the evenement obses matching the UUID and company.
	 *
	 * @param uuid the UUID of the evenement obses
	 * @param companyId the primary key of the company
	 * @return the matching evenement obses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.EvenementObs>
		getEvenementObsesByUuidAndCompanyId(String uuid, long companyId) {

		return _evenementObsLocalService.getEvenementObsesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of evenement obses matching the UUID and company.
	 *
	 * @param uuid the UUID of the evenement obses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of evenement obses
	 * @param end the upper bound of the range of evenement obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching evenement obses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.EvenementObs>
		getEvenementObsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.EvenementObs> orderByComparator) {

		return _evenementObsLocalService.getEvenementObsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of evenement obses.
	 *
	 * @return the number of evenement obses
	 */
	@Override
	public int getEvenementObsesCount() {
		return _evenementObsLocalService.getEvenementObsesCount();
	}

	@Override
	public java.util.List<event.obs.model.EvenementObs> getEventsByEntityName(
		String entityName) {

		return _evenementObsLocalService.getEventsByEntityName(entityName);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _evenementObsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evenementObsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evenementObsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evenementObsLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public event.obs.model.EvenementObs incrementNbrUserConfirmed(
		long idEvent) {

		return _evenementObsLocalService.incrementNbrUserConfirmed(idEvent);
	}

	/**
	 * Updates the evenement obs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EvenementObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evenementObs the evenement obs
	 * @return the evenement obs that was updated
	 */
	@Override
	public event.obs.model.EvenementObs updateEvenementObs(
		event.obs.model.EvenementObs evenementObs) {

		return _evenementObsLocalService.updateEvenementObs(evenementObs);
	}

	@Override
	public EvenementObsLocalService getWrappedService() {
		return _evenementObsLocalService;
	}

	@Override
	public void setWrappedService(
		EvenementObsLocalService evenementObsLocalService) {

		_evenementObsLocalService = evenementObsLocalService;
	}

	private EvenementObsLocalService _evenementObsLocalService;

}