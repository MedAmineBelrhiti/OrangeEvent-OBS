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

import event.obs.model.Participant;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Participant in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ParticipantCacheModel
	implements CacheModel<Participant>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ParticipantCacheModel)) {
			return false;
		}

		ParticipantCacheModel participantCacheModel =
			(ParticipantCacheModel)object;

		if (idParticipant == participantCacheModel.idParticipant) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idParticipant);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idParticipant=");
		sb.append(idParticipant);
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
		sb.append(", entite=");
		sb.append(entite);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Participant toEntityModel() {
		ParticipantImpl participantImpl = new ParticipantImpl();

		if (uuid == null) {
			participantImpl.setUuid("");
		}
		else {
			participantImpl.setUuid(uuid);
		}

		participantImpl.setIdParticipant(idParticipant);
		participantImpl.setGroupId(groupId);
		participantImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			participantImpl.setCreateDate(null);
		}
		else {
			participantImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			participantImpl.setModifiedDate(null);
		}
		else {
			participantImpl.setModifiedDate(new Date(modifiedDate));
		}

		participantImpl.setIdUser(idUser);

		if (entite == null) {
			participantImpl.setEntite("");
		}
		else {
			participantImpl.setEntite(entite);
		}

		participantImpl.resetOriginalValues();

		return participantImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idParticipant = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		idUser = objectInput.readLong();
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

		objectOutput.writeLong(idParticipant);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(idUser);

		if (entite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entite);
		}
	}

	public String uuid;
	public long idParticipant;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long idUser;
	public String entite;

}