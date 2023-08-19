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

import event.obs.model.Participant;
import event.obs.service.ParticipantLocalService;
import event.obs.service.ParticipantLocalServiceUtil;
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
 * Provides the base implementation for the participant local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link event.obs.service.impl.ParticipantLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see event.obs.service.impl.ParticipantLocalServiceImpl
 * @generated
 */
public abstract class ParticipantLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, ParticipantLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ParticipantLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ParticipantLocalServiceUtil</code>.
	 */

	/**
	 * Adds the participant to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Participant addParticipant(Participant participant) {
		participant.setNew(true);

		return participantPersistence.update(participant);
	}

	/**
	 * Creates a new participant with the primary key. Does not add the participant to the database.
	 *
	 * @param idParticipant the primary key for the new participant
	 * @return the new participant
	 */
	@Override
	@Transactional(enabled = false)
	public Participant createParticipant(long idParticipant) {
		return participantPersistence.create(idParticipant);
	}

	/**
	 * Deletes the participant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant that was removed
	 * @throws PortalException if a participant with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Participant deleteParticipant(long idParticipant)
		throws PortalException {

		return participantPersistence.remove(idParticipant);
	}

	/**
	 * Deletes the participant from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Participant deleteParticipant(Participant participant) {
		return participantPersistence.remove(participant);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return participantPersistence.dslQuery(dslQuery);
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
			Participant.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return participantPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ParticipantModelImpl</code>.
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

		return participantPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ParticipantModelImpl</code>.
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

		return participantPersistence.findWithDynamicQuery(
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
		return participantPersistence.countWithDynamicQuery(dynamicQuery);
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

		return participantPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Participant fetchParticipant(long idParticipant) {
		return participantPersistence.fetchByPrimaryKey(idParticipant);
	}

	/**
	 * Returns the participant matching the UUID and group.
	 *
	 * @param uuid the participant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching participant, or <code>null</code> if a matching participant could not be found
	 */
	@Override
	public Participant fetchParticipantByUuidAndGroupId(
		String uuid, long groupId) {

		return participantPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the participant with the primary key.
	 *
	 * @param idParticipant the primary key of the participant
	 * @return the participant
	 * @throws PortalException if a participant with the primary key could not be found
	 */
	@Override
	public Participant getParticipant(long idParticipant)
		throws PortalException {

		return participantPersistence.findByPrimaryKey(idParticipant);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(participantLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Participant.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idParticipant");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			participantLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Participant.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"idParticipant");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(participantLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Participant.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idParticipant");
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
			new ActionableDynamicQuery.PerformActionMethod<Participant>() {

				@Override
				public void performAction(Participant participant)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, participant);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Participant.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return participantPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement ParticipantLocalServiceImpl#deleteParticipant(Participant) to avoid orphaned data");
		}

		return participantLocalService.deleteParticipant(
			(Participant)persistedModel);
	}

	@Override
	public BasePersistence<Participant> getBasePersistence() {
		return participantPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return participantPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the participants matching the UUID and company.
	 *
	 * @param uuid the UUID of the participants
	 * @param companyId the primary key of the company
	 * @return the matching participants, or an empty list if no matches were found
	 */
	@Override
	public List<Participant> getParticipantsByUuidAndCompanyId(
		String uuid, long companyId) {

		return participantPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of participants matching the UUID and company.
	 *
	 * @param uuid the UUID of the participants
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching participants, or an empty list if no matches were found
	 */
	@Override
	public List<Participant> getParticipantsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Participant> orderByComparator) {

		return participantPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the participant matching the UUID and group.
	 *
	 * @param uuid the participant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching participant
	 * @throws PortalException if a matching participant could not be found
	 */
	@Override
	public Participant getParticipantByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return participantPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>event.obs.model.impl.ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of participants
	 */
	@Override
	public List<Participant> getParticipants(int start, int end) {
		return participantPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of participants.
	 *
	 * @return the number of participants
	 */
	@Override
	public int getParticipantsCount() {
		return participantPersistence.countAll();
	}

	/**
	 * Updates the participant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Participant updateParticipant(Participant participant) {
		return participantPersistence.update(participant);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ParticipantLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		participantLocalService = (ParticipantLocalService)aopProxy;

		_setLocalServiceUtilService(participantLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ParticipantLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Participant.class;
	}

	protected String getModelClassName() {
		return Participant.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = participantPersistence.getDataSource();

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
		ParticipantLocalService participantLocalService) {

		try {
			Field field = ParticipantLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, participantLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected ContactSupportPersistence contactSupportPersistence;

	@Reference
	protected DemandEventObsPersistence demandEventObsPersistence;

	@Reference
	protected EntitePersistence entitePersistence;

	@Reference
	protected EvenementObsPersistence evenementObsPersistence;

	@Reference
	protected MessagingPersistence messagingPersistence;

	protected ParticipantLocalService participantLocalService;

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
		ParticipantLocalServiceBaseImpl.class);

}