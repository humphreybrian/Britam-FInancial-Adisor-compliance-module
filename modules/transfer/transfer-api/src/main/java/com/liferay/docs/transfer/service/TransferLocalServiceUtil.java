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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Transfer. This utility wraps
 * <code>com.liferay.docs.transfer.service.impl.TransferLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see TransferLocalService
 * @generated
 */
@ProviderType
public class TransferLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.docs.transfer.service.impl.TransferLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.docs.transfer.model.Transfer addTransfer(
			long userId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addTransfer(userId, name, serviceContext);
	}

	/**
	 * Adds the transfer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param transfer the transfer
	 * @return the transfer that was added
	 */
	public static com.liferay.docs.transfer.model.Transfer addTransfer(
		com.liferay.docs.transfer.model.Transfer transfer) {

		return getService().addTransfer(transfer);
	}

	/**
	 * Creates a new transfer with the primary key. Does not add the transfer to the database.
	 *
	 * @param transferId the primary key for the new transfer
	 * @return the new transfer
	 */
	public static com.liferay.docs.transfer.model.Transfer createTransfer(
		long transferId) {

		return getService().createTransfer(transferId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the transfer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer that was removed
	 * @throws PortalException if a transfer with the primary key could not be found
	 */
	public static com.liferay.docs.transfer.model.Transfer deleteTransfer(
			long transferId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTransfer(transferId);
	}

	public static com.liferay.docs.transfer.model.Transfer deleteTransfer(
			long transferId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deleteTransfer(transferId, serviceContext);
	}

	/**
	 * Deletes the transfer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transfer the transfer
	 * @return the transfer that was removed
	 */
	public static com.liferay.docs.transfer.model.Transfer deleteTransfer(
		com.liferay.docs.transfer.model.Transfer transfer) {

		return getService().deleteTransfer(transfer);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.docs.transfer.model.Transfer fetchTransfer(
		long transferId) {

		return getService().fetchTransfer(transferId);
	}

	/**
	 * Returns the transfer matching the UUID and group.
	 *
	 * @param uuid the transfer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching transfer, or <code>null</code> if a matching transfer could not be found
	 */
	public static com.liferay.docs.transfer.model.Transfer
		fetchTransferByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchTransferByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the transfer with the primary key.
	 *
	 * @param transferId the primary key of the transfer
	 * @return the transfer
	 * @throws PortalException if a transfer with the primary key could not be found
	 */
	public static com.liferay.docs.transfer.model.Transfer getTransfer(
			long transferId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTransfer(transferId);
	}

	/**
	 * Returns the transfer matching the UUID and group.
	 *
	 * @param uuid the transfer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching transfer
	 * @throws PortalException if a matching transfer could not be found
	 */
	public static com.liferay.docs.transfer.model.Transfer
			getTransferByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTransferByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(int start, int end) {

		return getService().getTransfers(start, end);
	}

	public static java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(long groupId) {

		return getService().getTransfers(groupId);
	}

	public static java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(long groupId, int start, int end) {

		return getService().getTransfers(groupId, start, end);
	}

	public static java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfers(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.transfer.model.Transfer> obc) {

		return getService().getTransfers(groupId, start, end, obc);
	}

	/**
	 * Returns all the transfers matching the UUID and company.
	 *
	 * @param uuid the UUID of the transfers
	 * @param companyId the primary key of the company
	 * @return the matching transfers, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfersByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getTransfersByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.liferay.docs.transfer.model.Transfer>
		getTransfersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.transfer.model.Transfer> orderByComparator) {

		return getService().getTransfersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of transfers.
	 *
	 * @return the number of transfers
	 */
	public static int getTransfersCount() {
		return getService().getTransfersCount();
	}

	public static int getTransfersCount(long groupId) {
		return getService().getTransfersCount(groupId);
	}

	public static com.liferay.docs.transfer.model.Transfer updateTransfer(
			long userId, long transferId, String name,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateTransfer(
			userId, transferId, name, serviceContext);
	}

	/**
	 * Updates the transfer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param transfer the transfer
	 * @return the transfer that was updated
	 */
	public static com.liferay.docs.transfer.model.Transfer updateTransfer(
		com.liferay.docs.transfer.model.Transfer transfer) {

		return getService().updateTransfer(transfer);
	}

	public static TransferLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TransferLocalService, TransferLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TransferLocalService.class);

		ServiceTracker<TransferLocalService, TransferLocalService>
			serviceTracker =
				new ServiceTracker<TransferLocalService, TransferLocalService>(
					bundle.getBundleContext(), TransferLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}