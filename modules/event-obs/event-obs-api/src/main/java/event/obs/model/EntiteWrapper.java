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
 * This class is a wrapper for {@link Entite}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entite
 * @generated
 */
public class EntiteWrapper
	extends BaseModelWrapper<Entite> implements Entite, ModelWrapper<Entite> {

	public EntiteWrapper(Entite entite) {
		super(entite);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idEntite", getIdEntite());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("libelle", getLibelle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idEntite = (Long)attributes.get("idEntite");

		if (idEntite != null) {
			setIdEntite(idEntite);
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

		String libelle = (String)attributes.get("libelle");

		if (libelle != null) {
			setLibelle(libelle);
		}
	}

	@Override
	public Entite cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this entite.
	 *
	 * @return the company ID of this entite
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this entite.
	 *
	 * @return the create date of this entite
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this entite.
	 *
	 * @return the group ID of this entite
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id entite of this entite.
	 *
	 * @return the id entite of this entite
	 */
	@Override
	public long getIdEntite() {
		return model.getIdEntite();
	}

	/**
	 * Returns the libelle of this entite.
	 *
	 * @return the libelle of this entite
	 */
	@Override
	public String getLibelle() {
		return model.getLibelle();
	}

	/**
	 * Returns the modified date of this entite.
	 *
	 * @return the modified date of this entite
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this entite.
	 *
	 * @return the primary key of this entite
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this entite.
	 *
	 * @return the uuid of this entite
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
	 * Sets the company ID of this entite.
	 *
	 * @param companyId the company ID of this entite
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this entite.
	 *
	 * @param createDate the create date of this entite
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this entite.
	 *
	 * @param groupId the group ID of this entite
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id entite of this entite.
	 *
	 * @param idEntite the id entite of this entite
	 */
	@Override
	public void setIdEntite(long idEntite) {
		model.setIdEntite(idEntite);
	}

	/**
	 * Sets the libelle of this entite.
	 *
	 * @param libelle the libelle of this entite
	 */
	@Override
	public void setLibelle(String libelle) {
		model.setLibelle(libelle);
	}

	/**
	 * Sets the modified date of this entite.
	 *
	 * @param modifiedDate the modified date of this entite
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this entite.
	 *
	 * @param primaryKey the primary key of this entite
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this entite.
	 *
	 * @param uuid the uuid of this entite
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
	protected EntiteWrapper wrap(Entite entite) {
		return new EntiteWrapper(entite);
	}

}