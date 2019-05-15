package com.wf.service;

import com.wf.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployee(Integer id);
    List<Employee> getEmployeeByName(String name);
    Employee saveOrUpdate(Employee employee);
}
