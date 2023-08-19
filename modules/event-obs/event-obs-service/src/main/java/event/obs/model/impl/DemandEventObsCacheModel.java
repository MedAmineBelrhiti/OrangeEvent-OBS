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

import event.obs.model.DemandEventObs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DemandEventObs in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DemandEventObsCacheModel
	implements CacheModel<DemandEventObs>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemandEventObsCacheModel)) {
			return false;
		}

		DemandEventObsCacheModel demandEventObsCacheModel =
			(DemandEventObsCacheModel)object;

		if (idDemand == demandEventObsCacheModel.idDemand) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idDemand);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idDemand=");
		sb.append(idDemand);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", content=");
		sb.append(content);
		sb.append(", status=");
		sb.append(status);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DemandEventObs toEntityModel() {
		DemandEventObsImpl demandEventObsImpl = new DemandEventObsImpl();

		if (uuid == null) {
			demandEventObsImpl.setUuid("");
		}
		else {
			demandEventObsImpl.setUuid(uuid);
		}

		demandEventObsImpl.setIdDemand(idDemand);
		demandEventObsImpl.setGroupId(groupId);
		demandEventObsImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			demandEventObsImpl.setCreateDate(null);
		}
		else {
			demandEventObsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			demandEventObsImpl.setModifiedDate(null);
		}
		else {
			demandEventObsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (content == null) {
			demandEventObsImpl.setContent("");
		}
		else {
			demandEventObsImpl.setContent(content);
		}

		if (status == null) {
			demandEventObsImpl.setStatus("");
		}
		else {
			demandEventObsImpl.setStatus(status);
		}

		if (firstName == null) {
			demandEventObsImpl.setFirstName("");
		}
		else {
			demandEventObsImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			demandEventObsImpl.setLastName("");
		}
		else {
			demandEventObsImpl.setLastName(lastName);
		}

		demandEventObsImpl.resetOriginalValues();

		return demandEventObsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idDemand = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		content = objectInput.readUTF();
		status = objectInput.readUTF();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idDemand);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (content == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}
	}

	public String uuid;
	public long idDemand;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String content;
	public String status;
	public String firstName;
	public String lastName;

}