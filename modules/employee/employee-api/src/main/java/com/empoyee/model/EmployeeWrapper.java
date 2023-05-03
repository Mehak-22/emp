/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.empoyee.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper
	extends BaseModelWrapper<Employee>
	implements Employee, ModelWrapper<Employee> {

	public EmployeeWrapper(Employee employee) {
		super(employee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eid", getEid());
		attributes.put("ename", getEname());
		attributes.put("eaddress", getEaddress());
		attributes.put("emobile", getEmobile());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eid = (Long)attributes.get("eid");

		if (eid != null) {
			setEid(eid);
		}

		String ename = (String)attributes.get("ename");

		if (ename != null) {
			setEname(ename);
		}

		String eaddress = (String)attributes.get("eaddress");

		if (eaddress != null) {
			setEaddress(eaddress);
		}

		String emobile = (String)attributes.get("emobile");

		if (emobile != null) {
			setEmobile(emobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	@Override
	public Employee cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the eaddress of this employee.
	 *
	 * @return the eaddress of this employee
	 */
	@Override
	public String getEaddress() {
		return model.getEaddress();
	}

	/**
	 * Returns the eid of this employee.
	 *
	 * @return the eid of this employee
	 */
	@Override
	public long getEid() {
		return model.getEid();
	}

	/**
	 * Returns the email of this employee.
	 *
	 * @return the email of this employee
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the emobile of this employee.
	 *
	 * @return the emobile of this employee
	 */
	@Override
	public String getEmobile() {
		return model.getEmobile();
	}

	/**
	 * Returns the ename of this employee.
	 *
	 * @return the ename of this employee
	 */
	@Override
	public String getEname() {
		return model.getEname();
	}

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the eaddress of this employee.
	 *
	 * @param eaddress the eaddress of this employee
	 */
	@Override
	public void setEaddress(String eaddress) {
		model.setEaddress(eaddress);
	}

	/**
	 * Sets the eid of this employee.
	 *
	 * @param eid the eid of this employee
	 */
	@Override
	public void setEid(long eid) {
		model.setEid(eid);
	}

	/**
	 * Sets the email of this employee.
	 *
	 * @param email the email of this employee
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the emobile of this employee.
	 *
	 * @param emobile the emobile of this employee
	 */
	@Override
	public void setEmobile(String emobile) {
		model.setEmobile(emobile);
	}

	/**
	 * Sets the ename of this employee.
	 *
	 * @param ename the ename of this employee
	 */
	@Override
	public void setEname(String ename) {
		model.setEname(ename);
	}

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected EmployeeWrapper wrap(Employee employee) {
		return new EmployeeWrapper(employee);
	}

}