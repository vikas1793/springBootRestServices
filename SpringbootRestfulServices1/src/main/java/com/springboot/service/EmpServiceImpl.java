package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.Employee;
import com.springboot.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService 
{
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee getEmpByID(int empid) {
	 Optional<Employee> emp=empRepository.findById(empid);
		return emp.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emplist=(List<Employee>) empRepository.findAll();
		return emplist;
	}

	@Override
	public void updateemp(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empid) {
		 
      empRepository.deleteById(empid);
		
	}
	

}
