package com.app.core;

import java.time.LocalDate;

public class Employee
{
	
	String id, name; 
	double basicSalary;
	String department, reportingAuthority, designation;
	LocalDate doj;
	
	public Employee(String id, String name, double basicSalary, String department, String reportingAuthority,
			String designation, LocalDate doj)
	{
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.department = department;
		this.reportingAuthority = reportingAuthority;
		this.designation = designation;
		this.doj = doj;
	}
	
	public boolean checkId(String id)
	{
		
		if(id.matches("ID\\d+") && id.length()==7)
			return true;
		return false;
	}

	public String getId()
	{
		return id;
	}
	
	public double calSal()
	{
	return  Math.abs(basicSalary)+500;
	}
	
	public boolean nameDept()
	{
		if(!name.equals("") || !department.equals(""))
		{
			return true;
		}
		return false;
	}
	
	
	

}
