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

package com.empoyee.model.impl;

import com.empoyee.model.Employee;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeCacheModel
	implements CacheModel<Employee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)object;

		if (eid == employeeCacheModel.eid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{eid=");
		sb.append(eid);
		sb.append(", ename=");
		sb.append(ename);
		sb.append(", eaddress=");
		sb.append(eaddress);
		sb.append(", emobile=");
		sb.append(emobile);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEid(eid);

		if (ename == null) {
			employeeImpl.setEname("");
		}
		else {
			employeeImpl.setEname(ename);
		}

		if (eaddress == null) {
			employeeImpl.setEaddress("");
		}
		else {
			employeeImpl.setEaddress(eaddress);
		}

		if (emobile == null) {
			employeeImpl.setEmobile("");
		}
		else {
			employeeImpl.setEmobile(emobile);
		}

		if (email == null) {
			employeeImpl.setEmail("");
		}
		else {
			employeeImpl.setEmail(email);
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eid = objectInput.readLong();
		ename = objectInput.readUTF();
		eaddress = objectInput.readUTF();
		emobile = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(eid);

		if (ename == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ename);
		}

		if (eaddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eaddress);
		}

		if (emobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emobile);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long eid;
	public String ename;
	public String eaddress;
	public String emobile;
	public String email;

}