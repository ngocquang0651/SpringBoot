package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;
@Repository
public class FakePersonDataAccessService implements PersonDao {
//Them nguoi vao
    private static ArrayList<Person> DB =new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id ,person.getName()));
        return 1;
    }

    @Override
    public int addPerson(Person person) {
        return 0;
    }

    @Override
    public int insertPerson(Person person) {
        return 0;
    }
}
