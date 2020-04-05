<%@include file="../init.jsp"%>

<%
	long entryId = ParamUtil.getLong(renderRequest, "entryId");

	Entry entry = null;
	if (entryId > 0) {
		entry = EntryLocalServiceUtil.getEntry(entryId);
	}

	long transferId = ParamUtil.getLong(renderRequest, "transferId");
%>

<portlet:renderURL var="viewURL">

	<portlet:param name="mvcPath" value="/transferwebportlet/view.jsp"></portlet:param>

</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>

<aui:form action="<%=addEntryURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=entry%>" model="<%=Entry.class%>" />

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="email" />
		<aui:input name="message" />
		<aui:input name="type" />
		<aui:input name="category" />
		<aui:input name="contract" />
		<aui:input name="unit" />
		<aui:input name="branch" />
		<aui:input name="unit2" />
		<aui:input name="branch2" />
		<aui:input name="comments" />

		<aui:input name="entryId" type="hidden" />
		<aui:input name="transferId" type="hidden"
			value='<%=entry == null ? transferId : entry.getTransferId()%>' />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>

	</aui:button-row>
</aui:form>