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
 * The table class for the &quot;OBS_Entite&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Entite
 * @generated
 */
public class EntiteTable extends BaseTable<EntiteTable> {

	public static final EntiteTable INSTANCE = new EntiteTable();

	public final Column<EntiteTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EntiteTable, Long> idEntite = createColumn(
		"idEntite", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EntiteTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EntiteTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EntiteTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EntiteTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EntiteTable, String> libelle = createColumn(
		"libelle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EntiteTable() {
		super("OBS_Entite", EntiteTable::new);
	}

}