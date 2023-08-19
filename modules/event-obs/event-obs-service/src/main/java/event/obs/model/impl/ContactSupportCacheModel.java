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

import event.obs.model.ContactSupport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ContactSupport in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ContactSupportCacheModel
	implements CacheModel<ContactSupport>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ContactSupportCacheModel)) {
			return false;
		}

		ContactSupportCacheModel contactSupportCacheModel =
			(ContactSupportCacheModel)object;

		if (idMessage == contactSupportCacheModel.idMessage) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idMessage);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idMessage=");
		sb.append(idMessage);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nom=");
		sb.append(nom);
		sb.append(", prenom=");
		sb.append(prenom);
		sb.append(", entite=");
		sb.append(entite);
		sb.append(", objet=");
		sb.append(objet);
		sb.append(", email=");
		sb.append(email);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ContactSupport toEntityModel() {
		ContactSupportImpl contactSupportImpl = new ContactSupportImpl();

		if (uuid == null) {
			contactSupportImpl.setUuid("");
		}
		else {
			contactSupportImpl.setUuid(uuid);
		}

		contactSupportImpl.setIdMessage(idMessage);
		contactSupportImpl.setGroupId(groupId);
		contactSupportImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			contactSupportImpl.setCreateDate(null);
		}
		else {
			contactSupportImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			contactSupportImpl.setModifiedDate(null);
		}
		else {
			contactSupportImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nom == null) {
			contactSupportImpl.setNom("");
		}
		else {
			contactSupportImpl.setNom(nom);
		}

		if (prenom == null) {
			contactSupportImpl.setPrenom("");
		}
		else {
			contactSupportImpl.setPrenom(prenom);
		}

		if (entite == null) {
			contactSupportImpl.setEntite("");
		}
		else {
			contactSupportImpl.setEntite(entite);
		}

		if (objet == null) {
			contactSupportImpl.setObjet("");
		}
		else {
			contactSupportImpl.setObjet(objet);
		}

		if (email == null) {
			contactSupportImpl.setEmail("");
		}
		else {
			contactSupportImpl.setEmail(email);
		}

		if (telephone == null) {
			contactSupportImpl.setTelephone("");
		}
		else {
			contactSupportImpl.setTelephone(telephone);
		}

		if (message == null) {
			contactSupportImpl.setMessage("");
		}
		else {
			contactSupportImpl.setMessage(message);
		}

		contactSupportImpl.resetOriginalValues();

		return contactSupportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idMessage = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nom = objectInput.readUTF();
		prenom = objectInput.readUTF();
		entite = objectInput.readUTF();
		objet = objectInput.readUTF();
		email = objectInput.readUTF();
		telephone = objectInput.readUTF();
		message = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idMessage);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

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

		if (objet == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(objet);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}
	}

	public String uuid;
	public long idMessage;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String nom;
	public String prenom;
	public String entite;
	public String objet;
	public String email;
	public String telephone;
	public String message;

}