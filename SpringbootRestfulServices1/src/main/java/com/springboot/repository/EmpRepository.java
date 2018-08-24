package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bean.Employee;
@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer>
{

}
