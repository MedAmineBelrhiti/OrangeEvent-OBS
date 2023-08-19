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
 * This class is a wrapper for {@link DemandEventObs}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemandEventObs
 * @generated
 */
public class DemandEventObsWrapper
	extends BaseModelWrapper<DemandEventObs>
	implements DemandEventObs, ModelWrapper<DemandEventObs> {

	public DemandEventObsWrapper(DemandEventObs demandEventObs) {
		super(demandEventObs);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idDemand", getIdDemand());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("content", getContent());
		attributes.put("status", getStatus());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idDemand = (Long)attributes.get("idDemand");

		if (idDemand != null) {
			setIdDemand(idDemand);
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

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}
	}

	@Override
	public DemandEventObs cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this demand event obs.
	 *
	 * @return the company ID of this demand event obs
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the content of this demand event obs.
	 *
	 * @return the content of this demand event obs
	 */
	@Override
	public String getContent() {
		return model.getContent();
	}

	/**
	 * Returns the create date of this demand event obs.
	 *
	 * @return the create date of this demand event obs
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the first name of this demand event obs.
	 *
	 * @return the first name of this demand event obs
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this demand event obs.
	 *
	 * @return the group ID of this demand event obs
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id demand of this demand event obs.
	 *
	 * @return the id demand of this demand event obs
	 */
	@Override
	public long getIdDemand() {
		return model.getIdDemand();
	}

	/**
	 * Returns the last name of this demand event obs.
	 *
	 * @return the last name of this demand event obs
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the modified date of this demand event obs.
	 *
	 * @return the modified date of this demand event obs
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this demand event obs.
	 *
	 * @return the primary key of this demand event obs
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this demand event obs.
	 *
	 * @return the status of this demand event obs
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the uuid of this demand event obs.
	 *
	 * @return the uuid of this demand event obs
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
	 * Sets the company ID of this demand event obs.
	 *
	 * @param companyId the company ID of this demand event obs
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this demand event obs.
	 *
	 * @param content the content of this demand event obs
	 */
	@Override
	public void setContent(String content) {
		model.setContent(content);
	}

	/**
	 * Sets the create date of this demand event obs.
	 *
	 * @param createDate the create date of this demand event obs
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the first name of this demand event obs.
	 *
	 * @param firstName the first name of this demand event obs
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this demand event obs.
	 *
	 * @param groupId the group ID of this demand event obs
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id demand of this demand event obs.
	 *
	 * @param idDemand the id demand of this demand event obs
	 */
	@Override
	public void setIdDemand(long idDemand) {
		model.setIdDemand(idDemand);
	}

	/**
	 * Sets the last name of this demand event obs.
	 *
	 * @param lastName the last name of this demand event obs
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the modified date of this demand event obs.
	 *
	 * @param modifiedDate the modified date of this demand event obs
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this demand event obs.
	 *
	 * @param primaryKey the primary key of this demand event obs
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this demand event obs.
	 *
	 * @param status the status of this demand event obs
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the uuid of this demand event obs.
	 *
	 * @param uuid the uuid of this demand event obs
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
	protected DemandEventObsWrapper wrap(DemandEventObs demandEventObs) {
		return new DemandEventObsWrapper(demandEventObs);
	}

}