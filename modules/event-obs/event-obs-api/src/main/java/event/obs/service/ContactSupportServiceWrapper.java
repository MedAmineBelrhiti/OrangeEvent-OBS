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
 * Provides a wrapper for {@link ContactSupportService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupportService
 * @generated
 */
public class ContactSupportServiceWrapper
	implements ContactSupportService, ServiceWrapper<ContactSupportService> {

	public ContactSupportServiceWrapper() {
		this(null);
	}

	public ContactSupportServiceWrapper(
		ContactSupportService contactSupportService) {

		_contactSupportService = contactSupportService;
	}

	@Override
	public event.obs.model.ContactSupport addReclamataion(
		String nom, String prenom, String entite, String objet, String email,
		String telephone, String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _contactSupportService.addReclamataion(
			nom, prenom, entite, objet, email, telephone, message,
			serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contactSupportService.getOSGiServiceIdentifier();
	}

	@Override
	public ContactSupportService getWrappedService() {
		return _contactSupportService;
	}

	@Override
	public void setWrappedService(ContactSupportService contactSupportService) {
		_contactSupportService = contactSupportService;
	}

	private ContactSupportService _contactSupportService;

}