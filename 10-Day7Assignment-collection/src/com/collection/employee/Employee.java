package com.collection.employee;

public class Employee implements Comparable<Employee> {
	private long empId;
	private String empName;
	private String dept;
	private double salary;

	public Employee(long empId, String empName, String dept, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Details : empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary;
	}

	@Override
	public int compareTo(Employee o) {
		return (int) (this.empId - o.empId);
	}

}
