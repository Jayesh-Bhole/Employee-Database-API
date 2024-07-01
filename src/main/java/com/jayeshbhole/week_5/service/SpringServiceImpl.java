package com.jayeshbhole.week_5.service;

import com.jayeshbhole.week_5.entity.Employee;
import com.jayeshbhole.week_5.repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SpringServiceImpl implements SpringService{

    @Autowired
    SpringRepository repository;
    @Override
    public void createEmployee(Employee employee){
        repository.save(employee);
    }

    @Override
    public void deleteEmployeeById(int empID) {
        repository.deleteById(empID);
    }

    @Override
    public Employee getEmployeeById(int empID) {
        Optional<Employee> entity = repository.findById(empID);
        return entity.orElse(null);
    }

    @Override
    public void updateEmployee(Employee employee) {
        repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }
}
