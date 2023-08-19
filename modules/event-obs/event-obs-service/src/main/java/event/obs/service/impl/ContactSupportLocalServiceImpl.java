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

import event.obs.model.ContactSupport;
import event.obs.service.base.ContactSupportLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=event.obs.model.ContactSupport",
	service = AopService.class
)
public class ContactSupportLocalServiceImpl extends ContactSupportLocalServiceBaseImpl {
	public ContactSupport addReclamataion(String nom,String prenom,String entite,String objet,String email,String telephone,String message){
		long idMessage = counterLocalService.increment(ContactSupport.class.getName());
		ContactSupport reclamation = contactSupportPersistence.create(idMessage);

		reclamation.setNom(nom);
		reclamation.setPrenom(prenom);
		reclamation.setEntite(entite);
		reclamation.setObjet(objet);
		reclamation.setEmail(email);
		reclamation.setTelephone(telephone);
		reclamation.setMessage(message);

		contactSupportLocalService.addContactSupport(reclamation);
		return reclamation;
	}
}