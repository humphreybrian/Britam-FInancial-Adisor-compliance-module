<%@include file = "../init.jsp" %>

<%
        long transferId = ParamUtil.getLong(request, "transferId");

        Transfer transfer = null;

        if (transferId > 0) {
                transfer = TransferLocalServiceUtil.getTransfer(transferId);
        }
%>

<portlet:renderURL var="viewURL">
        <portlet:param name="mvcPath" value="/transferadminportlet/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name='<%= transfer == null ? "addTransfer" : "updateTransfer" %>' var="editTransferURL" />

<aui:form action="<%= editTransferURL %>" name="fm">

        <aui:model-context bean="<%= transfer %>" model="<%= Transfer.class %>" />

        <aui:input type="hidden" name="transferId"
            value='<%= transfer == null ? "" : transfer.getTransferId() %>' />

        <aui:fieldset>
             <aui:input name="name" />
        </aui:fieldset>

        <aui:button-row>
             <aui:button type="submit" />
             <aui:button onClick="<%= viewURL %>" type="cancel"  />
        </aui:button-row>
</aui:form>