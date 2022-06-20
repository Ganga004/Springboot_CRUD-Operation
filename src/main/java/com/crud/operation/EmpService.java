package com.crud.operation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	EmpRepository emprepo;
	
	public Employee createEmployee(Employee emp)
	{
		return emprepo.save(emp);
	}

	public List<Employee> createBulkEmployee(List<Employee> emp)
	{
		return emprepo.saveAll(emp);
	}
	
	public Optional<Employee> getEmployeeByID(int id) 
	{
		return emprepo.findById(id);
	}
	
	public List<Employee> getAllData()
	{
		return emprepo.findAll();
		
	}	
	public Employee updateEmpDetail(Employee empl) {
		Optional<Employee> optionalEmp=emprepo.findById(empl.empId);
		Employee oldData=optionalEmp.get();
		if(optionalEmp.isPresent())
		{
			oldData.setName(empl.getName());
			oldData.setRole(empl.getRole());
			oldData.setSalary(empl.getSalary());
			emprepo.save(oldData);
		}
		else
		return empl;
		return oldData;
	}
	public Optional<Employee> delEmployeeByID(int id)
	{
		emprepo.deleteById(id);
		System.out.println("Data has been removed..");
		return Optional.empty();
	}
	
}
