package com.example.demo.Repositry;

import org.springframework.data.repository.CrudRepository;

//import com.cruddemo.crudoperations.model.Employee;
import com.example.demo.Employee.Employee;

public interface EmployeeRepositry extends CrudRepository<Employee, Integer>{

}
