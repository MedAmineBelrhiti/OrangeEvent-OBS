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

import event.obs.model.Entite;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Entite in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EntiteCacheModel implements CacheModel<Entite>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EntiteCacheModel)) {
			return false;
		}

		EntiteCacheModel entiteCacheModel = (EntiteCacheModel)object;

		if (idEntite == entiteCacheModel.idEntite) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idEntite);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idEntite=");
		sb.append(idEntite);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", libelle=");
		sb.append(libelle);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entite toEntityModel() {
		EntiteImpl entiteImpl = new EntiteImpl();

		if (uuid == null) {
			entiteImpl.setUuid("");
		}
		else {
			entiteImpl.setUuid(uuid);
		}

		entiteImpl.setIdEntite(idEntite);
		entiteImpl.setGroupId(groupId);
		entiteImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			entiteImpl.setCreateDate(null);
		}
		else {
			entiteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			entiteImpl.setModifiedDate(null);
		}
		else {
			entiteImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (libelle == null) {
			entiteImpl.setLibelle("");
		}
		else {
			entiteImpl.setLibelle(libelle);
		}

		entiteImpl.resetOriginalValues();

		return entiteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idEntite = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		libelle = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idEntite);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (libelle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(libelle);
		}
	}

	public String uuid;
	public long idEntite;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String libelle;

}