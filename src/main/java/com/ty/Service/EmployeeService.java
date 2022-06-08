package com.ty.Service;

import com.ty.dao.EmployeeDao;
import com.ty.dto.Employee;

public class EmployeeService {

	EmployeeDao dao = new EmployeeDao();

	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);

	}

}
