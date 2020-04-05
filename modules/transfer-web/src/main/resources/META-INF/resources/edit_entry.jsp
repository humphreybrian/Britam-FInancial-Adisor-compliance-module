<%@ include file="init.jsp"%>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>
<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>
<aui:form action="<%=addEntryURL%>" name="<portlet:namespace />fm">
	<aui:fieldset>
		<aui:input name="name"></aui:input>
		<aui:input name="message"></aui:input>
		<aui:input name="type"></aui:input>
		<aui:input name="category"></aui:input>
		<aui:input name="contract"></aui:input>
		<aui:input name="unit"></aui:input>
		<aui:input name="branch"></aui:input>
		<aui:input name="unit2"></aui:input>
		<aui:input name="branch2"></aui:input>
		<aui:input name="comments"></aui:input>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>
	</aui:button-row>
</aui:form>