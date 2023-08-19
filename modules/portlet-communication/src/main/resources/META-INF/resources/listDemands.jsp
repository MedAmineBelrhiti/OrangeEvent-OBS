<%@include file="init.jsp"%>
<portlet:renderURL var="historiqueDemande">
  <portlet:param name="mvcRenderCommandName" value="/historiqueDemande"></portlet:param>
</portlet:renderURL>
<c:choose>
  <c:when test="${allApproved}">
    <div class="alert alert-warning" role="alert">
      <span class="alert-icon"><span class="visually-hidden">Warning</span></span>
      <p>toutes les demandes sont approuvees.</p>
    </div>
    <button type="submit" class="btn btn-primary"><a href="${historiqueDemande}" >voir l'historique des demandes.</a></button>

  </c:when>
  <c:otherwise>
    <div id="liveAlertPlaceholder"></div>
    <liferay-ui:search-container>
      <liferay-ui:search-container-results results="${listDemands}" />
      <liferay-ui:search-container-row className="event.obs.model.DemandEventObs" modelVar="demand" >
        <portlet:actionURL var="approveDemandURL" name="/approveDemand">
          <portlet:param name="idDemand" value="${demand.idDemand}"/>
        </portlet:actionURL>
        <liferay-ui:search-container-column-text property="content"/>
        <liferay-ui:search-container-column-text property="status"/>
        <liferay-ui:search-container-column-text property="firstName"/>
        <liferay-ui:search-container-column-text property="lastName"/>

        <liferay-ui:search-container-column-text name="approveDemand" value="approve this request" href="${approveDemandURL}"/>
      </liferay-ui:search-container-row>
      <liferay-ui:search-iterator/>

    </liferay-ui:search-container>
  </c:otherwise>
</c:choose>

