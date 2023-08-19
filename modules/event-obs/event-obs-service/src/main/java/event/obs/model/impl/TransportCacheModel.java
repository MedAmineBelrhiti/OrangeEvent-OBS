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

import event.obs.model.Transport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Transport in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TransportCacheModel
	implements CacheModel<Transport>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TransportCacheModel)) {
			return false;
		}

		TransportCacheModel transportCacheModel = (TransportCacheModel)object;

		if (idTransport == transportCacheModel.idTransport) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idTransport);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idTransport=");
		sb.append(idTransport);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", collec=");
		sb.append(collec);
		sb.append(", prive=");
		sb.append(prive);
		sb.append(", idEvent=");
		sb.append(idEvent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Transport toEntityModel() {
		TransportImpl transportImpl = new TransportImpl();

		if (uuid == null) {
			transportImpl.setUuid("");
		}
		else {
			transportImpl.setUuid(uuid);
		}

		transportImpl.setIdTransport(idTransport);
		transportImpl.setGroupId(groupId);
		transportImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			transportImpl.setCreateDate(null);
		}
		else {
			transportImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			transportImpl.setModifiedDate(null);
		}
		else {
			transportImpl.setModifiedDate(new Date(modifiedDate));
		}

		transportImpl.setCollec(collec);
		transportImpl.setPrive(prive);
		transportImpl.setIdEvent(idEvent);

		transportImpl.resetOriginalValues();

		return transportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idTransport = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		collec = objectInput.readBoolean();

		prive = objectInput.readBoolean();

		idEvent = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idTransport);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeBoolean(collec);

		objectOutput.writeBoolean(prive);

		objectOutput.writeLong(idEvent);
	}

	public String uuid;
	public long idTransport;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public boolean collec;
	public boolean prive;
	public long idEvent;

}