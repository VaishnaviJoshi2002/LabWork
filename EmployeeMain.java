package com.javaconcepts;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		
		//Setting bean values
		obj.setId(101);
		obj.setName("Ram");
		obj.setSalary(75000);
		
		
		//getting bean values
		System.out.println("Employee Id is: "+Employee.getId());
		System.out.println("Employee name is:" +Employee.getName());
		System.out.println("Employee Salary is:"+Employee.getSalary());
	}

}
