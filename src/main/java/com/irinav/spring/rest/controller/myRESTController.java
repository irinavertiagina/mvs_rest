package com.irinav.spring.rest.controller;

import com.irinav.spring.rest.entity.Employee;
import com.irinav.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author irkin
 **/
@RestController
@RequestMapping("/api")
public class myRESTController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmpl(){
        List<Employee> list = employeeService.getAllEmployes();
        return list;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

}
