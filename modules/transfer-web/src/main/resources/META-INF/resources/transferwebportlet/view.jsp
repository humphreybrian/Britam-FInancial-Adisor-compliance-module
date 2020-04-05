<%@include file="../init.jsp"%>

<%
	long transferId = Long.valueOf((Long) renderRequest.getAttribute("transferId"));
%>

<aui:button-row cssClass="transfer-buttons">

	<portlet:renderURL var="addEntryURL">
		<portlet:param name="mvcPath"
			value="/transferwebportlet/edit_entry.jsp" />
		<portlet:param name="transferId"
			value="<%=String.valueOf(transferId)%>" />
	</portlet:renderURL>

	<aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>

</aui:button-row>

<liferay-ui:search-container
	total="<%=EntryLocalServiceUtil.getEntriesCount()%>">
	<liferay-ui:search-container-results
		results="<%=EntryLocalServiceUtil.getEntries(scopeGroupId.longValue(), transferId,
						searchContainer.getStart(), searchContainer.getEnd())%>" />

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
		<liferay-ui:search-container-column-text property="edit" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>