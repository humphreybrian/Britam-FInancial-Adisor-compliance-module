<%@include file="../init.jsp"%>

<liferay-ui:search-container
	total="<%=TransferLocalServiceUtil.getTransfersCount(scopeGroupId)%>">
	<liferay-ui:search-container-results
		results="<%=TransferLocalServiceUtil.getTransfers(scopeGroupId, searchContainer.getStart(),
						searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.liferay.docs.transfer.model.Transfer"
		modelVar="transfer">

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-jsp align="right"
			path="/transferadminportlet/transfer_actions.jsp" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="transfer-admin-buttons">
	<portlet:renderURL var="addTransferURL">
		<portlet:param name="mvcPath"
			value="/transferadminportlet/edit_transfer.jsp" />
		<portlet:param name="redirect" value="<%="currentURL"%>" />
	</portlet:renderURL>

	<aui:button onClick="<%=addTransferURL.toString()%>"
		value="Add Transfer" />
</aui:button-row>