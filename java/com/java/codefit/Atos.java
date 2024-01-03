package com.java.codefit;

public class Atos {

	private String employeeName;
	private String department;
	private long employeeSalary;
	private int yearOfJoining;
	public Atos(String employeeName, String department, long employeeSalary, int yearOfJoining) {
		super();
		this.employeeName = employeeName;
		this.department = department;
		this.employeeSalary = employeeSalary;
		this.yearOfJoining = yearOfJoining;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	@Override
	public String toString() {
		return "Atos [employeeName=" + employeeName + ", department=" + department + ", employeeSalary="
				+ employeeSalary + ", yearOfJoining=" + yearOfJoining + "]";
	}

	
	
}
