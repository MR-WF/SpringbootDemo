package com.wf.service.impl;

import com.wf.model.Employee;
import com.wf.repository.EmployeeRepository;
import com.wf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: it.wf
 * @create: 2019-05-15 10:40
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(Integer id) {
        return employeeRepository.findByEmployeeId(id);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findAllByName(name);
    }

    @Override
    public Employee saveOrUpdate(Employee employee) {
        if (employee.getEmployeeId() != null){
            Employee emp = new Employee();
            emp.setAreaId(employee.getAreaId());
            emp.setCreateDate(employee.getCreateDate());
            emp.setEmail(employee.getEmail());
            emp.setName(emp.getName());
            return employeeRepository.save(employee);
        }
        employee.setEmployeeId(new Random().nextInt(100)+100);
        return employeeRepository.save(employee);
    }
}
