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
 * This class is a wrapper for {@link EvenementObs}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObs
 * @generated
 */
public class EvenementObsWrapper
	extends BaseModelWrapper<EvenementObs>
	implements EvenementObs, ModelWrapper<EvenementObs> {

	public EvenementObsWrapper(EvenementObs evenementObs) {
		super(evenementObs);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idEvent", getIdEvent());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("titre", getTitre());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());
		attributes.put("lieu", getLieu());
		attributes.put("description", getDescription());
		attributes.put("votingEndDate", getVotingEndDate());
		attributes.put("nbrUserMax", getNbrUserMax());
		attributes.put("nbrUserConfirmed", getNbrUserConfirmed());
		attributes.put("managerName", getManagerName());
		attributes.put("entityName", getEntityName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idEvent = (Long)attributes.get("idEvent");

		if (idEvent != null) {
			setIdEvent(idEvent);
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

		String titre = (String)attributes.get("titre");

		if (titre != null) {
			setTitre(titre);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}

		String lieu = (String)attributes.get("lieu");

		if (lieu != null) {
			setLieu(lieu);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date votingEndDate = (Date)attributes.get("votingEndDate");

		if (votingEndDate != null) {
			setVotingEndDate(votingEndDate);
		}

		Integer nbrUserMax = (Integer)attributes.get("nbrUserMax");

		if (nbrUserMax != null) {
			setNbrUserMax(nbrUserMax);
		}

		Integer nbrUserConfirmed = (Integer)attributes.get("nbrUserConfirmed");

		if (nbrUserConfirmed != null) {
			setNbrUserConfirmed(nbrUserConfirmed);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}

		String entityName = (String)attributes.get("entityName");

		if (entityName != null) {
			setEntityName(entityName);
		}
	}

	@Override
	public EvenementObs cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this evenement obs.
	 *
	 * @return the company ID of this evenement obs
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this evenement obs.
	 *
	 * @return the create date of this evenement obs
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this evenement obs.
	 *
	 * @return the description of this evenement obs
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the end date of this evenement obs.
	 *
	 * @return the end date of this evenement obs
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the entity name of this evenement obs.
	 *
	 * @return the entity name of this evenement obs
	 */
	@Override
	public String getEntityName() {
		return model.getEntityName();
	}

	/**
	 * Returns the group ID of this evenement obs.
	 *
	 * @return the group ID of this evenement obs
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id event of this evenement obs.
	 *
	 * @return the id event of this evenement obs
	 */
	@Override
	public long getIdEvent() {
		return model.getIdEvent();
	}

	/**
	 * Returns the lieu of this evenement obs.
	 *
	 * @return the lieu of this evenement obs
	 */
	@Override
	public String getLieu() {
		return model.getLieu();
	}

	/**
	 * Returns the manager name of this evenement obs.
	 *
	 * @return the manager name of this evenement obs
	 */
	@Override
	public String getManagerName() {
		return model.getManagerName();
	}

	/**
	 * Returns the modified date of this evenement obs.
	 *
	 * @return the modified date of this evenement obs
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nbr user confirmed of this evenement obs.
	 *
	 * @return the nbr user confirmed of this evenement obs
	 */
	@Override
	public int getNbrUserConfirmed() {
		return model.getNbrUserConfirmed();
	}

	/**
	 * Returns the nbr user max of this evenement obs.
	 *
	 * @return the nbr user max of this evenement obs
	 */
	@Override
	public int getNbrUserMax() {
		return model.getNbrUserMax();
	}

	/**
	 * Returns the primary key of this evenement obs.
	 *
	 * @return the primary key of this evenement obs
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the start date of this evenement obs.
	 *
	 * @return the start date of this evenement obs
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the titre of this evenement obs.
	 *
	 * @return the titre of this evenement obs
	 */
	@Override
	public String getTitre() {
		return model.getTitre();
	}

	/**
	 * Returns the uuid of this evenement obs.
	 *
	 * @return the uuid of this evenement obs
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the voting end date of this evenement obs.
	 *
	 * @return the voting end date of this evenement obs
	 */
	@Override
	public Date getVotingEndDate() {
		return model.getVotingEndDate();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this evenement obs.
	 *
	 * @param companyId the company ID of this evenement obs
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this evenement obs.
	 *
	 * @param createDate the create date of this evenement obs
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this evenement obs.
	 *
	 * @param description the description of this evenement obs
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the end date of this evenement obs.
	 *
	 * @param endDate the end date of this evenement obs
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the entity name of this evenement obs.
	 *
	 * @param entityName the entity name of this evenement obs
	 */
	@Override
	public void setEntityName(String entityName) {
		model.setEntityName(entityName);
	}

	/**
	 * Sets the group ID of this evenement obs.
	 *
	 * @param groupId the group ID of this evenement obs
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id event of this evenement obs.
	 *
	 * @param idEvent the id event of this evenement obs
	 */
	@Override
	public void setIdEvent(long idEvent) {
		model.setIdEvent(idEvent);
	}

	/**
	 * Sets the lieu of this evenement obs.
	 *
	 * @param lieu the lieu of this evenement obs
	 */
	@Override
	public void setLieu(String lieu) {
		model.setLieu(lieu);
	}

	/**
	 * Sets the manager name of this evenement obs.
	 *
	 * @param managerName the manager name of this evenement obs
	 */
	@Override
	public void setManagerName(String managerName) {
		model.setManagerName(managerName);
	}

	/**
	 * Sets the modified date of this evenement obs.
	 *
	 * @param modifiedDate the modified date of this evenement obs
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nbr user confirmed of this evenement obs.
	 *
	 * @param nbrUserConfirmed the nbr user confirmed of this evenement obs
	 */
	@Override
	public void setNbrUserConfirmed(int nbrUserConfirmed) {
		model.setNbrUserConfirmed(nbrUserConfirmed);
	}

	/**
	 * Sets the nbr user max of this evenement obs.
	 *
	 * @param nbrUserMax the nbr user max of this evenement obs
	 */
	@Override
	public void setNbrUserMax(int nbrUserMax) {
		model.setNbrUserMax(nbrUserMax);
	}

	/**
	 * Sets the primary key of this evenement obs.
	 *
	 * @param primaryKey the primary key of this evenement obs
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the start date of this evenement obs.
	 *
	 * @param startDate the start date of this evenement obs
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the titre of this evenement obs.
	 *
	 * @param titre the titre of this evenement obs
	 */
	@Override
	public void setTitre(String titre) {
		model.setTitre(titre);
	}

	/**
	 * Sets the uuid of this evenement obs.
	 *
	 * @param uuid the uuid of this evenement obs
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the voting end date of this evenement obs.
	 *
	 * @param votingEndDate the voting end date of this evenement obs
	 */
	@Override
	public void setVotingEndDate(Date votingEndDate) {
		model.setVotingEndDate(votingEndDate);
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
	protected EvenementObsWrapper wrap(EvenementObs evenementObs) {
		return new EvenementObsWrapper(evenementObs);
	}

}