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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import event.obs.model.Reservation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Reservation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReservationCacheModel
	implements CacheModel<Reservation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ReservationCacheModel)) {
			return false;
		}

		ReservationCacheModel reservationCacheModel =
			(ReservationCacheModel)object;

		if (idReservation == reservationCacheModel.idReservation) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idReservation);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idReservation=");
		sb.append(idReservation);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", idUser=");
		sb.append(idUser);
		sb.append(", idEvent=");
		sb.append(idEvent);
		sb.append(", nom=");
		sb.append(nom);
		sb.append(", prenom=");
		sb.append(prenom);
		sb.append(", entite=");
		sb.append(entite);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Reservation toEntityModel() {
		ReservationImpl reservationImpl = new ReservationImpl();

		if (uuid == null) {
			reservationImpl.setUuid("");
		}
		else {
			reservationImpl.setUuid(uuid);
		}

		reservationImpl.setIdReservation(idReservation);
		reservationImpl.setGroupId(groupId);
		reservationImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			reservationImpl.setCreateDate(null);
		}
		else {
			reservationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			reservationImpl.setModifiedDate(null);
		}
		else {
			reservationImpl.setModifiedDate(new Date(modifiedDate));
		}

		reservationImpl.setIdUser(idUser);
		reservationImpl.setIdEvent(idEvent);

		if (nom == null) {
			reservationImpl.setNom("");
		}
		else {
			reservationImpl.setNom(nom);
		}

		if (prenom == null) {
			reservationImpl.setPrenom("");
		}
		else {
			reservationImpl.setPrenom(prenom);
		}

		if (entite == null) {
			reservationImpl.setEntite("");
		}
		else {
			reservationImpl.setEntite(entite);
		}

		reservationImpl.resetOriginalValues();

		return reservationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idReservation = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		idUser = objectInput.readLong();

		idEvent = objectInput.readLong();
		nom = objectInput.readUTF();
		prenom = objectInput.readUTF();
		entite = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idReservation);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(idUser);

		objectOutput.writeLong(idEvent);

		if (nom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nom);
		}

		if (prenom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prenom);
		}

		if (entite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entite);
		}
	}

	public String uuid;
	public long idReservation;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long idUser;
	public long idEvent;
	public String nom;
	public String prenom;
	public String entite;

}