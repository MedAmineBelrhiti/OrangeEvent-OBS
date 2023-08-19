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

import event.obs.model.EvenementObs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EvenementObs in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EvenementObsCacheModel
	implements CacheModel<EvenementObs>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EvenementObsCacheModel)) {
			return false;
		}

		EvenementObsCacheModel evenementObsCacheModel =
			(EvenementObsCacheModel)object;

		if (idEvent == evenementObsCacheModel.idEvent) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idEvent);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idEvent=");
		sb.append(idEvent);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", titre=");
		sb.append(titre);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append(", lieu=");
		sb.append(lieu);
		sb.append(", description=");
		sb.append(description);
		sb.append(", votingEndDate=");
		sb.append(votingEndDate);
		sb.append(", nbrUserMax=");
		sb.append(nbrUserMax);
		sb.append(", nbrUserConfirmed=");
		sb.append(nbrUserConfirmed);
		sb.append(", managerName=");
		sb.append(managerName);
		sb.append(", entityName=");
		sb.append(entityName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EvenementObs toEntityModel() {
		EvenementObsImpl evenementObsImpl = new EvenementObsImpl();

		if (uuid == null) {
			evenementObsImpl.setUuid("");
		}
		else {
			evenementObsImpl.setUuid(uuid);
		}

		evenementObsImpl.setIdEvent(idEvent);
		evenementObsImpl.setGroupId(groupId);
		evenementObsImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			evenementObsImpl.setCreateDate(null);
		}
		else {
			evenementObsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			evenementObsImpl.setModifiedDate(null);
		}
		else {
			evenementObsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (titre == null) {
			evenementObsImpl.setTitre("");
		}
		else {
			evenementObsImpl.setTitre(titre);
		}

		if (startDate == Long.MIN_VALUE) {
			evenementObsImpl.setStartDate(null);
		}
		else {
			evenementObsImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			evenementObsImpl.setEndDate(null);
		}
		else {
			evenementObsImpl.setEndDate(new Date(endDate));
		}

		if (lieu == null) {
			evenementObsImpl.setLieu("");
		}
		else {
			evenementObsImpl.setLieu(lieu);
		}

		if (description == null) {
			evenementObsImpl.setDescription("");
		}
		else {
			evenementObsImpl.setDescription(description);
		}

		if (votingEndDate == Long.MIN_VALUE) {
			evenementObsImpl.setVotingEndDate(null);
		}
		else {
			evenementObsImpl.setVotingEndDate(new Date(votingEndDate));
		}

		evenementObsImpl.setNbrUserMax(nbrUserMax);
		evenementObsImpl.setNbrUserConfirmed(nbrUserConfirmed);

		if (managerName == null) {
			evenementObsImpl.setManagerName("");
		}
		else {
			evenementObsImpl.setManagerName(managerName);
		}

		if (entityName == null) {
			evenementObsImpl.setEntityName("");
		}
		else {
			evenementObsImpl.setEntityName(entityName);
		}

		evenementObsImpl.resetOriginalValues();

		return evenementObsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idEvent = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		titre = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
		lieu = objectInput.readUTF();
		description = objectInput.readUTF();
		votingEndDate = objectInput.readLong();

		nbrUserMax = objectInput.readInt();

		nbrUserConfirmed = objectInput.readInt();
		managerName = objectInput.readUTF();
		entityName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idEvent);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (titre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titre);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);

		if (lieu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lieu);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(votingEndDate);

		objectOutput.writeInt(nbrUserMax);

		objectOutput.writeInt(nbrUserConfirmed);

		if (managerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerName);
		}

		if (entityName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityName);
		}
	}

	public String uuid;
	public long idEvent;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String titre;
	public long startDate;
	public long endDate;
	public String lieu;
	public String description;
	public long votingEndDate;
	public int nbrUserMax;
	public int nbrUserConfirmed;
	public String managerName;
	public String entityName;

}