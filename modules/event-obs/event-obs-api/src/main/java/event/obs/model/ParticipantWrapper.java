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
 * This class is a wrapper for {@link Participant}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Participant
 * @generated
 */
public class ParticipantWrapper
	extends BaseModelWrapper<Participant>
	implements ModelWrapper<Participant>, Participant {

	public ParticipantWrapper(Participant participant) {
		super(participant);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idParticipant", getIdParticipant());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("idUser", getIdUser());
		attributes.put("entite", getEntite());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idParticipant = (Long)attributes.get("idParticipant");

		if (idParticipant != null) {
			setIdParticipant(idParticipant);
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

		Long idUser = (Long)attributes.get("idUser");

		if (idUser != null) {
			setIdUser(idUser);
		}

		String entite = (String)attributes.get("entite");

		if (entite != null) {
			setEntite(entite);
		}
	}

	@Override
	public Participant cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this participant.
	 *
	 * @return the company ID of this participant
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this participant.
	 *
	 * @return the create date of this participant
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entite of this participant.
	 *
	 * @return the entite of this participant
	 */
	@Override
	public String getEntite() {
		return model.getEntite();
	}

	/**
	 * Returns the group ID of this participant.
	 *
	 * @return the group ID of this participant
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id participant of this participant.
	 *
	 * @return the id participant of this participant
	 */
	@Override
	public long getIdParticipant() {
		return model.getIdParticipant();
	}

	/**
	 * Returns the id user of this participant.
	 *
	 * @return the id user of this participant
	 */
	@Override
	public long getIdUser() {
		return model.getIdUser();
	}

	/**
	 * Returns the modified date of this participant.
	 *
	 * @return the modified date of this participant
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this participant.
	 *
	 * @return the primary key of this participant
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this participant.
	 *
	 * @return the uuid of this participant
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
	 * Sets the company ID of this participant.
	 *
	 * @param companyId the company ID of this participant
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this participant.
	 *
	 * @param createDate the create date of this participant
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entite of this participant.
	 *
	 * @param entite the entite of this participant
	 */
	@Override
	public void setEntite(String entite) {
		model.setEntite(entite);
	}

	/**
	 * Sets the group ID of this participant.
	 *
	 * @param groupId the group ID of this participant
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id participant of this participant.
	 *
	 * @param idParticipant the id participant of this participant
	 */
	@Override
	public void setIdParticipant(long idParticipant) {
		model.setIdParticipant(idParticipant);
	}

	/**
	 * Sets the id user of this participant.
	 *
	 * @param idUser the id user of this participant
	 */
	@Override
	public void setIdUser(long idUser) {
		model.setIdUser(idUser);
	}

	/**
	 * Sets the modified date of this participant.
	 *
	 * @param modifiedDate the modified date of this participant
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this participant.
	 *
	 * @param primaryKey the primary key of this participant
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this participant.
	 *
	 * @param uuid the uuid of this participant
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
	protected ParticipantWrapper wrap(Participant participant) {
		return new ParticipantWrapper(participant);
	}

}