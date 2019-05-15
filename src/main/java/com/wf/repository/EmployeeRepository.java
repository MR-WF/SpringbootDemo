package com.wf.repository;

import com.wf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee save(Employee employee);
    List<Employee> findAllByName(String name);
    Employee findByEmployeeId(int id);
}
