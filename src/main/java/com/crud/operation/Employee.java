package com.crud.operation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue
	int empId;
	String name;
	String role;
	double salary;
	int  dept_id;
	
	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public Employee() {
		super();
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	
	public Employee(int empId, String name, String role, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}

	

	
}
