package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.Controller.EmployeeController;
import com.example.demo.Employee.Employee;
import com.example.demo.Repositry.EmployeeRepositry;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepositry er;

	public List<Employee> showAllEmployees() {
		List<Employee> employee=new ArrayList<>();
		er.findAll().forEach(employee ::add);
		return employee;
	}

	public Employee showEmployeeById(int id) {
		// TODO Auto-generated method stub
		return er.findById(id).get();
	}

	public void addOrUpdateEmployee(Employee employee) {
		er.save(employee);
		
	}

	public void deleteEmployeeById(int id) {
		er.deleteById(id);
	}

}
