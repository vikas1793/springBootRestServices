package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;

import com.springboot.bean.Employee;
import com.springboot.service.EmpService;

@RestController
public class EmployeeController
{
	@Autowired
	private EmpService empservice;
	@RequestMapping(value="/emp/{empid}",method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<Employee> getEmpbyID(@PathVariable("empid")int empid)
	{
		Employee employee=empservice.getEmpByID(empid);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	@RequestMapping(value="/getemplist",method=RequestMethod.GET )
	public List<Employee> getEmplist()
	{
	return empservice.getAllEmployees();
		
	}
	/*@RequestMapping(value="/updateEployee/{empid}")
	public Employee updateEmp(@PathVariable("empid")int empid,UriBuilder uriBuilder)
	{
		Employee employee=empservice.getEmpByID(empid);
			
	}
*/
}
