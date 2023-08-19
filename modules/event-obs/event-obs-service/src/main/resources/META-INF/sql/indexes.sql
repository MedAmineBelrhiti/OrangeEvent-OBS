create index IX_39FCDA28 on OBS_ContactSupport (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CDC5CAAA on OBS_ContactSupport (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6E5ADD7C on OBS_DemandEventObs (status[$COLUMN_LENGTH:75$]);
create index IX_57EA5D0A on OBS_DemandEventObs (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8D9A9E0C on OBS_DemandEventObs (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1E765D68 on OBS_Entite (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8D471DEA on OBS_Entite (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_72C5533E on OBS_EvenementObs (entityName[$COLUMN_LENGTH:75$]);
create index IX_854DA830 on OBS_EvenementObs (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_15827AB2 on OBS_EvenementObs (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D6C875FF on OBS_Messaging (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_67A47041 on OBS_Messaging (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8725146E on OBS_Participant (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BA23DE70 on OBS_Participant (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_42B52287 on OBS_Reservation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8A629EC9 on OBS_Reservation (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C41BB1A4 on OBS_Transport (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_276C5126 on OBS_Transport (uuid_[$COLUMN_LENGTH:75$], groupId);