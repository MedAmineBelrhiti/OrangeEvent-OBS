<%@ include file="init.jsp"%>
<liferay-ui:search-container emptyResultsMessage="Toutes les demandes sont approuver. " >
  <liferay-ui:search-container-results results="${historiqueDemande}" />
  <liferay-ui:search-container-row className="event.obs.model.DemandEventObs" modelVar="demand" >
    <liferay-ui:search-container-column-text property="content"/>
    <liferay-ui:search-container-column-text property="status"/>
    <liferay-ui:search-container-column-text property="firstName"/>
    <liferay-ui:search-container-column-text property="lastName"/>
  </liferay-ui:search-container-row>
  <liferay-ui:search-iterator/>
</liferay-ui:search-container>