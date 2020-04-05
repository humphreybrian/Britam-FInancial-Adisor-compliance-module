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

package com.liferay.docs.transfer.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TransferLocalService}.
 *
 * @author liferay
 * @see TransferLocalService
 * @generated
 */
@ProviderType
public class TransferLocalServiceWrapper
	implements TransferLocalService, ServiceWrapper<TransferLocalService> {

	public TransferLocalServiceWrapper(
		TransferLocalService transferLocalService) {

		_transferLocalService = transferLocalService;
	}

	@Override
	public com.liferay.docs.transfer.model.Transfer addTransfer(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transferLocalService.addTransfer(userId, name, serviceContext);
	}

	/**
	 * Adds the transfer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param transfer the transfer
	 * @return the transfer that was added
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer addTransfer(
		com.liferay.docs.transfer.model.Transfer transfer) {

		return _transferLocalService.addTransfer(transfer);
	}

	/**
	 * Creates a new transfer with the primary key. Does not add the transfer to the database.
	 *
	 * @param transferId the primary key for the new transfer
	 * @return the new transfer
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer createTransfer(
		long transferId) {

		return _transferLocalService.createTransfer(transferId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transferLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the transfer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer that was removed
	 * @throws PortalException if a transfer with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer deleteTransfer(
			long transferId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transferLocalService.deleteTransfer(transferId);
	}

	@Override
	public com.liferay.docs.transfer.model.Transfer deleteTransfer(
			long transferId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _transferLocalService.deleteTransfer(transferId, serviceContext);
	}

	/**
	 * Deletes the transfer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transfer the transfer
	 * @return the transfer that was removed
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer deleteTransfer(
		com.liferay.docs.transfer.model.Transfer transfer) {

		return _transferLocalService.deleteTransfer(transfer);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _transferLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _transferLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.transfer.model.impl.TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _transferLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.transfer.model.impl.TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _transferLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _transferLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _transferLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.transfer.model.Transfer fetchTransfer(
		long transferId) {

		return _transferLocalService.fetchTransfer(transferId);
	}

	/**
	 * Returns the transfer matching the UUID and group.
	 *
	 * @param uuid the transfer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer
		fetchTransferByUuidAndGroupId(String uuid, long groupId) {

		return _transferLocalService.fetchTransferByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _transferLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _transferLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _transferLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _transferLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transferLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the transfer with the primary key.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer
	 * @throws PortalException if a transfer with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer getTransfer(long transferId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transferLocalService.getTransfer(transferId);
	}

	/**
	 * Returns the transfer matching the UUID and group.
	 *
	 * @param uuid the transfer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching transfer
	 * @throws PortalException if a matching transfer could not be found
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer getTransferByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _transferLocalService.getTransferByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the transfers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.transfer.model.impl.TransferModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @return the range of transfers
	 */
	@Override
	public java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(int start, int end) {

		return _transferLocalService.getTransfers(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(long groupId) {

		return _transferLocalService.getTransfers(groupId);
	}

	@Override
	public java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(long groupId, int start, int end) {

		return _transferLocalService.getTransfers(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.transfer.model.Transfer> obc) {

		return _transferLocalService.getTransfers(groupId, start, end, obc);
	}

	/**
	 * Returns all the transfers matching the UUID and company.
	 *
	 * @param uuid the UUID of the transfers
	 * @param companyId the primary key of the company
	 * @return the matching transfers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfersByUuidAndCompanyId(String uuid, long companyId) {

		return _transferLocalService.getTransfersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of transfers matching the UUID and company.
	 *
	 * @param uuid the UUID of the transfers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of transfers
	 * @param end the upper bound of the range of transfers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching transfers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.transfer.model.Transfer> orderByComparator) {

		return _transferLocalService.getTransfersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of transfers.
	 *
	 * @return the number of transfers
	 */
	@Override
	public int getTransfersCount() {
		return _transferLocalService.getTransfersCount();
	}

	@Override
	public int getTransfersCount(long groupId) {
		return _transferLocalService.getTransfersCount(groupId);
	}

	@Override
	public com.liferay.docs.transfer.model.Transfer updateTransfer(
			long userId, long transferId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _transferLocalService.updateTransfer(
			userId, transferId, name, serviceContext);
	}

	/**
	 * Updates the transfer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param transfer the transfer
	 * @return the transfer that was updated
	 */
	@Override
	public com.liferay.docs.transfer.model.Transfer updateTransfer(
		com.liferay.docs.transfer.model.Transfer transfer) {

		return _transferLocalService.updateTransfer(transfer);
	}

	@Override
	public TransferLocalService getWrappedService() {
		return _transferLocalService;
	}

	@Override
	public void setWrappedService(TransferLocalService transferLocalService) {
		_transferLocalService = transferLocalService;
	}

	private TransferLocalService _transferLocalService;

}