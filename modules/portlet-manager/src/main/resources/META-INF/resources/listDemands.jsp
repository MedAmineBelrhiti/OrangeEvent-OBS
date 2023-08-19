<%@include file="init.jsp"%>

<liferay-ui:search-container emptyResultsMessage="There is no requests actually ">
    <liferay-ui:search-container-results results="${demands}" />

    <liferay-ui:search-container-row className="event.obs.model.DemandEventObs" modelVar="demand">
        <liferay-ui:search-container-column-text property="idDemand"/>
        <liferay-ui:search-container-column-text property="content"/>
        <liferay-ui:search-container-column-text property="status"/>

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>

</liferay-ui:search-container>