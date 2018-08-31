package com.capgemini.icici.domain;

public class Employee {
	
long employeeId ;
String employeeName ;
String employeeAddress ;
long employeePhone ;
double basicSalary ;
double transportAllowance ;
final double specialAllowance=250.8 ;
final double HRA=1000.50 ;

public Employee()
{
	
}
public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeePhone = employeePhone;
	this.basicSalary=basicSalary ;
}
public void calculateSalary(double basicSalary)
{
	double salary ;
	salary=basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * HRA/100) ;
	System.out.println("Salary: "+salary);
}


}

