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
 * The table class for the &quot;OBS_Transport&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Transport
 * @generated
 */
public class TransportTable extends BaseTable<TransportTable> {

	public static final TransportTable INSTANCE = new TransportTable();

	public final Column<TransportTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Long> idTransport = createColumn(
		"idTransport", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TransportTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Boolean> collec = createColumn(
		"collec", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Boolean> prive = createColumn(
		"prive", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<TransportTable, Long> idEvent = createColumn(
		"idEvent", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private TransportTable() {
		super("OBS_Transport", TransportTable::new);
	}

}