<%@ include file="/init.jsp"%>

<%@ include file="/init.jsp"%>

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>
<jsp:useBean id="entries" class="java.util.ArrayList" scope="request" />

<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%=entries%>" />

	<liferay-ui:search-container-row
		className="com.liferay.docs.transfer.model.Entry" modelVar="entry">
		<liferay-ui:search-container-column-text property="message" />

		<liferay-ui:search-container-column-text property="name" />
		<liferay-ui:search-container-column-text property="type" />
		<liferay-ui:search-container-column-text property="category" />
		<liferay-ui:search-container-column-text property="contract" />
		<liferay-ui:search-container-column-text property="unit" />
		<liferay-ui:search-container-column-text property="branch" />
		<liferay-ui:search-container-column-text property="unit2" />
		<liferay-ui:search-container-column-text property="branch2" />
		<liferay-ui:search-container-column-text property="comments" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row>
	<aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>
</aui:button-row>