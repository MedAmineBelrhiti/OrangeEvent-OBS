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

import event.obs.model.Entite;
import event.obs.service.base.EntiteLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=event.obs.model.Entite",
	service = AopService.class
)
public class EntiteLocalServiceImpl extends EntiteLocalServiceBaseImpl {
	public Entite addEntite(String libelle) {
		long idEntite = counterLocalService.increment(Entite.class.getName());

		Entite entite = entitePersistence.create(idEntite);

		entite.setLibelle(libelle);
		entiteLocalService.addEntite(entite);
		return entite;
	}
}