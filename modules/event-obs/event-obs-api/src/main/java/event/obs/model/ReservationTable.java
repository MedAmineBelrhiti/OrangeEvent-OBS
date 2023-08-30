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
 * The table class for the &quot;OBS_Reservation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Reservation
 * @generated
 */
public class ReservationTable extends BaseTable<ReservationTable> {

	public static final ReservationTable INSTANCE = new ReservationTable();

	public final Column<ReservationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> idReservation = createColumn(
		"idReservation", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ReservationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> idUser = createColumn(
		"idUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, Long> idEvent = createColumn(
		"idEvent", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, String> nom = createColumn(
		"nom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, String> prenom = createColumn(
		"prenom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservationTable, String> entite = createColumn(
		"entite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ReservationTable() {
		super("OBS_Reservation", ReservationTable::new);
	}

}