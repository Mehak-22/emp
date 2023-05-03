<%@ include file="init.jsp" %>


<h3>Update Employee here !</h3>

<portlet:actionURL name="updatemp" var="updateActionURL"/>

<aui:form action="<%=updateActionURL %>" name="empoyeedetails" method="POST"/>


<%

    String empId = renderRequest.getParameter("empId");
    String name= renderRequest.getParameter("name");
    String address = renderRequest.getParameter("address");
    String mobile = renderRequest.getParameter("mobile");
    String email= renderRequest.getParameter("email");
    
    %>
    
    <aui:form action="<%=updateActionURL %>" method="POST" >
    
    
    <aui:input name="empId" type="hidden" value="<%=Long.parseLong(empId)%>"/>
    
    <aui:input name="name" type="String" value="${employee.name}"/>
    
	
	<aui:input name="address" type="String" value="${empoyee.address}"/>


	
	<aui:input name="mobile" type="number" value="${employee.mobile}"/>
	

	
	<aui:input name="email" type="String" value="${employee.email}"/>

	<aui:input type="submit" value="Update" name ="update">></aui:input>
	
	</aui:form>
