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

package event.obs.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import event.obs.exception.NoSuchDemandEventObsException;
import event.obs.model.DemandEventObs;
import event.obs.model.DemandEventObsTable;
import event.obs.model.impl.DemandEventObsImpl;
import event.obs.model.impl.DemandEventObsModelImpl;
import event.obs.service.persistence.DemandEventObsPersistence;
import event.obs.service.persistence.DemandEventObsUtil;
import event.obs.service.persistence.impl.constants.OBSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the demand event obs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DemandEventObsPersistence.class)
public class DemandEventObsPersistenceImpl
	extends BasePersistenceImpl<DemandEventObs>
	implements DemandEventObsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DemandEventObsUtil</code> to access the demand event obs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DemandEventObsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the demand event obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demand event obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<DemandEventObs> list = null;

		if (useFinderCache) {
			list = (List<DemandEventObs>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemandEventObs demandEventObs : list) {
					if (!uuid.equals(demandEventObs.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DemandEventObsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<DemandEventObs>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByUuid_First(
			String uuid, OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByUuid_First(
			uuid, orderByComparator);

		if (demandEventObs != null) {
			return demandEventObs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemandEventObsException(sb.toString());
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByUuid_First(
		String uuid, OrderByComparator<DemandEventObs> orderByComparator) {

		List<DemandEventObs> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByUuid_Last(
			String uuid, OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByUuid_Last(
			uuid, orderByComparator);

		if (demandEventObs != null) {
			return demandEventObs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDemandEventObsException(sb.toString());
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByUuid_Last(
		String uuid, OrderByComparator<DemandEventObs> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DemandEventObs> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where uuid = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs[] findByUuid_PrevAndNext(
			long idDemand, String uuid,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		uuid = Objects.toString(uuid, "");

		DemandEventObs demandEventObs = findByPrimaryKey(idDemand);

		Session session = null;

		try {
			session = openSession();

			DemandEventObs[] array = new DemandEventObsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, demandEventObs, uuid, orderByComparator, true);

			array[1] = demandEventObs;

			array[2] = getByUuid_PrevAndNext(
				session, demandEventObs, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DemandEventObs getByUuid_PrevAndNext(
		Session session, DemandEventObs demandEventObs, String uuid,
		OrderByComparator<DemandEventObs> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(DemandEventObsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						demandEventObs)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemandEventObs> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demand event obses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DemandEventObs demandEventObs :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demandEventObs);
		}
	}

	/**
	 * Returns the number of demand event obses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching demand event obses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMANDEVENTOBS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"demandEventObs.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(demandEventObs.uuid IS NULL OR demandEventObs.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDemandEventObsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByUUID_G(String uuid, long groupId)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByUUID_G(uuid, groupId);

		if (demandEventObs == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDemandEventObsException(sb.toString());
		}

		return demandEventObs;
	}

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the demand event obs where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof DemandEventObs) {
			DemandEventObs demandEventObs = (DemandEventObs)result;

			if (!Objects.equals(uuid, demandEventObs.getUuid()) ||
				(groupId != demandEventObs.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<DemandEventObs> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					DemandEventObs demandEventObs = list.get(0);

					result = demandEventObs;

					cacheResult(demandEventObs);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DemandEventObs)result;
		}
	}

	/**
	 * Removes the demand event obs where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the demand event obs that was removed
	 */
	@Override
	public DemandEventObs removeByUUID_G(String uuid, long groupId)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = findByUUID_G(uuid, groupId);

		return remove(demandEventObs);
	}

	/**
	 * Returns the number of demand event obses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching demand event obses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DEMANDEVENTOBS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"demandEventObs.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(demandEventObs.uuid IS NULL OR demandEventObs.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"demandEventObs.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<DemandEventObs> list = null;

		if (useFinderCache) {
			list = (List<DemandEventObs>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemandEventObs demandEventObs : list) {
					if (!uuid.equals(demandEventObs.getUuid()) ||
						(companyId != demandEventObs.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DemandEventObsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<DemandEventObs>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (demandEventObs != null) {
			return demandEventObs;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDemandEventObsException(sb.toString());
	}

	/**
	 * Returns the first demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DemandEventObs> orderByComparator) {

		List<DemandEventObs> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (demandEventObs != null) {
			return demandEventObs;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDemandEventObsException(sb.toString());
	}

	/**
	 * Returns the last demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DemandEventObs> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DemandEventObs> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs[] findByUuid_C_PrevAndNext(
			long idDemand, String uuid, long companyId,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		uuid = Objects.toString(uuid, "");

		DemandEventObs demandEventObs = findByPrimaryKey(idDemand);

		Session session = null;

		try {
			session = openSession();

			DemandEventObs[] array = new DemandEventObsImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, demandEventObs, uuid, companyId, orderByComparator,
				true);

			array[1] = demandEventObs;

			array[2] = getByUuid_C_PrevAndNext(
				session, demandEventObs, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DemandEventObs getByUuid_C_PrevAndNext(
		Session session, DemandEventObs demandEventObs, String uuid,
		long companyId, OrderByComparator<DemandEventObs> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(DemandEventObsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						demandEventObs)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemandEventObs> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demand event obses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DemandEventObs demandEventObs :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(demandEventObs);
		}
	}

	/**
	 * Returns the number of demand event obses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching demand event obses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DEMANDEVENTOBS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"demandEventObs.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(demandEventObs.uuid IS NULL OR demandEventObs.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"demandEventObs.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByStatus;
	private FinderPath _finderPathWithoutPaginationFindByStatus;
	private FinderPath _finderPathCountByStatus;

	/**
	 * Returns all the demand event obses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByStatus(String status) {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demand event obses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByStatus(
		String status, int start, int end) {

		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the demand event obses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByStatus(
		String status, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return findByStatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demand event obses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching demand event obses
	 */
	@Override
	public List<DemandEventObs> findByStatus(
		String status, int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<DemandEventObs> list = null;

		if (useFinderCache) {
			list = (List<DemandEventObs>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DemandEventObs demandEventObs : list) {
					if (!status.equals(demandEventObs.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DemandEventObsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<DemandEventObs>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByStatus_First(
			String status, OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByStatus_First(
			status, orderByComparator);

		if (demandEventObs != null) {
			return demandEventObs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchDemandEventObsException(sb.toString());
	}

	/**
	 * Returns the first demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByStatus_First(
		String status, OrderByComparator<DemandEventObs> orderByComparator) {

		List<DemandEventObs> list = findByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs
	 * @throws NoSuchDemandEventObsException if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs findByStatus_Last(
			String status, OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByStatus_Last(
			status, orderByComparator);

		if (demandEventObs != null) {
			return demandEventObs;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchDemandEventObsException(sb.toString());
	}

	/**
	 * Returns the last demand event obs in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching demand event obs, or <code>null</code> if a matching demand event obs could not be found
	 */
	@Override
	public DemandEventObs fetchByStatus_Last(
		String status, OrderByComparator<DemandEventObs> orderByComparator) {

		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<DemandEventObs> list = findByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the demand event obses before and after the current demand event obs in the ordered set where status = &#63;.
	 *
	 * @param idDemand the primary key of the current demand event obs
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs[] findByStatus_PrevAndNext(
			long idDemand, String status,
			OrderByComparator<DemandEventObs> orderByComparator)
		throws NoSuchDemandEventObsException {

		status = Objects.toString(status, "");

		DemandEventObs demandEventObs = findByPrimaryKey(idDemand);

		Session session = null;

		try {
			session = openSession();

			DemandEventObs[] array = new DemandEventObsImpl[3];

			array[0] = getByStatus_PrevAndNext(
				session, demandEventObs, status, orderByComparator, true);

			array[1] = demandEventObs;

			array[2] = getByStatus_PrevAndNext(
				session, demandEventObs, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DemandEventObs getByStatus_PrevAndNext(
		Session session, DemandEventObs demandEventObs, String status,
		OrderByComparator<DemandEventObs> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DEMANDEVENTOBS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_STATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(DemandEventObsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						demandEventObs)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DemandEventObs> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the demand event obses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeByStatus(String status) {
		for (DemandEventObs demandEventObs :
				findByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(demandEventObs);
		}
	}

	/**
	 * Returns the number of demand event obses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching demand event obses
	 */
	@Override
	public int countByStatus(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DEMANDEVENTOBS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 =
		"demandEventObs.status = ?";

	private static final String _FINDER_COLUMN_STATUS_STATUS_3 =
		"(demandEventObs.status IS NULL OR demandEventObs.status = '')";

	public DemandEventObsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DemandEventObs.class);

		setModelImplClass(DemandEventObsImpl.class);
		setModelPKClass(long.class);

		setTable(DemandEventObsTable.INSTANCE);
	}

	/**
	 * Caches the demand event obs in the entity cache if it is enabled.
	 *
	 * @param demandEventObs the demand event obs
	 */
	@Override
	public void cacheResult(DemandEventObs demandEventObs) {
		entityCache.putResult(
			DemandEventObsImpl.class, demandEventObs.getPrimaryKey(),
			demandEventObs);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				demandEventObs.getUuid(), demandEventObs.getGroupId()
			},
			demandEventObs);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the demand event obses in the entity cache if it is enabled.
	 *
	 * @param demandEventObses the demand event obses
	 */
	@Override
	public void cacheResult(List<DemandEventObs> demandEventObses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (demandEventObses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DemandEventObs demandEventObs : demandEventObses) {
			if (entityCache.getResult(
					DemandEventObsImpl.class, demandEventObs.getPrimaryKey()) ==
						null) {

				cacheResult(demandEventObs);
			}
		}
	}

	/**
	 * Clears the cache for all demand event obses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DemandEventObsImpl.class);

		finderCache.clearCache(DemandEventObsImpl.class);
	}

	/**
	 * Clears the cache for the demand event obs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DemandEventObs demandEventObs) {
		entityCache.removeResult(DemandEventObsImpl.class, demandEventObs);
	}

	@Override
	public void clearCache(List<DemandEventObs> demandEventObses) {
		for (DemandEventObs demandEventObs : demandEventObses) {
			entityCache.removeResult(DemandEventObsImpl.class, demandEventObs);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DemandEventObsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DemandEventObsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DemandEventObsModelImpl demandEventObsModelImpl) {

		Object[] args = new Object[] {
			demandEventObsModelImpl.getUuid(),
			demandEventObsModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, demandEventObsModelImpl);
	}

	/**
	 * Creates a new demand event obs with the primary key. Does not add the demand event obs to the database.
	 *
	 * @param idDemand the primary key for the new demand event obs
	 * @return the new demand event obs
	 */
	@Override
	public DemandEventObs create(long idDemand) {
		DemandEventObs demandEventObs = new DemandEventObsImpl();

		demandEventObs.setNew(true);
		demandEventObs.setPrimaryKey(idDemand);

		String uuid = _portalUUID.generate();

		demandEventObs.setUuid(uuid);

		demandEventObs.setCompanyId(CompanyThreadLocal.getCompanyId());

		return demandEventObs;
	}

	/**
	 * Removes the demand event obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs that was removed
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs remove(long idDemand)
		throws NoSuchDemandEventObsException {

		return remove((Serializable)idDemand);
	}

	/**
	 * Removes the demand event obs with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the demand event obs
	 * @return the demand event obs that was removed
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs remove(Serializable primaryKey)
		throws NoSuchDemandEventObsException {

		Session session = null;

		try {
			session = openSession();

			DemandEventObs demandEventObs = (DemandEventObs)session.get(
				DemandEventObsImpl.class, primaryKey);

			if (demandEventObs == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDemandEventObsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(demandEventObs);
		}
		catch (NoSuchDemandEventObsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DemandEventObs removeImpl(DemandEventObs demandEventObs) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(demandEventObs)) {
				demandEventObs = (DemandEventObs)session.get(
					DemandEventObsImpl.class,
					demandEventObs.getPrimaryKeyObj());
			}

			if (demandEventObs != null) {
				session.delete(demandEventObs);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (demandEventObs != null) {
			clearCache(demandEventObs);
		}

		return demandEventObs;
	}

	@Override
	public DemandEventObs updateImpl(DemandEventObs demandEventObs) {
		boolean isNew = demandEventObs.isNew();

		if (!(demandEventObs instanceof DemandEventObsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(demandEventObs.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					demandEventObs);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in demandEventObs proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DemandEventObs implementation " +
					demandEventObs.getClass());
		}

		DemandEventObsModelImpl demandEventObsModelImpl =
			(DemandEventObsModelImpl)demandEventObs;

		if (Validator.isNull(demandEventObs.getUuid())) {
			String uuid = _portalUUID.generate();

			demandEventObs.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (demandEventObs.getCreateDate() == null)) {
			if (serviceContext == null) {
				demandEventObs.setCreateDate(date);
			}
			else {
				demandEventObs.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!demandEventObsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				demandEventObs.setModifiedDate(date);
			}
			else {
				demandEventObs.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(demandEventObs);
			}
			else {
				demandEventObs = (DemandEventObs)session.merge(demandEventObs);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DemandEventObsImpl.class, demandEventObsModelImpl, false, true);

		cacheUniqueFindersCache(demandEventObsModelImpl);

		if (isNew) {
			demandEventObs.setNew(false);
		}

		demandEventObs.resetOriginalValues();

		return demandEventObs;
	}

	/**
	 * Returns the demand event obs with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the demand event obs
	 * @return the demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDemandEventObsException {

		DemandEventObs demandEventObs = fetchByPrimaryKey(primaryKey);

		if (demandEventObs == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDemandEventObsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return demandEventObs;
	}

	/**
	 * Returns the demand event obs with the primary key or throws a <code>NoSuchDemandEventObsException</code> if it could not be found.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs
	 * @throws NoSuchDemandEventObsException if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs findByPrimaryKey(long idDemand)
		throws NoSuchDemandEventObsException {

		return findByPrimaryKey((Serializable)idDemand);
	}

	/**
	 * Returns the demand event obs with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idDemand the primary key of the demand event obs
	 * @return the demand event obs, or <code>null</code> if a demand event obs with the primary key could not be found
	 */
	@Override
	public DemandEventObs fetchByPrimaryKey(long idDemand) {
		return fetchByPrimaryKey((Serializable)idDemand);
	}

	/**
	 * Returns all the demand event obses.
	 *
	 * @return the demand event obses
	 */
	@Override
	public List<DemandEventObs> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @return the range of demand event obses
	 */
	@Override
	public List<DemandEventObs> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of demand event obses
	 */
	@Override
	public List<DemandEventObs> findAll(
		int start, int end,
		OrderByComparator<DemandEventObs> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the demand event obses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DemandEventObsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of demand event obses
	 * @param end the upper bound of the range of demand event obses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of demand event obses
	 */
	@Override
	public List<DemandEventObs> findAll(
		int start, int end, OrderByComparator<DemandEventObs> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<DemandEventObs> list = null;

		if (useFinderCache) {
			list = (List<DemandEventObs>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DEMANDEVENTOBS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DEMANDEVENTOBS;

				sql = sql.concat(DemandEventObsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DemandEventObs>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the demand event obses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DemandEventObs demandEventObs : findAll()) {
			remove(demandEventObs);
		}
	}

	/**
	 * Returns the number of demand event obses.
	 *
	 * @return the number of demand event obses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DEMANDEVENTOBS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "idDemand";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DEMANDEVENTOBS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DemandEventObsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the demand event obs persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_setDemandEventObsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setDemandEventObsUtilPersistence(null);

		entityCache.removeCache(DemandEventObsImpl.class.getName());
	}

	private void _setDemandEventObsUtilPersistence(
		DemandEventObsPersistence demandEventObsPersistence) {

		try {
			Field field = DemandEventObsUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, demandEventObsPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = OBSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OBSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OBSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DEMANDEVENTOBS =
		"SELECT demandEventObs FROM DemandEventObs demandEventObs";

	private static final String _SQL_SELECT_DEMANDEVENTOBS_WHERE =
		"SELECT demandEventObs FROM DemandEventObs demandEventObs WHERE ";

	private static final String _SQL_COUNT_DEMANDEVENTOBS =
		"SELECT COUNT(demandEventObs) FROM DemandEventObs demandEventObs";

	private static final String _SQL_COUNT_DEMANDEVENTOBS_WHERE =
		"SELECT COUNT(demandEventObs) FROM DemandEventObs demandEventObs WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "demandEventObs.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DemandEventObs exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DemandEventObs exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DemandEventObsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}