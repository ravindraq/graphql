package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@GetMapping("/employee")
	private List<Employee> showAllEmployees(){
		return es.showAllEmployees();
		
	}
	@GetMapping("/employee/{id}")
	private Employee showEmployeeById(@PathVariable ("Id") int id) {
		return es.showEmployeeById(id);
		
	}
	@PostMapping("/employee")
	private String addOrUpdateEmployee(@RequestBody Employee employee) {
		es.addOrUpdateEmployee(employee);
		return "Updated";
		//return es.addOrUpdateEmployee();
		
	}
	@DeleteMapping("employee/{id}")
	private String deleteEmployeeById(@PathVariable ("Id") int id) {
		es.deleteEmployeeById(id);
		return "Deleted";
		//return es.deleteEmployeeById(id);
		
	}

}
