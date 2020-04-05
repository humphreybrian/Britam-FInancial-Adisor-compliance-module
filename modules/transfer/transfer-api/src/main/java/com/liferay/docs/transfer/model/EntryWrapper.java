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

package com.liferay.docs.transfer.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Entry}.
 * </p>
 *
 * @author liferay
 * @see Entry
 * @generated
 */
@ProviderType
public class EntryWrapper implements Entry, ModelWrapper<Entry> {

	public EntryWrapper(Entry entry) {
		_entry = entry;
	}

	@Override
	public Class<?> getModelClass() {
		return Entry.class;
	}

	@Override
	public String getModelClassName() {
		return Entry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());
		attributes.put("transferId", getTransferId());
		attributes.put("type", getType());
		attributes.put("category", getCategory());
		attributes.put("contract", getContract());
		attributes.put("unit", getUnit());
		attributes.put("branch", getBranch());
		attributes.put("unit2", getUnit2());
		attributes.put("branch2", getBranch2());
		attributes.put("comments", getComments());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long transferId = (Long)attributes.get("transferId");

		if (transferId != null) {
			setTransferId(transferId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String contract = (String)attributes.get("contract");

		if (contract != null) {
			setContract(contract);
		}

		String unit = (String)attributes.get("unit");

		if (unit != null) {
			setUnit(unit);
		}

		String branch = (String)attributes.get("branch");

		if (branch != null) {
			setBranch(branch);
		}

		String unit2 = (String)attributes.get("unit2");

		if (unit2 != null) {
			setUnit2(unit2);
		}

		String branch2 = (String)attributes.get("branch2");

		if (branch2 != null) {
			setBranch2(branch2);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}
	}

	@Override
	public Object clone() {
		return new EntryWrapper((Entry)_entry.clone());
	}

	@Override
	public int compareTo(Entry entry) {
		return _entry.compareTo(entry);
	}

	/**
	 * Returns the branch of this entry.
	 *
	 * @return the branch of this entry
	 */
	@Override
	public String getBranch() {
		return _entry.getBranch();
	}

	/**
	 * Returns the branch2 of this entry.
	 *
	 * @return the branch2 of this entry
	 */
	@Override
	public String getBranch2() {
		return _entry.getBranch2();
	}

	/**
	 * Returns the category of this entry.
	 *
	 * @return the category of this entry
	 */
	@Override
	public String getCategory() {
		return _entry.getCategory();
	}

	/**
	 * Returns the comments of this entry.
	 *
	 * @return the comments of this entry
	 */
	@Override
	public String getComments() {
		return _entry.getComments();
	}

	/**
	 * Returns the company ID of this entry.
	 *
	 * @return the company ID of this entry
	 */
	@Override
	public long getCompanyId() {
		return _entry.getCompanyId();
	}

	/**
	 * Returns the contract of this entry.
	 *
	 * @return the contract of this entry
	 */
	@Override
	public String getContract() {
		return _entry.getContract();
	}

	/**
	 * Returns the create date of this entry.
	 *
	 * @return the create date of this entry
	 */
	@Override
	public Date getCreateDate() {
		return _entry.getCreateDate();
	}

	/**
	 * Returns the email of this entry.
	 *
	 * @return the email of this entry
	 */
	@Override
	public String getEmail() {
		return _entry.getEmail();
	}

	/**
	 * Returns the entry ID of this entry.
	 *
	 * @return the entry ID of this entry
	 */
	@Override
	public long getEntryId() {
		return _entry.getEntryId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _entry.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this entry.
	 *
	 * @return the group ID of this entry
	 */
	@Override
	public long getGroupId() {
		return _entry.getGroupId();
	}

	/**
	 * Returns the message of this entry.
	 *
	 * @return the message of this entry
	 */
	@Override
	public String getMessage() {
		return _entry.getMessage();
	}

	/**
	 * Returns the modified date of this entry.
	 *
	 * @return the modified date of this entry
	 */
	@Override
	public Date getModifiedDate() {
		return _entry.getModifiedDate();
	}

	/**
	 * Returns the name of this entry.
	 *
	 * @return the name of this entry
	 */
	@Override
	public String getName() {
		return _entry.getName();
	}

	/**
	 * Returns the primary key of this entry.
	 *
	 * @return the primary key of this entry
	 */
	@Override
	public long getPrimaryKey() {
		return _entry.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entry.getPrimaryKeyObj();
	}

	/**
	 * Returns the status of this entry.
	 *
	 * @return the status of this entry
	 */
	@Override
	public int getStatus() {
		return _entry.getStatus();
	}

	/**
	 * Returns the status by user ID of this entry.
	 *
	 * @return the status by user ID of this entry
	 */
	@Override
	public long getStatusByUserId() {
		return _entry.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this entry.
	 *
	 * @return the status by user name of this entry
	 */
	@Override
	public String getStatusByUserName() {
		return _entry.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this entry.
	 *
	 * @return the status by user uuid of this entry
	 */
	@Override
	public String getStatusByUserUuid() {
		return _entry.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this entry.
	 *
	 * @return the status date of this entry
	 */
	@Override
	public Date getStatusDate() {
		return _entry.getStatusDate();
	}

	/**
	 * Returns the transfer ID of this entry.
	 *
	 * @return the transfer ID of this entry
	 */
	@Override
	public long getTransferId() {
		return _entry.getTransferId();
	}

	/**
	 * Returns the type of this entry.
	 *
	 * @return the type of this entry
	 */
	@Override
	public String getType() {
		return _entry.getType();
	}

	/**
	 * Returns the unit of this entry.
	 *
	 * @return the unit of this entry
	 */
	@Override
	public String getUnit() {
		return _entry.getUnit();
	}

	/**
	 * Returns the unit2 of this entry.
	 *
	 * @return the unit2 of this entry
	 */
	@Override
	public String getUnit2() {
		return _entry.getUnit2();
	}

	/**
	 * Returns the user ID of this entry.
	 *
	 * @return the user ID of this entry
	 */
	@Override
	public long getUserId() {
		return _entry.getUserId();
	}

	/**
	 * Returns the user name of this entry.
	 *
	 * @return the user name of this entry
	 */
	@Override
	public String getUserName() {
		return _entry.getUserName();
	}

	/**
	 * Returns the user uuid of this entry.
	 *
	 * @return the user uuid of this entry
	 */
	@Override
	public String getUserUuid() {
		return _entry.getUserUuid();
	}

	/**
	 * Returns the uuid of this entry.
	 *
	 * @return the uuid of this entry
	 */
	@Override
	public String getUuid() {
		return _entry.getUuid();
	}

	@Override
	public int hashCode() {
		return _entry.hashCode();
	}

	/**
	 * Returns <code>true</code> if this entry is approved.
	 *
	 * @return <code>true</code> if this entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _entry.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _entry.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this entry is denied.
	 *
	 * @return <code>true</code> if this entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _entry.isDenied();
	}

	/**
	 * Returns <code>true</code> if this entry is a draft.
	 *
	 * @return <code>true</code> if this entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _entry.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _entry.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this entry is expired.
	 *
	 * @return <code>true</code> if this entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _entry.isExpired();
	}

	/**
	 * Returns <code>true</code> if this entry is inactive.
	 *
	 * @return <code>true</code> if this entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _entry.isInactive();
	}

	/**
	 * Returns <code>true</code> if this entry is incomplete.
	 *
	 * @return <code>true</code> if this entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _entry.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _entry.isNew();
	}

	/**
	 * Returns <code>true</code> if this entry is pending.
	 *
	 * @return <code>true</code> if this entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _entry.isPending();
	}

	/**
	 * Returns <code>true</code> if this entry is scheduled.
	 *
	 * @return <code>true</code> if this entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _entry.isScheduled();
	}

	@Override
	public void persist() {
		_entry.persist();
	}

	/**
	 * Sets the branch of this entry.
	 *
	 * @param branch the branch of this entry
	 */
	@Override
	public void setBranch(String branch) {
		_entry.setBranch(branch);
	}

	/**
	 * Sets the branch2 of this entry.
	 *
	 * @param branch2 the branch2 of this entry
	 */
	@Override
	public void setBranch2(String branch2) {
		_entry.setBranch2(branch2);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_entry.setCachedModel(cachedModel);
	}

	/**
	 * Sets the category of this entry.
	 *
	 * @param category the category of this entry
	 */
	@Override
	public void setCategory(String category) {
		_entry.setCategory(category);
	}

	/**
	 * Sets the comments of this entry.
	 *
	 * @param comments the comments of this entry
	 */
	@Override
	public void setComments(String comments) {
		_entry.setComments(comments);
	}

	/**
	 * Sets the company ID of this entry.
	 *
	 * @param companyId the company ID of this entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		_entry.setCompanyId(companyId);
	}

	/**
	 * Sets the contract of this entry.
	 *
	 * @param contract the contract of this entry
	 */
	@Override
	public void setContract(String contract) {
		_entry.setContract(contract);
	}

	/**
	 * Sets the create date of this entry.
	 *
	 * @param createDate the create date of this entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_entry.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this entry.
	 *
	 * @param email the email of this entry
	 */
	@Override
	public void setEmail(String email) {
		_entry.setEmail(email);
	}

	/**
	 * Sets the entry ID of this entry.
	 *
	 * @param entryId the entry ID of this entry
	 */
	@Override
	public void setEntryId(long entryId) {
		_entry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_entry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_entry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_entry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this entry.
	 *
	 * @param groupId the group ID of this entry
	 */
	@Override
	public void setGroupId(long groupId) {
		_entry.setGroupId(groupId);
	}

	/**
	 * Sets the message of this entry.
	 *
	 * @param message the message of this entry
	 */
	@Override
	public void setMessage(String message) {
		_entry.setMessage(message);
	}

	/**
	 * Sets the modified date of this entry.
	 *
	 * @param modifiedDate the modified date of this entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_entry.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this entry.
	 *
	 * @param name the name of this entry
	 */
	@Override
	public void setName(String name) {
		_entry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_entry.setNew(n);
	}

	/**
	 * Sets the primary key of this entry.
	 *
	 * @param primaryKey the primary key of this entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_entry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_entry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the status of this entry.
	 *
	 * @param status the status of this entry
	 */
	@Override
	public void setStatus(int status) {
		_entry.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this entry.
	 *
	 * @param statusByUserId the status by user ID of this entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_entry.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this entry.
	 *
	 * @param statusByUserName the status by user name of this entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_entry.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_entry.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this entry.
	 *
	 * @param statusDate the status date of this entry
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_entry.setStatusDate(statusDate);
	}

	/**
	 * Sets the transfer ID of this entry.
	 *
	 * @param transferId the transfer ID of this entry
	 */
	@Override
	public void setTransferId(long transferId) {
		_entry.setTransferId(transferId);
	}

	/**
	 * Sets the type of this entry.
	 *
	 * @param type the type of this entry
	 */
	@Override
	public void setType(String type) {
		_entry.setType(type);
	}

	/**
	 * Sets the unit of this entry.
	 *
	 * @param unit the unit of this entry
	 */
	@Override
	public void setUnit(String unit) {
		_entry.setUnit(unit);
	}

	/**
	 * Sets the unit2 of this entry.
	 *
	 * @param unit2 the unit2 of this entry
	 */
	@Override
	public void setUnit2(String unit2) {
		_entry.setUnit2(unit2);
	}

	/**
	 * Sets the user ID of this entry.
	 *
	 * @param userId the user ID of this entry
	 */
	@Override
	public void setUserId(long userId) {
		_entry.setUserId(userId);
	}

	/**
	 * Sets the user name of this entry.
	 *
	 * @param userName the user name of this entry
	 */
	@Override
	public void setUserName(String userName) {
		_entry.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this entry.
	 *
	 * @param userUuid the user uuid of this entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_entry.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this entry.
	 *
	 * @param uuid the uuid of this entry
	 */
	@Override
	public void setUuid(String uuid) {
		_entry.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Entry> toCacheModel() {
		return _entry.toCacheModel();
	}

	@Override
	public Entry toEscapedModel() {
		return new EntryWrapper(_entry.toEscapedModel());
	}

	@Override
	public String toString() {
		return _entry.toString();
	}

	@Override
	public Entry toUnescapedModel() {
		return new EntryWrapper(_entry.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _entry.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EntryWrapper)) {
			return false;
		}

		EntryWrapper entryWrapper = (EntryWrapper)obj;

		if (Objects.equals(_entry, entryWrapper._entry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _entry.getStagedModelType();
	}

	@Override
	public Entry getWrappedModel() {
		return _entry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _entry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_entry.resetOriginalValues();
	}

	private final Entry _entry;

}