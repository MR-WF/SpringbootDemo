package com.wf.controller;

import com.wf.model.Employee;
import com.wf.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: it.wf
 * @create: 2019-05-15 10:45
 **/
@RestController
@RequestMapping(value = "/emp")
@Api(tags = "EmployeeController", description = "EmployeeController | 雇员管理模块",value = "测试")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "新增雇员信息", notes = "新增一个雇员")
    @RequestMapping(value = "/api/v1/save",method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee){
        return employeeService.saveOrUpdate(employee);
    }

    @ApiOperation(value = "根据雇员名查询用户列表信息", notes = "查询数据库中为此名的雇员信息")
    @RequestMapping(value = "/api/v1/name/{name}" ,method = RequestMethod.GET)
    public List<Employee> getUsers(@ApiParam(name="name",value="雇员名",required=true)@PathVariable String name){
        List<Employee> emps = employeeService.getEmployeeByName(name);
        return emps;
    }

    @ApiOperation(value = "根据id查询雇员信息", notes = "查询数据库中某个的雇员信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/api/v1/id/{id}" ,method = RequestMethod.GET)
    public Employee getUserById(@PathVariable Integer id){
        Employee person = employeeService.getEmployee(id);
        return person;
    }


}
