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

import event.obs.model.EvenementObs;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EvenementObs. This utility wraps
 * <code>event.obs.service.impl.EvenementObsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObsLocalService
 * @generated
 */
public class EvenementObsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>event.obs.service.impl.EvenementObsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static EvenementObs addEvenement(
		java.util.Date startDate, java.util.Date endDate, String lieu,
		String description, java.util.Date votingEndDate, String titre,
		int nbrUserMax, String managerName, String entityName) {

		return getService().addEvenement(
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
	public static EvenementObs addEvenementObs(EvenementObs evenementObs) {
		return getService().addEvenementObs(evenementObs);
	}

	/**
	 * Creates a new evenement obs with the primary key. Does not add the evenement obs to the database.
	 *
	 * @param idEvent the primary key for the new evenement obs
	 * @return the new evenement obs
	 */
	public static EvenementObs createEvenementObs(long idEvent) {
		return getService().createEvenementObs(idEvent);
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
	 * Deletes the evenement obs from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EvenementObsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evenementObs the evenement obs
	 * @return the evenement obs that was removed
	 */
	public static EvenementObs deleteEvenementObs(EvenementObs evenementObs) {
		return getService().deleteEvenementObs(evenementObs);
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
	public static EvenementObs deleteEvenementObs(long idEvent)
		throws PortalException {

		return getService().deleteEvenementObs(idEvent);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EvenementObsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.EvenementObsModelImpl</code>.
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

	public static EvenementObs fetchEvenementObs(long idEvent) {
		return getService().fetchEvenementObs(idEvent);
	}

	/**
	 * Returns the evenement obs matching the UUID and group.
	 *
	 * @param uuid the evenement obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching evenement obs, or <code>null</code> if a matching evenement obs could not be found
	 */
	public static EvenementObs fetchEvenementObsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchEvenementObsByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the evenement obs with the primary key.
	 *
	 * @param idEvent the primary key of the evenement obs
	 * @return the evenement obs
	 * @throws PortalException if a evenement obs with the primary key could not be found
	 */
	public static EvenementObs getEvenementObs(long idEvent)
		throws PortalException {

		return getService().getEvenementObs(idEvent);
	}

	/**
	 * Returns the evenement obs matching the UUID and group.
	 *
	 * @param uuid the evenement obs's UUID
	 * @param groupId the primary key of the group
	 * @return the matching evenement obs
	 * @throws PortalException if a matching evenement obs could not be found
	 */
	public static EvenementObs getEvenementObsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getEvenementObsByUuidAndGroupId(uuid, groupId);
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
	public static List<EvenementObs> getEvenementObses(int start, int end) {
		return getService().getEvenementObses(start, end);
	}

	/**
	 * Returns all the evenement obses matching the UUID and company.
	 *
	 * @param uuid the UUID of the evenement obses
	 * @param companyId the primary key of the company
	 * @return the matching evenement obses, or an empty list if no matches were found
	 */
	public static List<EvenementObs> getEvenementObsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getEvenementObsesByUuidAndCompanyId(
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
	public static List<EvenementObs> getEvenementObsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EvenementObs> orderByComparator) {

		return getService().getEvenementObsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of evenement obses.
	 *
	 * @return the number of evenement obses
	 */
	public static int getEvenementObsesCount() {
		return getService().getEvenementObsesCount();
	}

	public static List<EvenementObs> getEventsByEntityName(String entityName) {
		return getService().getEventsByEntityName(entityName);
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

	public static EvenementObs incrementNbrUserConfirmed(long idEvent) {
		return getService().incrementNbrUserConfirmed(idEvent);
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
	public static EvenementObs updateEvenementObs(EvenementObs evenementObs) {
		return getService().updateEvenementObs(evenementObs);
	}

	public static EvenementObsLocalService getService() {
		return _service;
	}

	private static volatile EvenementObsLocalService _service;

}