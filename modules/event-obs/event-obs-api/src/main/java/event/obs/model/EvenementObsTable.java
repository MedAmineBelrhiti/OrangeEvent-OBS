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
 * The table class for the &quot;OBS_EvenementObs&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see EvenementObs
 * @generated
 */
public class EvenementObsTable extends BaseTable<EvenementObsTable> {

	public static final EvenementObsTable INSTANCE = new EvenementObsTable();

	public final Column<EvenementObsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Long> idEvent = createColumn(
		"idEvent", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EvenementObsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, String> titre = createColumn(
		"titre", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Date> startDate = createColumn(
		"startDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Date> endDate = createColumn(
		"endDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, String> lieu = createColumn(
		"lieu", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Date> votingEndDate = createColumn(
		"votingEndDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Integer> nbrUserMax = createColumn(
		"nbrUserMax", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, Integer> nbrUserConfirmed =
		createColumn(
			"nbrUserConfirmed", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, String> managerName = createColumn(
		"managerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EvenementObsTable, String> entityName = createColumn(
		"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EvenementObsTable() {
		super("OBS_EvenementObs", EvenementObsTable::new);
	}

}