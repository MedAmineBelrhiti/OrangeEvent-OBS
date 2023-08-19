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
 * This class is a wrapper for {@link Messaging}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Messaging
 * @generated
 */
public class MessagingWrapper
	extends BaseModelWrapper<Messaging>
	implements Messaging, ModelWrapper<Messaging> {

	public MessagingWrapper(Messaging messaging) {
		super(messaging);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idMessage", getIdMessage());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("content", getContent());
		attributes.put("idEvent", getIdEvent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idMessage = (Long)attributes.get("idMessage");

		if (idMessage != null) {
			setIdMessage(idMessage);
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

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Long idEvent = (Long)attributes.get("idEvent");

		if (idEvent != null) {
			setIdEvent(idEvent);
		}
	}

	@Override
	public Messaging cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this messaging.
	 *
	 * @return the company ID of this messaging
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the content of this messaging.
	 *
	 * @return the content of this messaging
	 */
	@Override
	public String getContent() {
		return model.getContent();
	}

	/**
	 * Returns the create date of this messaging.
	 *
	 * @return the create date of this messaging
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this messaging.
	 *
	 * @return the group ID of this messaging
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id event of this messaging.
	 *
	 * @return the id event of this messaging
	 */
	@Override
	public long getIdEvent() {
		return model.getIdEvent();
	}

	/**
	 * Returns the id message of this messaging.
	 *
	 * @return the id message of this messaging
	 */
	@Override
	public long getIdMessage() {
		return model.getIdMessage();
	}

	/**
	 * Returns the modified date of this messaging.
	 *
	 * @return the modified date of this messaging
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this messaging.
	 *
	 * @return the primary key of this messaging
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this messaging.
	 *
	 * @return the uuid of this messaging
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this messaging.
	 *
	 * @param companyId the company ID of this messaging
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this messaging.
	 *
	 * @param content the content of this messaging
	 */
	@Override
	public void setContent(String content) {
		model.setContent(content);
	}

	/**
	 * Sets the create date of this messaging.
	 *
	 * @param createDate the create date of this messaging
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this messaging.
	 *
	 * @param groupId the group ID of this messaging
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id event of this messaging.
	 *
	 * @param idEvent the id event of this messaging
	 */
	@Override
	public void setIdEvent(long idEvent) {
		model.setIdEvent(idEvent);
	}

	/**
	 * Sets the id message of this messaging.
	 *
	 * @param idMessage the id message of this messaging
	 */
	@Override
	public void setIdMessage(long idMessage) {
		model.setIdMessage(idMessage);
	}

	/**
	 * Sets the modified date of this messaging.
	 *
	 * @param modifiedDate the modified date of this messaging
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this messaging.
	 *
	 * @param primaryKey the primary key of this messaging
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this messaging.
	 *
	 * @param uuid the uuid of this messaging
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
	protected MessagingWrapper wrap(Messaging messaging) {
		return new MessagingWrapper(messaging);
	}

}