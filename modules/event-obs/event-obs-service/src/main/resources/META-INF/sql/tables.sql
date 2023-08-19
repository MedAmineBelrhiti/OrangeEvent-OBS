create table OBS_ContactSupport (
	uuid_ VARCHAR(75) null,
	idMessage LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	nom VARCHAR(75) null,
	prenom VARCHAR(75) null,
	entite VARCHAR(75) null,
	objet VARCHAR(75) null,
	email VARCHAR(75) null,
	telephone VARCHAR(75) null,
	message VARCHAR(75) null
);

create table OBS_DemandEventObs (
	uuid_ VARCHAR(75) null,
	idDemand LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	content VARCHAR(75) null,
	status VARCHAR(75) null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null
);

create table OBS_Entite (
	uuid_ VARCHAR(75) null,
	idEntite LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	libelle VARCHAR(75) null
);

create table OBS_EvenementObs (
	uuid_ VARCHAR(75) null,
	idEvent LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	titre VARCHAR(75) null,
	startDate DATE null,
	endDate DATE null,
	lieu VARCHAR(75) null,
	description VARCHAR(75) null,
	votingEndDate DATE null,
	nbrUserMax INTEGER,
	nbrUserConfirmed INTEGER,
	managerName VARCHAR(75) null,
	entityName VARCHAR(75) null
);

create table OBS_Messaging (
	uuid_ VARCHAR(75) null,
	idMessage LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	content VARCHAR(75) null,
	idEvent LONG
);

create table OBS_Participant (
	uuid_ VARCHAR(75) null,
	idParticipant LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	idUser LONG,
	entite VARCHAR(75) null
);

create table OBS_Reservation (
	uuid_ VARCHAR(75) null,
	idReservation LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	nom VARCHAR(75) null,
	prenom VARCHAR(75) null,
	entite VARCHAR(75) null,
	descriptionEvent VARCHAR(75) null,
	status VARCHAR(75) null
);

create table OBS_Transport (
	uuid_ VARCHAR(75) null,
	idTransport LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	collec BOOLEAN,
	prive BOOLEAN,
	idEvent LONG
);