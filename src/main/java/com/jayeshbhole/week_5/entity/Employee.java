package com.jayeshbhole.week_5.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empID;
    private String empName;
    private String empAddress;
    private String empDepartment;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

}
