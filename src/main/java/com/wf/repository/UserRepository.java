package com.wf.repository;

import com.wf.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mr_WF on 2018/4/21.
 */
public interface UserRepository extends JpaRepository<Person,Long> {

    Person findOne(Long id);
    List<Person> findByName(String name);
    Person save(Person person);
    void delete(Person person);

}
