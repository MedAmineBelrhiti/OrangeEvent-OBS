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

package event.obs.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import event.obs.service.EvenementObsServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>EvenementObsServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EvenementObsServiceHttp {

	public static event.obs.model.EvenementObs addEvenement(
		HttpPrincipal httpPrincipal, java.util.Date startDate,
		java.util.Date endDate, String lieu, String description,
		java.util.Date votingEndDate, String titre, int nbrUserMax,
		String managerName, String entityName,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		try {
			MethodKey methodKey = new MethodKey(
				EvenementObsServiceUtil.class, "addEvenement",
				_addEvenementParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, startDate, endDate, lieu, description, votingEndDate,
				titre, nbrUserMax, managerName, entityName, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (event.obs.model.EvenementObs)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<event.obs.model.EvenementObs>
			getEventsByEntityName(
				HttpPrincipal httpPrincipal, int start, int end,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				EvenementObsServiceUtil.class, "getEventsByEntityName",
				_getEventsByEntityNameParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, start, end, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<event.obs.model.EvenementObs>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		EvenementObsServiceHttp.class);

	private static final Class<?>[] _addEvenementParameterTypes0 = new Class[] {
		java.util.Date.class, java.util.Date.class, String.class, String.class,
		java.util.Date.class, String.class, int.class, String.class,
		String.class, com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _getEventsByEntityNameParameterTypes1 =
		new Class[] {
			int.class, int.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};

}