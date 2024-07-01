package com.jayeshbhole.week_5.controller;

import com.jayeshbhole.week_5.entity.Employee;
import com.jayeshbhole.week_5.service.SpringService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/employees")
public class SpringController {
    @Autowired
    SpringService service;
    private static final Logger log = LoggerFactory.getLogger(SpringController.class);

    @GetMapping()
    public List<Employee> getAllEmployees(){
        log.debug("fetching all employee");
        return service.getAllEmployee();
    }

    @GetMapping("/{empID}")
    public Employee getEmployee(@PathVariable int empID){
        log.debug("fetching the employee with empID as " + empID);
        return service.getEmployeeById(empID);
    }

    @PostMapping
    public void createEmployee(@RequestBody Employee employee){
        service.createEmployee(employee);
        log.debug("Employee Created Successfully");
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee){
        log.debug("Employee Updated Successfully");
        service.updateEmployee(employee);
    }

    @DeleteMapping("/{empID}")
    public void deleteEmployee(@PathVariable int empID){
        log.debug("Employee Deleted Successfully");
        service.deleteEmployeeById(empID);
    }

}
