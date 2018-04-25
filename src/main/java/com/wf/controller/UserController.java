package com.wf.controller;

import com.wf.model.Person;
import com.wf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mr_WF on 2018/4/21.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/{id}" ,method = RequestMethod.GET)
    public Person getUserById(@PathVariable Long id){
        Person person = userService.getUser(id);
        return person;
    }

    @RequestMapping(value = "/get/users/{name}" ,method = RequestMethod.GET)
    public List<Person> getUsers(@PathVariable("name") String name){
        List<Person> persons = userService.getUserByName(name);
        return persons;
    }
    @RequestMapping(value = "/save")
    public Person save(){
        Person person = new Person();
        person.setName("BB");
        person.setAddress("天津");
        person.setAge(10);
        userService.save(person);
        return person;
    }




}
