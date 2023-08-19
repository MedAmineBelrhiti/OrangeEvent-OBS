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
 * This class is a wrapper for {@link Reservation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reservation
 * @generated
 */
public class ReservationWrapper
	extends BaseModelWrapper<Reservation>
	implements ModelWrapper<Reservation>, Reservation {

	public ReservationWrapper(Reservation reservation) {
		super(reservation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idReservation", getIdReservation());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nom", getNom());
		attributes.put("prenom", getPrenom());
		attributes.put("entite", getEntite());
		attributes.put("descriptionEvent", getDescriptionEvent());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idReservation = (Long)attributes.get("idReservation");

		if (idReservation != null) {
			setIdReservation(idReservation);
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

		String descriptionEvent = (String)attributes.get("descriptionEvent");

		if (descriptionEvent != null) {
			setDescriptionEvent(descriptionEvent);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public Reservation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this reservation.
	 *
	 * @return the company ID of this reservation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this reservation.
	 *
	 * @return the create date of this reservation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description event of this reservation.
	 *
	 * @return the description event of this reservation
	 */
	@Override
	public String getDescriptionEvent() {
		return model.getDescriptionEvent();
	}

	/**
	 * Returns the entite of this reservation.
	 *
	 * @return the entite of this reservation
	 */
	@Override
	public String getEntite() {
		return model.getEntite();
	}

	/**
	 * Returns the group ID of this reservation.
	 *
	 * @return the group ID of this reservation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id reservation of this reservation.
	 *
	 * @return the id reservation of this reservation
	 */
	@Override
	public long getIdReservation() {
		return model.getIdReservation();
	}

	/**
	 * Returns the modified date of this reservation.
	 *
	 * @return the modified date of this reservation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nom of this reservation.
	 *
	 * @return the nom of this reservation
	 */
	@Override
	public String getNom() {
		return model.getNom();
	}

	/**
	 * Returns the prenom of this reservation.
	 *
	 * @return the prenom of this reservation
	 */
	@Override
	public String getPrenom() {
		return model.getPrenom();
	}

	/**
	 * Returns the primary key of this reservation.
	 *
	 * @return the primary key of this reservation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this reservation.
	 *
	 * @return the status of this reservation
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the uuid of this reservation.
	 *
	 * @return the uuid of this reservation
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
	 * Sets the company ID of this reservation.
	 *
	 * @param companyId the company ID of this reservation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this reservation.
	 *
	 * @param createDate the create date of this reservation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description event of this reservation.
	 *
	 * @param descriptionEvent the description event of this reservation
	 */
	@Override
	public void setDescriptionEvent(String descriptionEvent) {
		model.setDescriptionEvent(descriptionEvent);
	}

	/**
	 * Sets the entite of this reservation.
	 *
	 * @param entite the entite of this reservation
	 */
	@Override
	public void setEntite(String entite) {
		model.setEntite(entite);
	}

	/**
	 * Sets the group ID of this reservation.
	 *
	 * @param groupId the group ID of this reservation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id reservation of this reservation.
	 *
	 * @param idReservation the id reservation of this reservation
	 */
	@Override
	public void setIdReservation(long idReservation) {
		model.setIdReservation(idReservation);
	}

	/**
	 * Sets the modified date of this reservation.
	 *
	 * @param modifiedDate the modified date of this reservation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nom of this reservation.
	 *
	 * @param nom the nom of this reservation
	 */
	@Override
	public void setNom(String nom) {
		model.setNom(nom);
	}

	/**
	 * Sets the prenom of this reservation.
	 *
	 * @param prenom the prenom of this reservation
	 */
	@Override
	public void setPrenom(String prenom) {
		model.setPrenom(prenom);
	}

	/**
	 * Sets the primary key of this reservation.
	 *
	 * @param primaryKey the primary key of this reservation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this reservation.
	 *
	 * @param status the status of this reservation
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the uuid of this reservation.
	 *
	 * @param uuid the uuid of this reservation
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
	protected ReservationWrapper wrap(Reservation reservation) {
		return new ReservationWrapper(reservation);
	}

}