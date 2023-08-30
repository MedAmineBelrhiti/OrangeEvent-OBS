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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Reservation service. Represents a row in the &quot;OBS_Reservation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>event.obs.model.impl.ReservationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>event.obs.model.impl.ReservationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reservation
 * @generated
 */
@ProviderType
public interface ReservationModel
	extends BaseModel<Reservation>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a reservation model instance should use the {@link Reservation} interface instead.
	 */

	/**
	 * Returns the primary key of this reservation.
	 *
	 * @return the primary key of this reservation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this reservation.
	 *
	 * @param primaryKey the primary key of this reservation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this reservation.
	 *
	 * @return the uuid of this reservation
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this reservation.
	 *
	 * @param uuid the uuid of this reservation
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the id reservation of this reservation.
	 *
	 * @return the id reservation of this reservation
	 */
	public long getIdReservation();

	/**
	 * Sets the id reservation of this reservation.
	 *
	 * @param idReservation the id reservation of this reservation
	 */
	public void setIdReservation(long idReservation);

	/**
	 * Returns the group ID of this reservation.
	 *
	 * @return the group ID of this reservation
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this reservation.
	 *
	 * @param groupId the group ID of this reservation
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this reservation.
	 *
	 * @return the company ID of this reservation
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this reservation.
	 *
	 * @param companyId the company ID of this reservation
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this reservation.
	 *
	 * @return the create date of this reservation
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this reservation.
	 *
	 * @param createDate the create date of this reservation
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this reservation.
	 *
	 * @return the modified date of this reservation
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this reservation.
	 *
	 * @param modifiedDate the modified date of this reservation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the id user of this reservation.
	 *
	 * @return the id user of this reservation
	 */
	public long getIdUser();

	/**
	 * Sets the id user of this reservation.
	 *
	 * @param idUser the id user of this reservation
	 */
	public void setIdUser(long idUser);

	/**
	 * Returns the id event of this reservation.
	 *
	 * @return the id event of this reservation
	 */
	public long getIdEvent();

	/**
	 * Sets the id event of this reservation.
	 *
	 * @param idEvent the id event of this reservation
	 */
	public void setIdEvent(long idEvent);

	/**
	 * Returns the nom of this reservation.
	 *
	 * @return the nom of this reservation
	 */
	@AutoEscape
	public String getNom();

	/**
	 * Sets the nom of this reservation.
	 *
	 * @param nom the nom of this reservation
	 */
	public void setNom(String nom);

	/**
	 * Returns the prenom of this reservation.
	 *
	 * @return the prenom of this reservation
	 */
	@AutoEscape
	public String getPrenom();

	/**
	 * Sets the prenom of this reservation.
	 *
	 * @param prenom the prenom of this reservation
	 */
	public void setPrenom(String prenom);

	/**
	 * Returns the entite of this reservation.
	 *
	 * @return the entite of this reservation
	 */
	@AutoEscape
	public String getEntite();

	/**
	 * Sets the entite of this reservation.
	 *
	 * @param entite the entite of this reservation
	 */
	public void setEntite(String entite);

	@Override
	public Reservation cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}