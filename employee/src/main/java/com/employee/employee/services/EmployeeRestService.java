package com.employee.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.Employee;
import com.employee.employee.dao.EmployeeRepository;

@RestController
public class EmployeeRestService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@RequestMapping("/save")
	public Employee saveEmployee(Employee e){
		employeeRepository.save(e);
	return e;
	}
	@RequestMapping("/all")
	public List<Employee> getEmployees(){
	return employeeRepository.findAll();
	}
	@RequestMapping("/get")
	public Optional<Employee> getEmployee(Long id){
	return employeeRepository.findById(id);
	}
	@RequestMapping("/delete")
	public boolean delete(Long id){
		employeeRepository.deleteById(id);
	return true;
	}
	@RequestMapping("/update")
	public Employee update(Employee e){
		employeeRepository.saveAndFlush(e);
	return e;
	}
	}

