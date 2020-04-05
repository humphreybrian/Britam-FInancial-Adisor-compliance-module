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

package com.liferay.docs.transfer.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.transfer.exception.NoSuchTransferException;
import com.liferay.docs.transfer.model.Transfer;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the transfer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see TransferUtil
 * @generated
 */
@ProviderType
public interface TransferPersistence extends BasePersistence<Transfer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TransferUtil} to access the transfer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Transfer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the transfers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching transfers
	 */
	public java.util.List<Transfer> findByUuid(String uuid);

	/**
	 * Returns a range of all the transfers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @return the range of matching transfers
	 */
	public java.util.List<Transfer> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the transfers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid(String, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching transfers
	 */
	@Deprecated
	public java.util.List<Transfer> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Transfer> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the transfers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transfers
	 */
	public java.util.List<Transfer> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the first transfer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByUuid_First(
			String uuid, OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Returns the first transfer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByUuid_First(
		String uuid, OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the last transfer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByUuid_Last(
			String uuid, OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Returns the last transfer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByUuid_Last(
		String uuid, OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the transfers before and after the current transfer in the ordered set where uuid = &#63;.
	 *
	 * @param transferId the primary key of the current transfer
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transfer
	 * @throws NoSuchTransferException if a transfer with the primary key could not be found
	 */
	public Transfer[] findByUuid_PrevAndNext(
			long transferId, String uuid,
			OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Removes all the transfers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of transfers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching transfers
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the transfer where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTransferException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByUUID_G(String uuid, long groupId)
		throws NoSuchTransferException;

	/**
	 * Returns the transfer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #fetchByUUID_G(String,long)}
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	@Deprecated
	public Transfer fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Returns the transfer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByUUID_G(String uuid, long groupId);

	/**
	 * Removes the transfer where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the transfer that was removed
	 */
	public Transfer removeByUUID_G(String uuid, long groupId)
		throws NoSuchTransferException;

	/**
	 * Returns the number of transfers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching transfers
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the transfers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching transfers
	 */
	public java.util.List<Transfer> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the transfers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @return the range of matching transfers
	 */
	public java.util.List<Transfer> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the transfers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByUuid_C(String,long, int, int, OrderByComparator)}
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching transfers
	 */
	@Deprecated
	public java.util.List<Transfer> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Transfer> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the transfers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transfers
	 */
	public java.util.List<Transfer> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the first transfer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Returns the first transfer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the last transfer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Returns the last transfer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the transfers before and after the current transfer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param transferId the primary key of the current transfer
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transfer
	 * @throws NoSuchTransferException if a transfer with the primary key could not be found
	 */
	public Transfer[] findByUuid_C_PrevAndNext(
			long transferId, String uuid, long companyId,
			OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Removes all the transfers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of transfers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching transfers
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the transfers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching transfers
	 */
	public java.util.List<Transfer> findByGroupId(long groupId);

	/**
	 * Returns a range of all the transfers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @return the range of matching transfers
	 */
	public java.util.List<Transfer> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the transfers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findByGroupId(long, int, int, OrderByComparator)}
	 * @param groupId the group ID
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching transfers
	 */
	@Deprecated
	public java.util.List<Transfer> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Transfer> orderByComparator, boolean useFinderCache);

	/**
	 * Returns an ordered range of all the transfers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transfers
	 */
	public java.util.List<Transfer> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the first transfer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByGroupId_First(
			long groupId, OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Returns the first transfer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByGroupId_First(
		long groupId, OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the last transfer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer
	 * @throws NoSuchTransferException if a matching transfer could not be found
	 */
	public Transfer findByGroupId_Last(
			long groupId, OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Returns the last transfer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public Transfer fetchByGroupId_Last(
		long groupId, OrderByComparator<Transfer> orderByComparator);

	/**
	 * Returns the transfers before and after the current transfer in the ordered set where groupId = &#63;.
	 *
	 * @param transferId the primary key of the current transfer
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transfer
	 * @throws NoSuchTransferException if a transfer with the primary key could not be found
	 */
	public Transfer[] findByGroupId_PrevAndNext(
			long transferId, long groupId,
			OrderByComparator<Transfer> orderByComparator)
		throws NoSuchTransferException;

	/**
	 * Removes all the transfers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of transfers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching transfers
	 */
	public int countByGroupId(long groupId);

	/**
	 * Caches the transfer in the entity cache if it is enabled.
	 *
	 * @param transfer the transfer
	 */
	public void cacheResult(Transfer transfer);

	/**
	 * Caches the transfers in the entity cache if it is enabled.
	 *
	 * @param transfers the transfers
	 */
	public void cacheResult(java.util.List<Transfer> transfers);

	/**
	 * Creates a new transfer with the primary key. Does not add the transfer to the database.
	 *
	 * @param transferId the primary key for the new transfer
	 * @return the new transfer
	 */
	public Transfer create(long transferId);

	/**
	 * Removes the transfer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer that was removed
	 * @throws NoSuchTransferException if a transfer with the primary key could not be found
	 */
	public Transfer remove(long transferId) throws NoSuchTransferException;

	public Transfer updateImpl(Transfer transfer);

	/**
	 * Returns the transfer with the primary key or throws a <code>NoSuchTransferException</code> if it could not be found.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer
	 * @throws NoSuchTransferException if a transfer with the primary key could not be found
	 */
	public Transfer findByPrimaryKey(long transferId)
		throws NoSuchTransferException;

	/**
	 * Returns the transfer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer, or <code>null</code> if a transfer with the primary key could not be found
	 */
	public Transfer fetchByPrimaryKey(long transferId);

	/**
	 * Returns all the transfers.
	 *
	 * @return the transfers
	 */
	public java.util.List<Transfer> findAll();

	/**
	 * Returns a range of all the transfers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @return the range of transfers
	 */
	public java.util.List<Transfer> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the transfers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of transfers
	 */
	@Deprecated
	public java.util.List<Transfer> findAll(
		int start, int end, OrderByComparator<Transfer> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns an ordered range of all the transfers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of transfers
	 */
	public java.util.List<Transfer> findAll(
		int start, int end, OrderByComparator<Transfer> orderByComparator);

	/**
	 * Removes all the transfers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of transfers.
	 *
	 * @return the number of transfers
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}