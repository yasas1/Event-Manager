package com.yakacreation.eventmanager.service;

import com.yakacreation.eventmanager.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> findAllEmplyees();

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);

}
