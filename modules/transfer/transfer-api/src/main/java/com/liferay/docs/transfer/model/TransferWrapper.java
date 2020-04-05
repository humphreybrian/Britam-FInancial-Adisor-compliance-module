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
 * This class is a wrapper for {@link Transfer}.
 * </p>
 *
 * @author liferay
 * @see Transfer
 * @generated
 */
@ProviderType
public class TransferWrapper implements Transfer, ModelWrapper<Transfer> {

	public TransferWrapper(Transfer transfer) {
		_transfer = transfer;
	}

	@Override
	public Class<?> getModelClass() {
		return Transfer.class;
	}

	@Override
	public String getModelClassName() {
		return Transfer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("transferId", getTransferId());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long transferId = (Long)attributes.get("transferId");

		if (transferId != null) {
			setTransferId(transferId);
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
	}

	@Override
	public Object clone() {
		return new TransferWrapper((Transfer)_transfer.clone());
	}

	@Override
	public int compareTo(Transfer transfer) {
		return _transfer.compareTo(transfer);
	}

	/**
	 * Returns the company ID of this transfer.
	 *
	 * @return the company ID of this transfer
	 */
	@Override
	public long getCompanyId() {
		return _transfer.getCompanyId();
	}

	/**
	 * Returns the create date of this transfer.
	 *
	 * @return the create date of this transfer
	 */
	@Override
	public Date getCreateDate() {
		return _transfer.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _transfer.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this transfer.
	 *
	 * @return the group ID of this transfer
	 */
	@Override
	public long getGroupId() {
		return _transfer.getGroupId();
	}

	/**
	 * Returns the modified date of this transfer.
	 *
	 * @return the modified date of this transfer
	 */
	@Override
	public Date getModifiedDate() {
		return _transfer.getModifiedDate();
	}

	/**
	 * Returns the name of this transfer.
	 *
	 * @return the name of this transfer
	 */
	@Override
	public String getName() {
		return _transfer.getName();
	}

	/**
	 * Returns the primary key of this transfer.
	 *
	 * @return the primary key of this transfer
	 */
	@Override
	public long getPrimaryKey() {
		return _transfer.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _transfer.getPrimaryKeyObj();
	}

	/**
	 * Returns the status of this transfer.
	 *
	 * @return the status of this transfer
	 */
	@Override
	public int getStatus() {
		return _transfer.getStatus();
	}

	/**
	 * Returns the status by user ID of this transfer.
	 *
	 * @return the status by user ID of this transfer
	 */
	@Override
	public long getStatusByUserId() {
		return _transfer.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this transfer.
	 *
	 * @return the status by user name of this transfer
	 */
	@Override
	public String getStatusByUserName() {
		return _transfer.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this transfer.
	 *
	 * @return the status by user uuid of this transfer
	 */
	@Override
	public String getStatusByUserUuid() {
		return _transfer.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this transfer.
	 *
	 * @return the status date of this transfer
	 */
	@Override
	public Date getStatusDate() {
		return _transfer.getStatusDate();
	}

	/**
	 * Returns the transfer ID of this transfer.
	 *
	 * @return the transfer ID of this transfer
	 */
	@Override
	public long getTransferId() {
		return _transfer.getTransferId();
	}

	/**
	 * Returns the user ID of this transfer.
	 *
	 * @return the user ID of this transfer
	 */
	@Override
	public long getUserId() {
		return _transfer.getUserId();
	}

	/**
	 * Returns the user name of this transfer.
	 *
	 * @return the user name of this transfer
	 */
	@Override
	public String getUserName() {
		return _transfer.getUserName();
	}

	/**
	 * Returns the user uuid of this transfer.
	 *
	 * @return the user uuid of this transfer
	 */
	@Override
	public String getUserUuid() {
		return _transfer.getUserUuid();
	}

	/**
	 * Returns the uuid of this transfer.
	 *
	 * @return the uuid of this transfer
	 */
	@Override
	public String getUuid() {
		return _transfer.getUuid();
	}

	@Override
	public int hashCode() {
		return _transfer.hashCode();
	}

	/**
	 * Returns <code>true</code> if this transfer is approved.
	 *
	 * @return <code>true</code> if this transfer is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return _transfer.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _transfer.isCachedModel();
	}

	/**
	 * Returns <code>true</code> if this transfer is denied.
	 *
	 * @return <code>true</code> if this transfer is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return _transfer.isDenied();
	}

	/**
	 * Returns <code>true</code> if this transfer is a draft.
	 *
	 * @return <code>true</code> if this transfer is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return _transfer.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _transfer.isEscapedModel();
	}

	/**
	 * Returns <code>true</code> if this transfer is expired.
	 *
	 * @return <code>true</code> if this transfer is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return _transfer.isExpired();
	}

	/**
	 * Returns <code>true</code> if this transfer is inactive.
	 *
	 * @return <code>true</code> if this transfer is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return _transfer.isInactive();
	}

	/**
	 * Returns <code>true</code> if this transfer is incomplete.
	 *
	 * @return <code>true</code> if this transfer is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return _transfer.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _transfer.isNew();
	}

	/**
	 * Returns <code>true</code> if this transfer is pending.
	 *
	 * @return <code>true</code> if this transfer is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return _transfer.isPending();
	}

	/**
	 * Returns <code>true</code> if this transfer is scheduled.
	 *
	 * @return <code>true</code> if this transfer is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return _transfer.isScheduled();
	}

	@Override
	public void persist() {
		_transfer.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_transfer.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this transfer.
	 *
	 * @param companyId the company ID of this transfer
	 */
	@Override
	public void setCompanyId(long companyId) {
		_transfer.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this transfer.
	 *
	 * @param createDate the create date of this transfer
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_transfer.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_transfer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_transfer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_transfer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this transfer.
	 *
	 * @param groupId the group ID of this transfer
	 */
	@Override
	public void setGroupId(long groupId) {
		_transfer.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this transfer.
	 *
	 * @param modifiedDate the modified date of this transfer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_transfer.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this transfer.
	 *
	 * @param name the name of this transfer
	 */
	@Override
	public void setName(String name) {
		_transfer.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_transfer.setNew(n);
	}

	/**
	 * Sets the primary key of this transfer.
	 *
	 * @param primaryKey the primary key of this transfer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_transfer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_transfer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the status of this transfer.
	 *
	 * @param status the status of this transfer
	 */
	@Override
	public void setStatus(int status) {
		_transfer.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this transfer.
	 *
	 * @param statusByUserId the status by user ID of this transfer
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_transfer.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this transfer.
	 *
	 * @param statusByUserName the status by user name of this transfer
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_transfer.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this transfer.
	 *
	 * @param statusByUserUuid the status by user uuid of this transfer
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_transfer.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this transfer.
	 *
	 * @param statusDate the status date of this transfer
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		_transfer.setStatusDate(statusDate);
	}

	/**
	 * Sets the transfer ID of this transfer.
	 *
	 * @param transferId the transfer ID of this transfer
	 */
	@Override
	public void setTransferId(long transferId) {
		_transfer.setTransferId(transferId);
	}

	/**
	 * Sets the user ID of this transfer.
	 *
	 * @param userId the user ID of this transfer
	 */
	@Override
	public void setUserId(long userId) {
		_transfer.setUserId(userId);
	}

	/**
	 * Sets the user name of this transfer.
	 *
	 * @param userName the user name of this transfer
	 */
	@Override
	public void setUserName(String userName) {
		_transfer.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this transfer.
	 *
	 * @param userUuid the user uuid of this transfer
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_transfer.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this transfer.
	 *
	 * @param uuid the uuid of this transfer
	 */
	@Override
	public void setUuid(String uuid) {
		_transfer.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Transfer> toCacheModel() {
		return _transfer.toCacheModel();
	}

	@Override
	public Transfer toEscapedModel() {
		return new TransferWrapper(_transfer.toEscapedModel());
	}

	@Override
	public String toString() {
		return _transfer.toString();
	}

	@Override
	public Transfer toUnescapedModel() {
		return new TransferWrapper(_transfer.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _transfer.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TransferWrapper)) {
			return false;
		}

		TransferWrapper transferWrapper = (TransferWrapper)obj;

		if (Objects.equals(_transfer, transferWrapper._transfer)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _transfer.getStagedModelType();
	}

	@Override
	public Transfer getWrappedModel() {
		return _transfer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _transfer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _transfer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_transfer.resetOriginalValues();
	}

	private final Transfer _transfer;

}