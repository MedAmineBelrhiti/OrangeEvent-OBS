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

package event.obs.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import event.obs.model.DemandEventObs;
import event.obs.model.DemandEventObsModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the DemandEventObs service. Represents a row in the &quot;OBS_DemandEventObs&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DemandEventObsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DemandEventObsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObsImpl
 * @generated
 */
@JSON(strict = true)
public class DemandEventObsModelImpl
	extends BaseModelImpl<DemandEventObs> implements DemandEventObsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a demand event obs model instance should use the <code>DemandEventObs</code> interface instead.
	 */
	public static final String TABLE_NAME = "OBS_DemandEventObs";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"idDemand", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"content", Types.VARCHAR}, {"status", Types.VARCHAR},
		{"firstName", Types.VARCHAR}, {"lastName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("idDemand", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("content", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table OBS_DemandEventObs (uuid_ VARCHAR(75) null,idDemand LONG not null primary key,groupId LONG,companyId LONG,createDate DATE null,modifiedDate DATE null,content VARCHAR(75) null,status VARCHAR(75) null,firstName VARCHAR(75) null,lastName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table OBS_DemandEventObs";

	public static final String ORDER_BY_JPQL =
		" ORDER BY demandEventObs.idDemand ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY OBS_DemandEventObs.idDemand ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STATUS_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long IDDEMAND_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public DemandEventObsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idDemand;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdDemand(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idDemand;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DemandEventObs.class;
	}

	@Override
	public String getModelClassName() {
		return DemandEventObs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<DemandEventObs, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<DemandEventObs, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DemandEventObs, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((DemandEventObs)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<DemandEventObs, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<DemandEventObs, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(DemandEventObs)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<DemandEventObs, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<DemandEventObs, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<DemandEventObs, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<DemandEventObs, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<DemandEventObs, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<DemandEventObs, Object>>();
		Map<String, BiConsumer<DemandEventObs, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<DemandEventObs, ?>>();

		attributeGetterFunctions.put("uuid", DemandEventObs::getUuid);
		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<DemandEventObs, String>)DemandEventObs::setUuid);
		attributeGetterFunctions.put("idDemand", DemandEventObs::getIdDemand);
		attributeSetterBiConsumers.put(
			"idDemand",
			(BiConsumer<DemandEventObs, Long>)DemandEventObs::setIdDemand);
		attributeGetterFunctions.put("groupId", DemandEventObs::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<DemandEventObs, Long>)DemandEventObs::setGroupId);
		attributeGetterFunctions.put("companyId", DemandEventObs::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<DemandEventObs, Long>)DemandEventObs::setCompanyId);
		attributeGetterFunctions.put(
			"createDate", DemandEventObs::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<DemandEventObs, Date>)DemandEventObs::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", DemandEventObs::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<DemandEventObs, Date>)DemandEventObs::setModifiedDate);
		attributeGetterFunctions.put("content", DemandEventObs::getContent);
		attributeSetterBiConsumers.put(
			"content",
			(BiConsumer<DemandEventObs, String>)DemandEventObs::setContent);
		attributeGetterFunctions.put("status", DemandEventObs::getStatus);
		attributeSetterBiConsumers.put(
			"status",
			(BiConsumer<DemandEventObs, String>)DemandEventObs::setStatus);
		attributeGetterFunctions.put("firstName", DemandEventObs::getFirstName);
		attributeSetterBiConsumers.put(
			"firstName",
			(BiConsumer<DemandEventObs, String>)DemandEventObs::setFirstName);
		attributeGetterFunctions.put("lastName", DemandEventObs::getLastName);
		attributeSetterBiConsumers.put(
			"lastName",
			(BiConsumer<DemandEventObs, String>)DemandEventObs::setLastName);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getIdDemand() {
		return _idDemand;
	}

	@Override
	public void setIdDemand(long idDemand) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_idDemand = idDemand;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return "";
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_content = content;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return "";
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_status = status;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalStatus() {
		return getColumnOriginalValue("status");
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastName = lastName;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(DemandEventObs.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), DemandEventObs.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DemandEventObs toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, DemandEventObs>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DemandEventObsImpl demandEventObsImpl = new DemandEventObsImpl();

		demandEventObsImpl.setUuid(getUuid());
		demandEventObsImpl.setIdDemand(getIdDemand());
		demandEventObsImpl.setGroupId(getGroupId());
		demandEventObsImpl.setCompanyId(getCompanyId());
		demandEventObsImpl.setCreateDate(getCreateDate());
		demandEventObsImpl.setModifiedDate(getModifiedDate());
		demandEventObsImpl.setContent(getContent());
		demandEventObsImpl.setStatus(getStatus());
		demandEventObsImpl.setFirstName(getFirstName());
		demandEventObsImpl.setLastName(getLastName());

		demandEventObsImpl.resetOriginalValues();

		return demandEventObsImpl;
	}

	@Override
	public DemandEventObs cloneWithOriginalValues() {
		DemandEventObsImpl demandEventObsImpl = new DemandEventObsImpl();

		demandEventObsImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		demandEventObsImpl.setIdDemand(
			this.<Long>getColumnOriginalValue("idDemand"));
		demandEventObsImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		demandEventObsImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		demandEventObsImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		demandEventObsImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		demandEventObsImpl.setContent(
			this.<String>getColumnOriginalValue("content"));
		demandEventObsImpl.setStatus(
			this.<String>getColumnOriginalValue("status"));
		demandEventObsImpl.setFirstName(
			this.<String>getColumnOriginalValue("firstName"));
		demandEventObsImpl.setLastName(
			this.<String>getColumnOriginalValue("lastName"));

		return demandEventObsImpl;
	}

	@Override
	public int compareTo(DemandEventObs demandEventObs) {
		long primaryKey = demandEventObs.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemandEventObs)) {
			return false;
		}

		DemandEventObs demandEventObs = (DemandEventObs)object;

		long primaryKey = demandEventObs.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<DemandEventObs> toCacheModel() {
		DemandEventObsCacheModel demandEventObsCacheModel =
			new DemandEventObsCacheModel();

		demandEventObsCacheModel.uuid = getUuid();

		String uuid = demandEventObsCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			demandEventObsCacheModel.uuid = null;
		}

		demandEventObsCacheModel.idDemand = getIdDemand();

		demandEventObsCacheModel.groupId = getGroupId();

		demandEventObsCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			demandEventObsCacheModel.createDate = createDate.getTime();
		}
		else {
			demandEventObsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			demandEventObsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			demandEventObsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		demandEventObsCacheModel.content = getContent();

		String content = demandEventObsCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			demandEventObsCacheModel.content = null;
		}

		demandEventObsCacheModel.status = getStatus();

		String status = demandEventObsCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			demandEventObsCacheModel.status = null;
		}

		demandEventObsCacheModel.firstName = getFirstName();

		String firstName = demandEventObsCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			demandEventObsCacheModel.firstName = null;
		}

		demandEventObsCacheModel.lastName = getLastName();

		String lastName = demandEventObsCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			demandEventObsCacheModel.lastName = null;
		}

		return demandEventObsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<DemandEventObs, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<DemandEventObs, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DemandEventObs, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((DemandEventObs)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, DemandEventObs>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					DemandEventObs.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _idDemand;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _content;
	private String _status;
	private String _firstName;
	private String _lastName;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<DemandEventObs, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((DemandEventObs)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("idDemand", _idDemand);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("content", _content);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("firstName", _firstName);
		_columnOriginalValues.put("lastName", _lastName);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("idDemand", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("createDate", 16L);

		columnBitmasks.put("modifiedDate", 32L);

		columnBitmasks.put("content", 64L);

		columnBitmasks.put("status", 128L);

		columnBitmasks.put("firstName", 256L);

		columnBitmasks.put("lastName", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private DemandEventObs _escapedModel;

}