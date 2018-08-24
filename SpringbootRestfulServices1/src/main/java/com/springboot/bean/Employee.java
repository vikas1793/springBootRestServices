package com.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue
	private int empid;
	private String empname;
	private String empqualification;
	private String empsalary;
	private int empage;
	public Employee()
	{
		
	}
	
	public Employee(int empid, String empname, String empqualification,String empsalary, int age) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empqualification = empqualification;
		this.empsalary=empsalary;
		this.setEmpage(age);
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpqualification() {
		return empqualification;
	}
	public void setEmpqualification(String empqualification) {
		this.empqualification = empqualification;
	}
 
	public String getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}
	

}
