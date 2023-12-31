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

package event.obs.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import event.obs.model.Entite;
import event.obs.service.EntiteLocalService;
import event.obs.service.EntiteLocalServiceUtil;
import event.obs.service.persistence.ContactSupportPersistence;
import event.obs.service.persistence.DemandEventObsPersistence;
import event.obs.service.persistence.EntitePersistence;
import event.obs.service.persistence.EvenementObsPersistence;
import event.obs.service.persistence.MessagingPersistence;
import event.obs.service.persistence.ParticipantPersistence;
import event.obs.service.persistence.ReservationPersistence;
import event.obs.service.persistence.TransportPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the entite local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link event.obs.service.impl.EntiteLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see event.obs.service.impl.EntiteLocalServiceImpl
 * @generated
 */
public abstract class EntiteLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, EntiteLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EntiteLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>EntiteLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Entite addEntite(Entite entite) {
		entite.setNew(true);

		return entitePersistence.update(entite);
	}

	/**
	 * Creates a new entite with the primary key. Does not add the entite to the database.
	 *
	 * @param idEntite the primary key for the new entite
	 * @return the new entite
	 */
	@Override
	@Transactional(enabled = false)
	public Entite createEntite(long idEntite) {
		return entitePersistence.create(idEntite);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Entite deleteEntite(long idEntite) throws PortalException {
		return entitePersistence.remove(idEntite);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Entite deleteEntite(Entite entite) {
		return entitePersistence.remove(entite);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return entitePersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Entite.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return entitePersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return entitePersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return entitePersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return entitePersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return entitePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Entite fetchEntite(long idEntite) {
		return entitePersistence.fetchByPrimaryKey(idEntite);
	}

	/**
	 * Returns the entite matching the UUID and group.
	 *
	 * @param uuid the entite's UUID
	 * @param groupId the primary key of the group
	 * @return the matching entite, or <code>null</code> if a matching entite could not be found
	 */
	@Override
	public Entite fetchEntiteByUuidAndGroupId(String uuid, long groupId) {
		return entitePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the entite with the primary key.
	 *
	 * @param idEntite the primary key of the entite
	 * @return the entite
	 * @throws PortalException if a entite with the primary key could not be found
	 */
	@Override
	public Entite getEntite(long idEntite) throws PortalException {
		return entitePersistence.findByPrimaryKey(idEntite);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(entiteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Entite.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idEntite");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(entiteLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Entite.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("idEntite");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(entiteLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Entite.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idEntite");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Entite>() {

				@Override
				public void performAction(Entite entite)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, entite);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Entite.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return entitePersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement EntiteLocalServiceImpl#deleteEntite(Entite) to avoid orphaned data");
		}

		return entiteLocalService.deleteEntite((Entite)persistedModel);
	}

	@Override
	public BasePersistence<Entite> getBasePersistence() {
		return entitePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return entitePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the entites matching the UUID and company.
	 *
	 * @param uuid the UUID of the entites
	 * @param companyId the primary key of the company
	 * @return the matching entites, or an empty list if no matches were found
	 */
	@Override
	public List<Entite> getEntitesByUuidAndCompanyId(
		String uuid, long companyId) {

		return entitePersistence.findByUuid_C(uuid, companyId);
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
	public List<Entite> getEntitesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Entite> orderByComparator) {

		return entitePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public Entite getEntiteByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return entitePersistence.findByUUID_G(uuid, groupId);
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
	public List<Entite> getEntites(int start, int end) {
		return entitePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of entites.
	 *
	 * @return the number of entites
	 */
	@Override
	public int getEntitesCount() {
		return entitePersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Entite updateEntite(Entite entite) {
		return entitePersistence.update(entite);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			EntiteLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		entiteLocalService = (EntiteLocalService)aopProxy;

		_setLocalServiceUtilService(entiteLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EntiteLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Entite.class;
	}

	protected String getModelClassName() {
		return Entite.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = entitePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		EntiteLocalService entiteLocalService) {

		try {
			Field field = EntiteLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, entiteLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected ContactSupportPersistence contactSupportPersistence;

	@Reference
	protected DemandEventObsPersistence demandEventObsPersistence;

	protected EntiteLocalService entiteLocalService;

	@Reference
	protected EntitePersistence entitePersistence;

	@Reference
	protected EvenementObsPersistence evenementObsPersistence;

	@Reference
	protected MessagingPersistence messagingPersistence;

	@Reference
	protected ParticipantPersistence participantPersistence;

	@Reference
	protected ReservationPersistence reservationPersistence;

	@Reference
	protected TransportPersistence transportPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		EntiteLocalServiceBaseImpl.class);

}