package com.guymanpersonboy.springboot2.dao;

import com.guymanpersonboy.springboot2.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// For the purposes of testing dependency injection, incomplete class
@Repository("postgres")
public class PersonDataAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    // Can check that this GET all is used by PersonService
    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
