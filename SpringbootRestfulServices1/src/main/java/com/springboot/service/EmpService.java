package com.springboot.service;

import java.util.List;

import com.springboot.bean.Employee;

public interface EmpService {

	public Employee getEmpByID(int empid);
	public List<Employee> getAllEmployees();
	public void updateemp(Employee employee);
	public void deleteEmployee(int empid);
}
