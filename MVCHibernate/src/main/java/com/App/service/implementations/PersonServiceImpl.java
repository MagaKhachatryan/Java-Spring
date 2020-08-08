package com.App.service.implementations;

import com.App.dao.interfaces.PersonDAO;
import com.App.model.Person;
import com.App.service.interfaces.PersonService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private   PersonDAO personDAO;


    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    @Transactional
    @Override
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);

    }

    @Transactional
    @Override
    public void updatePerson(Person p) {
        this.personDAO.updatePerson(p);

    }
    @Transactional
    @Override
    public List<Person> listPersons() {
       return  this.personDAO.listPersons();
    }

    @Transactional
    @Override
    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }

    @Transactional
    @Override
    public void removePerson(int id) {
        this.personDAO.removePerson(id);

    }
}
