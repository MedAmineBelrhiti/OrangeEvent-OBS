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

import event.obs.model.Messaging;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Messaging in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MessagingCacheModel
	implements CacheModel<Messaging>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MessagingCacheModel)) {
			return false;
		}

		MessagingCacheModel messagingCacheModel = (MessagingCacheModel)object;

		if (idMessage == messagingCacheModel.idMessage) {
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
		StringBundler sb = new StringBundler(17);

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
		sb.append(", content=");
		sb.append(content);
		sb.append(", idEvent=");
		sb.append(idEvent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Messaging toEntityModel() {
		MessagingImpl messagingImpl = new MessagingImpl();

		if (uuid == null) {
			messagingImpl.setUuid("");
		}
		else {
			messagingImpl.setUuid(uuid);
		}

		messagingImpl.setIdMessage(idMessage);
		messagingImpl.setGroupId(groupId);
		messagingImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			messagingImpl.setCreateDate(null);
		}
		else {
			messagingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			messagingImpl.setModifiedDate(null);
		}
		else {
			messagingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (content == null) {
			messagingImpl.setContent("");
		}
		else {
			messagingImpl.setContent(content);
		}

		messagingImpl.setIdEvent(idEvent);

		messagingImpl.resetOriginalValues();

		return messagingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idMessage = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		content = objectInput.readUTF();

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

		objectOutput.writeLong(idMessage);

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

		objectOutput.writeLong(idEvent);
	}

	public String uuid;
	public long idMessage;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String content;
	public long idEvent;

}