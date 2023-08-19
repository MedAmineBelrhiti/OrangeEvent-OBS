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

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import event.obs.model.EvenementObs;
import event.obs.service.EvenementObsService;
import event.obs.service.EvenementObsServiceUtil;
import event.obs.service.persistence.ContactSupportPersistence;
import event.obs.service.persistence.DemandEventObsPersistence;
import event.obs.service.persistence.EntitePersistence;
import event.obs.service.persistence.EvenementObsPersistence;
import event.obs.service.persistence.MessagingPersistence;
import event.obs.service.persistence.ParticipantPersistence;
import event.obs.service.persistence.ReservationPersistence;
import event.obs.service.persistence.TransportPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the evenement obs remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link event.obs.service.impl.EvenementObsServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see event.obs.service.impl.EvenementObsServiceImpl
 * @generated
 */
public abstract class EvenementObsServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, EvenementObsService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EvenementObsService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>EvenementObsServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			EvenementObsService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		evenementObsService = (EvenementObsService)aopProxy;

		_setServiceUtilService(evenementObsService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EvenementObsService.class.getName();
	}

	protected Class<?> getModelClass() {
		return EvenementObs.class;
	}

	protected String getModelClassName() {
		return EvenementObs.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = evenementObsPersistence.getDataSource();

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

	private void _setServiceUtilService(
		EvenementObsService evenementObsService) {

		try {
			Field field = EvenementObsServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, evenementObsService);
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
	protected event.obs.service.EvenementObsLocalService
		evenementObsLocalService;

	protected EvenementObsService evenementObsService;

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
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	private static final Log _log = LogFactoryUtil.getLog(
		EvenementObsServiceBaseImpl.class);

}