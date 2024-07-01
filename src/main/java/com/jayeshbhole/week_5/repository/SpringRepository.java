package com.jayeshbhole.week_5.repository;

import com.jayeshbhole.week_5.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringRepository extends JpaRepository<Employee, Integer> {

}
