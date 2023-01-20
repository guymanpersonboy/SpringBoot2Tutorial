package com.guymanpersonboy.springboot2.service;

import com.guymanpersonboy.springboot2.dao.PersonDao;
import com.guymanpersonboy.springboot2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Autowired
    public int addPerson(@Qualifier("fakeDao") Person person) {
        return personDao.insertPerson(person);
    }
}
