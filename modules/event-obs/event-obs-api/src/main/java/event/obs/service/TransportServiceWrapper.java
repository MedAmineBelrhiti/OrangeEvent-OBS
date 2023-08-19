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

package event.obs.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TransportService}.
 *
 * @author Brian Wing Shun Chan
 * @see TransportService
 * @generated
 */
public class TransportServiceWrapper
	implements ServiceWrapper<TransportService>, TransportService {

	public TransportServiceWrapper() {
		this(null);
	}

	public TransportServiceWrapper(TransportService transportService) {
		_transportService = transportService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _transportService.getOSGiServiceIdentifier();
	}

	@Override
	public TransportService getWrappedService() {
		return _transportService;
	}

	@Override
	public void setWrappedService(TransportService transportService) {
		_transportService = transportService;
	}

	private TransportService _transportService;

}