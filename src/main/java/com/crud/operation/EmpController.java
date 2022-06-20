package com.crud.operation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/hi")
	public String hello()
	{
		return "welcome";
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return service.createEmployee(emp);
	}
	
	@PostMapping("/addbulkdata")
	public List<Employee> addEmployee(@RequestBody List<Employee> emp)
	{
		return service.createBulkEmployee(emp);
	}
	
	@GetMapping("/emp/{id}")
	public Optional<Employee> getEmpID(@PathVariable int id)
	{
		return service.getEmployeeByID(id);
		
	}
	
	@GetMapping("/alldata")
	public List<Employee> getAllEmployeeData() 
	{
		return service.getAllData();
	}
	
	@PutMapping("/updateDetails")
	public Employee upateEmployeeData(@RequestBody Employee emp)
	{
		return service.updateEmpDetail(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public Optional<Employee> deleteEmployeedata(@PathVariable int id)
	{
		return service.delEmployeeByID(id);
	}
	
	
	
}
