package com.App.dao.interfaces;

import com.App.model.Person;

import java.util.List;

public interface PersonDAO {
    void addPerson(Person person);

    void updatePerson(Person p);

    List<Person> listPersons();

    Person getPersonById(int id);

    void removePerson(int id);
}

