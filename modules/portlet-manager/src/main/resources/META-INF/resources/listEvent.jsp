<%@include file="init.jsp"%>

<liferay-ui:search-container emptyResultsMessage="There is no events actually ">
    <liferay-ui:search-container-results results="${events}" />

    <liferay-ui:search-container-row className="event.obs.model.EvenementObs" modelVar="evenement">
        <liferay-ui:search-container-column-text property="idEvent"/>
        <liferay-ui:search-container-column-text property="startDate"/>
        <liferay-ui:search-container-column-text property="endDate"/>
        <liferay-ui:search-container-column-text property="lieu"/>
        <liferay-ui:search-container-column-text property="votingEndDate"/>
        <liferay-ui:search-container-column-text property="nbrUserConfirmed"/>
        <liferay-ui:search-container-column-text property="nbrUserMax"/>
        <liferay-ui:search-container-column-text property="entity"/>
        <liferay-ui:search-container-column-text property="managerName"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>

</liferay-ui:search-container>