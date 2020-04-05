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

package com.liferay.docs.transfer.service.impl;

import com.liferay.docs.transfer.exception.TransferNameException;
import com.liferay.docs.transfer.model.Entry;
import com.liferay.docs.transfer.model.Transfer;
import com.liferay.docs.transfer.service.base.TransferLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the transfer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.docs.transfer.service.TransferLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see TransferLocalServiceBaseImpl
 */
public class TransferLocalServiceImpl extends TransferLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.docs.transfer.service.TransferLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.docs.transfer.service.TransferLocalServiceUtil</code>.
	 */
	public Transfer addTransfer(
		    long userId, String name, ServiceContext serviceContext)
		    throws PortalException {

		    long groupId = serviceContext.getScopeGroupId();

		    User user = userLocalService.getUserById(userId);

		    Date now = new Date();

		    validate(name);

		    long transferId = counterLocalService.increment();

		    Transfer transfer = transferPersistence.create(transferId);

		    transfer.setUuid(serviceContext.getUuid());
		    transfer.setUserId(userId);
		    transfer.setGroupId(groupId);
		    transfer.setCompanyId(user.getCompanyId());
		    transfer.setUserName(user.getFullName());
		    transfer.setCreateDate(serviceContext.getCreateDate(now));
		    transfer.setModifiedDate(serviceContext.getModifiedDate(now));
		    transfer.setName(name);
		    transfer.setExpandoBridgeAttributes(serviceContext);

		    transferPersistence.update(transfer);

		    return transfer;

		}
	public List<Transfer> getTransfers(long groupId) {

	    return transferPersistence.findByGroupId(groupId);
	}

	public List<Transfer> getTransfers(long groupId, int start, int end, 
	    OrderByComparator<Transfer> obc) {

	    return transferPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Transfer> getTransfers(long groupId, int start, int end) {

	    return transferPersistence.findByGroupId(groupId, start, end);
	}

	public int getTransfersCount(long groupId) {

	    return transferPersistence.countByGroupId(groupId);
	}
	protected void validate(String name) throws PortalException {
	    if (Validator.isNull(name)) {
	        throw new TransferNameException();
	    }
	}
	public Transfer updateTransfer(long userId, long transferId,
		    String name, ServiceContext serviceContext) throws PortalException,
		                SystemException {

		        Date now = new Date();

		        validate(name);

		        Transfer transfer = getTransfer(transferId);

		        User user = userLocalService.getUser(userId);

		        transfer.setUserId(userId);
		        transfer.setUserName(user.getFullName());
		        transfer.setModifiedDate(serviceContext.getModifiedDate(now));
		        transfer.setName(name);
		        transfer.setExpandoBridgeAttributes(serviceContext);

		        transferPersistence.update(transfer);

		        return transfer;
		}
	public Transfer deleteTransfer(long transferId,
            ServiceContext serviceContext) throws PortalException,
            SystemException {

    Transfer transfer = getTransfer(transferId);

    List<Entry> entries = entryLocalService.getEntries(
                    serviceContext.getScopeGroupId(), transferId);

    for (Entry entry : entries) {
            entryLocalService.deleteEntry(entry.getEntryId());
    }

    transfer = deleteTransfer(transfer);

    return transfer;
}
}