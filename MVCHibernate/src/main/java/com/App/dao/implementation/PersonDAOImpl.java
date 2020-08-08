package com.App.dao.implementation;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.App.dao.interfaces.PersonDAO;
import com.App.model.Person;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PersonDAOImpl implements PersonDAO {
    private static final Logger logger = LoggerFactory.logger(PersonDAOImpl.class);
    private  SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;
    }
    @Override
    public void addPerson(Person person) {

        Session session=this.sessionFactory.getCurrentSession();
        session.persist(person);
        logger.info("Person is saved in db successfully .Person details " + person);
    }

    @Override
    public void updatePerson(Person p) {
        Session session  =this.sessionFactory.getCurrentSession();
        session.update(p);
        logger.info("Person is updated successfully. Person details:" + p );

    }

    @Override
    public List<Person> listPersons() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Person> personsList = session.createQuery("from Person").list();
        for(Person p : personsList){
            logger.info("Person List::"+p);
        }
        return personsList;
    }

    @Override
    public Person getPersonById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Person person=(Person)session.load(Person.class,new Integer(id));
        logger.info("Person is loaded successfully,Person details=" + person);
        return person;
    }

    @Override
    public void removePerson(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Person person=(Person)session.load(Person.class,new Integer(id));
        if(person!=null)
        {
            session.delete(person);
        }
        logger.info("Person is deleted successfully,person details" + person);


    }
}
