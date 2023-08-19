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

package event.obs.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import event.obs.model.ContactSupport;
import event.obs.service.base.ContactSupportServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=obs",
		"json.web.service.context.path=ContactSupport"
	},
	service = AopService.class
)
public class ContactSupportServiceImpl extends ContactSupportServiceBaseImpl {
	public ContactSupport addReclamataion(String nom, String prenom, String entite, String objet, String email, String telephone, String message, ServiceContext serviceContext){
		return contactSupportLocalService.addReclamataion(nom,prenom,entite,objet,email,telephone,message);
	}
}