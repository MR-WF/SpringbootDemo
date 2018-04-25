package com.wf.service.impl;

import com.wf.model.Person;
import com.wf.repository.UserRepository;
import com.wf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mr_WF on 2018/4/21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Person getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<Person> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public Person save(Person person) {
        return userRepository.save(person);
    }

    @Override
    public void delete(Person person) {
        userRepository.delete(person);
    }
}
