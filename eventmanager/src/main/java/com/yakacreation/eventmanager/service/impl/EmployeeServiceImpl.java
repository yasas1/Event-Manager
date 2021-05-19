package com.yakacreation.eventmanager.service.impl;

import com.yakacreation.eventmanager.Dao.EmployeeDao;
import com.yakacreation.eventmanager.exception.EmployeeExceptions;
import com.yakacreation.eventmanager.model.Employee;
import com.yakacreation.eventmanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public List<Employee> findAllEmplyees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.employeeDao.deleteEmployeeById(id);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return this.employeeDao.findEmployeeById(id)
                .orElseThrow( ()-> new EmployeeExceptions.UserNotFoundException("User by id "+id+" was not found") );
    }


}
