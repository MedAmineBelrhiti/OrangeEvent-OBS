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
 * Provides a wrapper for {@link TransportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TransportLocalService
 * @generated
 */
public class TransportLocalServiceWrapper
	implements ServiceWrapper<TransportLocalService>, TransportLocalService {

	public TransportLocalServiceWrapper() {
		this(null);
	}

	public TransportLocalServiceWrapper(
		TransportLocalService transportLocalService) {

		_transportLocalService = transportLocalService;
	}

	/**
	 * Adds the transport to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TransportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param transport the transport
	 * @return the transport that was added
	 */
	@Override
	public event.obs.model.Transport addTransport(
		event.obs.model.Transport transport) {

		return _transportLocalService.addTransport(transport);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transportLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new transport with the primary key. Does not add the transport to the database.
	 *
	 * @param idTransport the primary key for the new transport
	 * @return the new transport
	 */
	@Override
	public event.obs.model.Transport createTransport(long idTransport) {
		return _transportLocalService.createTransport(idTransport);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transportLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the transport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TransportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport that was removed
	 * @throws PortalException if a transport with the primary key could not be found
	 */
	@Override
	public event.obs.model.Transport deleteTransport(long idTransport)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transportLocalService.deleteTransport(idTransport);
	}

	/**
	 * Deletes the transport from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TransportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param transport the transport
	 * @return the transport that was removed
	 */
	@Override
	public event.obs.model.Transport deleteTransport(
		event.obs.model.Transport transport) {

		return _transportLocalService.deleteTransport(transport);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _transportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _transportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _transportLocalService.dynamicQuery();
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

		return _transportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.TransportModelImpl</code>.
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

		return _transportLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.TransportModelImpl</code>.
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

		return _transportLocalService.dynamicQuery(
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

		return _transportLocalService.dynamicQueryCount(dynamicQuery);
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

		return _transportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public event.obs.model.Transport fetchTransport(long idTransport) {
		return _transportLocalService.fetchTransport(idTransport);
	}

	/**
	 * Returns the transport matching the UUID and group.
	 *
	 * @param uuid the transport's UUID
	 * @param groupId the primary key of the group
	 * @return the matching transport, or <code>null</code> if a matching transport could not be found
	 */
	@Override
	public event.obs.model.Transport fetchTransportByUuidAndGroupId(
		String uuid, long groupId) {

		return _transportLocalService.fetchTransportByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _transportLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _transportLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _transportLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _transportLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transportLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the transport with the primary key.
	 *
	 * @param idTransport the primary key of the transport
	 * @return the transport
	 * @throws PortalException if a transport with the primary key could not be found
	 */
	@Override
	public event.obs.model.Transport getTransport(long idTransport)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transportLocalService.getTransport(idTransport);
	}

	/**
	 * Returns the transport matching the UUID and group.
	 *
	 * @param uuid the transport's UUID
	 * @param groupId the primary key of the group
	 * @return the matching transport
	 * @throws PortalException if a matching transport could not be found
	 */
	@Override
	public event.obs.model.Transport getTransportByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transportLocalService.getTransportByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the transports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.TransportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @return the range of transports
	 */
	@Override
	public java.util.List<event.obs.model.Transport> getTransports(
		int start, int end) {

		return _transportLocalService.getTransports(start, end);
	}

	/**
	 * Returns all the transports matching the UUID and company.
	 *
	 * @param uuid the UUID of the transports
	 * @param companyId the primary key of the company
	 * @return the matching transports, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Transport>
		getTransportsByUuidAndCompanyId(String uuid, long companyId) {

		return _transportLocalService.getTransportsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of transports matching the UUID and company.
	 *
	 * @param uuid the UUID of the transports
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of transports
	 * @param end the upper bound of the range of transports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching transports, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<event.obs.model.Transport>
		getTransportsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<event.obs.model.Transport> orderByComparator) {

		return _transportLocalService.getTransportsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of transports.
	 *
	 * @return the number of transports
	 */
	@Override
	public int getTransportsCount() {
		return _transportLocalService.getTransportsCount();
	}

	/**
	 * Updates the transport in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TransportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param transport the transport
	 * @return the transport that was updated
	 */
	@Override
	public event.obs.model.Transport updateTransport(
		event.obs.model.Transport transport) {

		return _transportLocalService.updateTransport(transport);
	}

	@Override
	public TransportLocalService getWrappedService() {
		return _transportLocalService;
	}

	@Override
	public void setWrappedService(TransportLocalService transportLocalService) {
		_transportLocalService = transportLocalService;
	}

	private TransportLocalService _transportLocalService;

}