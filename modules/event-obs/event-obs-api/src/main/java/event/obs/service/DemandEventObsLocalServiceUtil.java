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

import event.obs.model.DemandEventObs;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DemandEventObs. This utility wraps
 * <code>event.obs.service.impl.DemandEventObsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsLocalService
 * @generated
 */
public class DemandEventObsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.DemandEventObsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DemandEventObs addDemand(
		String content, String firstName, String lastName) {

		return getService().addDemand(content, firstName, lastName);
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
	public static DemandEventObs addDemandEventObs(
		DemandEventObs demandEventObs) {

		return getService().addDemandEventObs(demandEventObs);
	}

	public static DemandEventObs ApproveDemand(long idDemand) {
		return getService().ApproveDemand(idDemand);
	}

	/**
	 * Creates a new demand event obs with the primary key. Does not add the demand event obs to the database.
	 *
	 * @param idDemand the primary key for the new demand event obs
	 * @return the new demand event obs
	 */
	public static DemandEventObs createDemandEventObs(long idDemand) {
		return getService().createDemandEventObs(idDemand);
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
	 * Deletes the demand event obs from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemandEventObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demandEventObs the demand event obs
	 * @return the demand event obs that was removed
	 */
	public static DemandEventObs deleteDemandEventObs(
		DemandEventObs demandEventObs) {

		return getService().deleteDemandEventObs(demandEventObs);
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
	public static DemandEventObs deleteDemandEventObs(long idDemand)
		throws PortalException {

		return getService().deleteDemandEventObs(idDemand);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.DemandEventObsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.DemandEventObsModelImpl</code>.
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

	public static DemandEventObs fetchDemandEventObs(long idDemand) {
		return getService().fetchDemandEventObs(idDemand);
	}

	/**
	 * Returns the demand event obs matching the UUID and group.
	 *
	 * @param uuid the demand event obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	public static DemandEventObs fetchDemandEventObsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDemandEventObsByUuidAndGroupId(uuid, groupId);
	}

	public static List<DemandEventObs> findByStatus(String status) {
		return getService().findByStatus(status);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the demand event obs with the primary key.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs
	 * @throws PortalException if a demand event obs with the primary key could not be found
	 */
	public static DemandEventObs getDemandEventObs(long idDemand)
		throws PortalException {

		return getService().getDemandEventObs(idDemand);
	}

	/**
	 * Returns the demand event obs matching the UUID and group.
	 *
	 * @param uuid the demand event obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching demand event obs
	 * @throws PortalException if a matching demand event obs could not be found
	 */
	public static DemandEventObs getDemandEventObsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDemandEventObsByUuidAndGroupId(uuid, groupId);
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
	public static List<DemandEventObs> getDemandEventObses(int start, int end) {
		return getService().getDemandEventObses(start, end);
	}

	/**
	 * Returns all the demand event obses matching the UUID and company.
	 *
	 * @param uuid the UUID of the demand event obses
	 * @param companyId the primary key of the company
	 * @return the matching demand event obses, or an empty list if no matches were found
	 */
	public static List<DemandEventObs> getDemandEventObsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDemandEventObsesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<DemandEventObs> getDemandEventObsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return getService().getDemandEventObsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of demand event obses.
	 *
	 * @return the number of demand event obses
	 */
	public static int getDemandEventObsesCount() {
		return getService().getDemandEventObsesCount();
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
	 * Updates the demand event obs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DemandEventObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param demandEventObs the demand event obs
	 * @return the demand event obs that was updated
	 */
	public static DemandEventObs updateDemandEventObs(
		DemandEventObs demandEventObs) {

		return getService().updateDemandEventObs(demandEventObs);
	}

	public static DemandEventObsLocalService getService() {
		return _service;
	}

	private static volatile DemandEventObsLocalService _service;

}