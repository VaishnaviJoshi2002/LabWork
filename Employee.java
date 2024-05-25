//Create bean for Employee with fields(eid,ename,esalary).
package com.javaconcepts;

public class Employee {
	
	 static int eid;
	 static String ename;
	 static int esalary;
	
	public static int getId() {
		return eid;
	}
	
	public void setId(int eid) {
		this.eid=eid;
	}
	
	public static String getName() {
		return ename;
	}
	
	public void setName(String ename) {
		this.ename=ename;
	}
	
	public static int getSalary() {
		return esalary;
	}
	
	public void setSalary(int esalary) {
		this.esalary=esalary;
	}

}
