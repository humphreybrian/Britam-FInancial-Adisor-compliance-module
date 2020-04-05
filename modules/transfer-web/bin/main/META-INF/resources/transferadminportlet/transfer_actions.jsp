<%@include file="../init.jsp"%>

<%
    String mvcPath = ParamUtil.getString(request, "mvcPath");

    ResultRow row = (ResultRow) request
                    .getAttribute("SEARCH_CONTAINER_RESULT_ROW");

    Transfer transfer = (Transfer) row.getObject();
%>

<liferay-ui:icon-menu>

    <portlet:renderURL var="editURL">
        <portlet:param name="transferId"
            value="<%=String.valueOf(transfer.getTransferId()) %>" />
        <portlet:param name="mvcPath"
            value="/transferadminportlet/edit_transfer.jsp" />
    </portlet:renderURL>

    <liferay-ui:icon image="edit" message="Edit"
            url="<%=editURL.toString() %>" />

    <portlet:actionURL name="deleteTransfer" var="deleteURL">
            <portlet:param name="transferId"
                value="<%= String.valueOf(transfer.getTransferId()) %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />

</liferay-ui:icon-menu>