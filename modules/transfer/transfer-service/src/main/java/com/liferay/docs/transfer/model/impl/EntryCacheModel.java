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

package com.liferay.docs.transfer.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.transfer.model.Entry;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Entry in entity cache.
 *
 * @author liferay
 * @generated
 */
@ProviderType
public class EntryCacheModel implements CacheModel<Entry>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntryCacheModel)) {
			return false;
		}

		EntryCacheModel entryCacheModel = (EntryCacheModel)obj;

		if (entryId == entryCacheModel.entryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", message=");
		sb.append(message);
		sb.append(", transferId=");
		sb.append(transferId);
		sb.append(", type=");
		sb.append(type);
		sb.append(", category=");
		sb.append(category);
		sb.append(", contract=");
		sb.append(contract);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", branch=");
		sb.append(branch);
		sb.append(", unit2=");
		sb.append(unit2);
		sb.append(", branch2=");
		sb.append(branch2);
		sb.append(", comments=");
		sb.append(comments);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Entry toEntityModel() {
		EntryImpl entryImpl = new EntryImpl();

		if (uuid == null) {
			entryImpl.setUuid("");
		}
		else {
			entryImpl.setUuid(uuid);
		}

		entryImpl.setEntryId(entryId);
		entryImpl.setGroupId(groupId);
		entryImpl.setCompanyId(companyId);
		entryImpl.setUserId(userId);

		if (userName == null) {
			entryImpl.setUserName("");
		}
		else {
			entryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			entryImpl.setCreateDate(null);
		}
		else {
			entryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			entryImpl.setModifiedDate(null);
		}
		else {
			entryImpl.setModifiedDate(new Date(modifiedDate));
		}

		entryImpl.setStatus(status);
		entryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			entryImpl.setStatusByUserName("");
		}
		else {
			entryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			entryImpl.setStatusDate(null);
		}
		else {
			entryImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			entryImpl.setName("");
		}
		else {
			entryImpl.setName(name);
		}

		if (email == null) {
			entryImpl.setEmail("");
		}
		else {
			entryImpl.setEmail(email);
		}

		if (message == null) {
			entryImpl.setMessage("");
		}
		else {
			entryImpl.setMessage(message);
		}

		entryImpl.setTransferId(transferId);

		if (type == null) {
			entryImpl.setType("");
		}
		else {
			entryImpl.setType(type);
		}

		if (category == null) {
			entryImpl.setCategory("");
		}
		else {
			entryImpl.setCategory(category);
		}

		if (contract == null) {
			entryImpl.setContract("");
		}
		else {
			entryImpl.setContract(contract);
		}

		if (unit == null) {
			entryImpl.setUnit("");
		}
		else {
			entryImpl.setUnit(unit);
		}

		if (branch == null) {
			entryImpl.setBranch("");
		}
		else {
			entryImpl.setBranch(branch);
		}

		if (unit2 == null) {
			entryImpl.setUnit2("");
		}
		else {
			entryImpl.setUnit2(unit2);
		}

		if (branch2 == null) {
			entryImpl.setBranch2("");
		}
		else {
			entryImpl.setBranch2(branch2);
		}

		if (comments == null) {
			entryImpl.setComments("");
		}
		else {
			entryImpl.setComments(comments);
		}

		entryImpl.resetOriginalValues();

		return entryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		entryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		message = objectInput.readUTF();

		transferId = objectInput.readLong();
		type = objectInput.readUTF();
		category = objectInput.readUTF();
		contract = objectInput.readUTF();
		unit = objectInput.readUTF();
		branch = objectInput.readUTF();
		unit2 = objectInput.readUTF();
		branch2 = objectInput.readUTF();
		comments = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}

		objectOutput.writeLong(transferId);

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (contract == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contract);
		}

		if (unit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unit);
		}

		if (branch == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branch);
		}

		if (unit2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unit2);
		}

		if (branch2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branch2);
		}

		if (comments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comments);
		}
	}

	public String uuid;
	public long entryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String email;
	public String message;
	public long transferId;
	public String type;
	public String category;
	public String contract;
	public String unit;
	public String branch;
	public String unit2;
	public String branch2;
	public String comments;

}