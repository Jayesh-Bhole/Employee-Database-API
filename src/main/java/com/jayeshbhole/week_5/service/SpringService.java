package com.jayeshbhole.week_5.service;

import com.jayeshbhole.week_5.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpringService {
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployeeById(int empID);
    public Employee getEmployeeById(int empID);
    public List<Employee> getAllEmployee();

}
