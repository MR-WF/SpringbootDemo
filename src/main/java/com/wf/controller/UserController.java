package com.wf.controller;

import com.wf.model.Person;
import com.wf.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mr_WF on 2018/4/21.
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "PersonController", description = "PersonController | 用户管理模块",value = "测试")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/get/{id}" ,method = RequestMethod.GET)
    public Person getUserById(@PathVariable Long id){
        Person person = userService.getUser(id);
        return person;
    }

    @ApiOperation(value = "根据用户名查询用户列表信息", notes = "查询数据库中为此名的用户信息")
    @RequestMapping(value = "/get/users/{name}" ,method = RequestMethod.GET)
    public List<Person> getUsers(@ApiParam(name="name",value="用户名",required=true)@PathVariable String name){
        List<Person> persons = userService.getUserByName(name);
        return persons;
    }
    @ApiOperation(value = "新增用户信息", notes = "新增一个用户")
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Person save(@RequestBody Person person){
        /*Person person = new Person();
        person.setName("BB");
        person.setAddress("天津");
        person.setAge(10);*/
        userService.save(person);
        return person;
    }
    




}
