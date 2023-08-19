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

package event.obs.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Transport}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Transport
 * @generated
 */
public class TransportWrapper
	extends BaseModelWrapper<Transport>
	implements ModelWrapper<Transport>, Transport {

	public TransportWrapper(Transport transport) {
		super(transport);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idTransport", getIdTransport());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("collec", isCollec());
		attributes.put("prive", isPrive());
		attributes.put("idEvent", getIdEvent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idTransport = (Long)attributes.get("idTransport");

		if (idTransport != null) {
			setIdTransport(idTransport);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Boolean collec = (Boolean)attributes.get("collec");

		if (collec != null) {
			setCollec(collec);
		}

		Boolean prive = (Boolean)attributes.get("prive");

		if (prive != null) {
			setPrive(prive);
		}

		Long idEvent = (Long)attributes.get("idEvent");

		if (idEvent != null) {
			setIdEvent(idEvent);
		}
	}

	@Override
	public Transport cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the collec of this transport.
	 *
	 * @return the collec of this transport
	 */
	@Override
	public boolean getCollec() {
		return model.getCollec();
	}

	/**
	 * Returns the company ID of this transport.
	 *
	 * @return the company ID of this transport
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this transport.
	 *
	 * @return the create date of this transport
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this transport.
	 *
	 * @return the group ID of this transport
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id event of this transport.
	 *
	 * @return the id event of this transport
	 */
	@Override
	public long getIdEvent() {
		return model.getIdEvent();
	}

	/**
	 * Returns the id transport of this transport.
	 *
	 * @return the id transport of this transport
	 */
	@Override
	public long getIdTransport() {
		return model.getIdTransport();
	}

	/**
	 * Returns the modified date of this transport.
	 *
	 * @return the modified date of this transport
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this transport.
	 *
	 * @return the primary key of this transport
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prive of this transport.
	 *
	 * @return the prive of this transport
	 */
	@Override
	public boolean getPrive() {
		return model.getPrive();
	}

	/**
	 * Returns the uuid of this transport.
	 *
	 * @return the uuid of this transport
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this transport is collec.
	 *
	 * @return <code>true</code> if this transport is collec; <code>false</code> otherwise
	 */
	@Override
	public boolean isCollec() {
		return model.isCollec();
	}

	/**
	 * Returns <code>true</code> if this transport is prive.
	 *
	 * @return <code>true</code> if this transport is prive; <code>false</code> otherwise
	 */
	@Override
	public boolean isPrive() {
		return model.isPrive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this transport is collec.
	 *
	 * @param collec the collec of this transport
	 */
	@Override
	public void setCollec(boolean collec) {
		model.setCollec(collec);
	}

	/**
	 * Sets the company ID of this transport.
	 *
	 * @param companyId the company ID of this transport
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this transport.
	 *
	 * @param createDate the create date of this transport
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this transport.
	 *
	 * @param groupId the group ID of this transport
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id event of this transport.
	 *
	 * @param idEvent the id event of this transport
	 */
	@Override
	public void setIdEvent(long idEvent) {
		model.setIdEvent(idEvent);
	}

	/**
	 * Sets the id transport of this transport.
	 *
	 * @param idTransport the id transport of this transport
	 */
	@Override
	public void setIdTransport(long idTransport) {
		model.setIdTransport(idTransport);
	}

	/**
	 * Sets the modified date of this transport.
	 *
	 * @param modifiedDate the modified date of this transport
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this transport.
	 *
	 * @param primaryKey the primary key of this transport
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets whether this transport is prive.
	 *
	 * @param prive the prive of this transport
	 */
	@Override
	public void setPrive(boolean prive) {
		model.setPrive(prive);
	}

	/**
	 * Sets the uuid of this transport.
	 *
	 * @param uuid the uuid of this transport
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TransportWrapper wrap(Transport transport) {
		return new TransportWrapper(transport);
	}

}