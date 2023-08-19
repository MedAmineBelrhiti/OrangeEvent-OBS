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
 * This class is a wrapper for {@link ContactSupport}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupport
 * @generated
 */
public class ContactSupportWrapper
	extends BaseModelWrapper<ContactSupport>
	implements ContactSupport, ModelWrapper<ContactSupport> {

	public ContactSupportWrapper(ContactSupport contactSupport) {
		super(contactSupport);
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
		attributes.put("nom", getNom());
		attributes.put("prenom", getPrenom());
		attributes.put("entite", getEntite());
		attributes.put("objet", getObjet());
		attributes.put("email", getEmail());
		attributes.put("telephone", getTelephone());
		attributes.put("message", getMessage());

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

		String nom = (String)attributes.get("nom");

		if (nom != null) {
			setNom(nom);
		}

		String prenom = (String)attributes.get("prenom");

		if (prenom != null) {
			setPrenom(prenom);
		}

		String entite = (String)attributes.get("entite");

		if (entite != null) {
			setEntite(entite);
		}

		String objet = (String)attributes.get("objet");

		if (objet != null) {
			setObjet(objet);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public ContactSupport cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this contact support.
	 *
	 * @return the company ID of this contact support
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this contact support.
	 *
	 * @return the create date of this contact support
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this contact support.
	 *
	 * @return the email of this contact support
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the entite of this contact support.
	 *
	 * @return the entite of this contact support
	 */
	@Override
	public String getEntite() {
		return model.getEntite();
	}

	/**
	 * Returns the group ID of this contact support.
	 *
	 * @return the group ID of this contact support
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id message of this contact support.
	 *
	 * @return the id message of this contact support
	 */
	@Override
	public long getIdMessage() {
		return model.getIdMessage();
	}

	/**
	 * Returns the message of this contact support.
	 *
	 * @return the message of this contact support
	 */
	@Override
	public String getMessage() {
		return model.getMessage();
	}

	/**
	 * Returns the modified date of this contact support.
	 *
	 * @return the modified date of this contact support
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nom of this contact support.
	 *
	 * @return the nom of this contact support
	 */
	@Override
	public String getNom() {
		return model.getNom();
	}

	/**
	 * Returns the objet of this contact support.
	 *
	 * @return the objet of this contact support
	 */
	@Override
	public String getObjet() {
		return model.getObjet();
	}

	/**
	 * Returns the prenom of this contact support.
	 *
	 * @return the prenom of this contact support
	 */
	@Override
	public String getPrenom() {
		return model.getPrenom();
	}

	/**
	 * Returns the primary key of this contact support.
	 *
	 * @return the primary key of this contact support
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this contact support.
	 *
	 * @return the telephone of this contact support
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the uuid of this contact support.
	 *
	 * @return the uuid of this contact support
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
	 * Sets the company ID of this contact support.
	 *
	 * @param companyId the company ID of this contact support
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this contact support.
	 *
	 * @param createDate the create date of this contact support
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this contact support.
	 *
	 * @param email the email of this contact support
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the entite of this contact support.
	 *
	 * @param entite the entite of this contact support
	 */
	@Override
	public void setEntite(String entite) {
		model.setEntite(entite);
	}

	/**
	 * Sets the group ID of this contact support.
	 *
	 * @param groupId the group ID of this contact support
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id message of this contact support.
	 *
	 * @param idMessage the id message of this contact support
	 */
	@Override
	public void setIdMessage(long idMessage) {
		model.setIdMessage(idMessage);
	}

	/**
	 * Sets the message of this contact support.
	 *
	 * @param message the message of this contact support
	 */
	@Override
	public void setMessage(String message) {
		model.setMessage(message);
	}

	/**
	 * Sets the modified date of this contact support.
	 *
	 * @param modifiedDate the modified date of this contact support
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nom of this contact support.
	 *
	 * @param nom the nom of this contact support
	 */
	@Override
	public void setNom(String nom) {
		model.setNom(nom);
	}

	/**
	 * Sets the objet of this contact support.
	 *
	 * @param objet the objet of this contact support
	 */
	@Override
	public void setObjet(String objet) {
		model.setObjet(objet);
	}

	/**
	 * Sets the prenom of this contact support.
	 *
	 * @param prenom the prenom of this contact support
	 */
	@Override
	public void setPrenom(String prenom) {
		model.setPrenom(prenom);
	}

	/**
	 * Sets the primary key of this contact support.
	 *
	 * @param primaryKey the primary key of this contact support
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this contact support.
	 *
	 * @param telephone the telephone of this contact support
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the uuid of this contact support.
	 *
	 * @param uuid the uuid of this contact support
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
	protected ContactSupportWrapper wrap(ContactSupport contactSupport) {
		return new ContactSupportWrapper(contactSupport);
	}

}