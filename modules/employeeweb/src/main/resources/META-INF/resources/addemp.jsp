<%@ include file="init.jsp" %>


<portlet:actionURL name="addempl" var="addemplActionURL">

</portlet:actionURL>

<h5>Enter Details</h5>

<aui:form action="<%=addemplActionURL %>" name="empForm" method="POST">
		
	<aui:input name="Name" type="string">
		<aui:validator name="required" />
	
		
		</aui:input>
		
	<aui:input name="Address" type="String">
		<aui:validator name="required" />
	
		</aui:input>
		
	<aui:input name="Mobile" type="number">
		<aui:validator name="required" />
		</aui:input>
		
	<aui:input name="Email" type="String">
		<aui:validator name="required" />
		</aui:input>
		
	<aui:button type="submit" name="" value="Submit"></aui:button>
	
</aui:form>