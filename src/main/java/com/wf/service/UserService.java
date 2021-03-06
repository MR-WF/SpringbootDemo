package com.wf.service;

import com.wf.model.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by Mr_WF on 2018/4/21.
 */
public interface UserService {
    Person getUser(Long id);
    List<Person> getUserByName(String name);
    Person save(Person person);
    void delete(Person person);

    List<Map<String,Object>> getDatas();
}
