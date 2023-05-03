<%@ include file="init.jsp" %>

<p>
	<b><liferay-ui:message key="employee.caption"/></b>
</p>



<h4>Add Employee Details!</h4>

<portlet:renderURL var="addEmployeeURL">
	<portlet:param name="mvcPath" value="/addemp.jsp"/>
</portlet:renderURL>



<div class="mb-5">
    <a href="<%= addEmployeeURL %>" class="btn  btn-primary btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Employee
    </a>
</div>

<table class="table table-striped">
	<tr>
		<th>Employee Id</th>
		<th>Eployee Name </th>
		<th>Employee Address</th>
		<th>Employee Mobile</th>
		<th>Employee Email</th>
		<th colspan="2" style="width: 100px">Action</th>
	</tr>

<c:forEach items="${details}" var="employee">

<!-- Update Author -->
		 <portlet:renderURL var="updateRenderURL">
            <portlet:param name="mvcPath" value="/updateemp.jsp"/>
            <portlet:param name="empId" value="${employee.empId}"/>
            <portlet:param name="name" value="${employee.ename}"/>
            <portlet:param name="address" value="${employee.eaddress}"/>
            <portlet:param name="mobile" value="${employee.emobile}"/>
            <portlet:param name="email" value="${employee.email}"/>
           
        </portlet:renderURL>

<tr> 
            
            <td>${employee.getEid()}</td>
            <td>${employee.getEname()}</td>
            <td>${emplyee.getEaddress()}</td>
            <td>${employee.getEmobile()}</td>
            <td>${employee.getEmail()}</td>
            <td class="text-center" style="width: 50px">
             <a href="<%=updateRenderURL%>" class="btn  btn-primary btn-default btn-sm px-3 py-2" >
                <i class ="glyphicon glyphicon-edit">Edit</i>
                </a>
            </td>
  	</tr>

</c:forEach>
    
</table>