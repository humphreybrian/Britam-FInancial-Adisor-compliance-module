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
 * Provides a wrapper for {@link TransferService}.
 *
 * @author liferay
 * @see TransferService
 * @generated
 */
@ProviderType
public class TransferServiceWrapper
	implements TransferService, ServiceWrapper<TransferService> {

	public TransferServiceWrapper(TransferService transferService) {
		_transferService = transferService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _transferService.getOSGiServiceIdentifier();
	}

	@Override
	public TransferService getWrappedService() {
		return _transferService;
	}

	@Override
	public void setWrappedService(TransferService transferService) {
		_transferService = transferService;
	}

	private TransferService _transferService;

}