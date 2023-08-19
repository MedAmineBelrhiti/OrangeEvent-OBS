<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<portlet:defineObjects />
<portlet:actionURL name="addDemand" var="addDemandURL" />
<div class="container">
    <main>
        <div class="col-md-7 col-lg-8">
            <h4 class="mb-3">Ajouter une demande</h4>
            <aui:form action="<%=addDemandURL.toString()%>" name="addDemand" class="needs-validation" method="POST">
                <div class="row g-3">
                    <div class="col-sm-6">
                        <aui:input name="firstName" class="form-control">
                            <aui:validator name="required"/>
                        </aui:input>
                    </div>
                    <div class="col-sm-6">
                        <aui:input name="lastName" class="form-control">
                            <aui:validator name="required"/>
                        </aui:input>
                    </div>
                        <aui:input name="content" type="textarea" class="form-control">
                            <aui:validator name="required"/>
                        </aui:input>
                    <aui:button type="submit" name="" value="Soumettre" class="w-100 btn btn-primary btn-lg" />
                </div>
            </aui:form>
        </div>
    </main>
</div>