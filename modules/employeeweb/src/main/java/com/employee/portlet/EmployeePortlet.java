package com.employee.portlet;

import com.employee.constants.EmployeePortletKeys;
import com.empoyee.model.Employee;
import com.empoyee.service.EmployeeLocalService;
import com.empoyee.service.EmployeeLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Employee",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeePortlet extends MVCPortlet {
	
	public void addempl(ActionRequest request,ActionResponse response) throws IOException,PortletException {
		
		
		String name=ParamUtil.getString(request, "Name");
		String address=ParamUtil.getString(request, "Address");
		String mobile=ParamUtil.getString(request, "Mobile");
		String email=ParamUtil.getString(request, "Email");
		
	
		try {
		Employee employee=EmployeeLocalServiceUtil.createEmployee(CounterLocalServiceUtil.increment());
		
		employee.setEmail(email);
		employee.setEmobile(mobile);
		employee.setEname(name);
		employee.setEaddress(address);
		
		EmployeeLocalServiceUtil.addEmployee(employee);
		
		System.out.println("Success");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void read(RenderRequest renderRequest) {
		List<Employee> details = EmployeeLocalServiceUtil.getEmployees(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("details", details);
	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		read(renderRequest);
		super.render(renderRequest, renderResponse);
		
	}
	
	
	
	public void updatemp(ActionRequest request,ActionResponse response) {
		long empId = ParamUtil.getLong(request,"empId",GetterUtil.DEFAULT_LONG);       
		String name = ParamUtil.getString(request, "name", GetterUtil.DEFAULT_STRING);
        String address = ParamUtil.getString(request, "address", GetterUtil.DEFAULT_STRING);
        String mobile = ParamUtil.getString(request, "mobile", GetterUtil.DEFAULT_STRING);
        String email = ParamUtil.getString(request, "email", GetterUtil.DEFAULT_STRING);
        
        Employee employee=null;
        
        try {
        	employee=EmployeeLocalServiceUtil.getEmployee(empId);
        }
        
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        if(Validator.isNotNull(employee)){
        	employee.setEaddress(address);
        	employee.setEmail(email);
        	employee.setEmobile(mobile);
        	employee.setEname(name);
        	EmployeeLocalServiceUtil.updateEmployee(employee);
        }
        
	
	
	}
	
}