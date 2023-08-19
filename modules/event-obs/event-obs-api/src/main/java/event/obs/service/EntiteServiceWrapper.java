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
 * Provides a wrapper for {@link EntiteService}.
 *
 * @author Brian Wing Shun Chan
 * @see EntiteService
 * @generated
 */
public class EntiteServiceWrapper
	implements EntiteService, ServiceWrapper<EntiteService> {

	public EntiteServiceWrapper() {
		this(null);
	}

	public EntiteServiceWrapper(EntiteService entiteService) {
		_entiteService = entiteService;
	}

	@Override
	public event.obs.model.Entite addEntite(
		String libelle,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _entiteService.addEntite(libelle, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _entiteService.getOSGiServiceIdentifier();
	}

	@Override
	public EntiteService getWrappedService() {
		return _entiteService;
	}

	@Override
	public void setWrappedService(EntiteService entiteService) {
		_entiteService = entiteService;
	}

	private EntiteService _entiteService;

}