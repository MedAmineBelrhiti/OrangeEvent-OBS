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

package event.obs.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;OBS_ContactSupport&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ContactSupport
 * @generated
 */
public class ContactSupportTable extends BaseTable<ContactSupportTable> {

	public static final ContactSupportTable INSTANCE =
		new ContactSupportTable();

	public final Column<ContactSupportTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, Long> idMessage = createColumn(
		"idMessage", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ContactSupportTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> nom = createColumn(
		"nom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> prenom = createColumn(
		"prenom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> entite = createColumn(
		"entite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> objet = createColumn(
		"objet", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> telephone = createColumn(
		"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ContactSupportTable, String> message = createColumn(
		"message", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ContactSupportTable() {
		super("OBS_ContactSupport", ContactSupportTable::new);
	}

}