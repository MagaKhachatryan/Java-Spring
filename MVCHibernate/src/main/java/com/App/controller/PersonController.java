package com.App.controller;


import com.App.model.Person;
import com.App.service.interfaces.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

    private PersonService personService;

    @Autowired(required = true)
    @Qualifier(value = "personService")
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value="/persons", method = RequestMethod.GET)
    public String listPersons(Model model)
    {
        model.addAttribute("person", new Person());
        model.addAttribute("listPersons",this.personService.listPersons());
        return "person";
    }

    @RequestMapping(value = "/person/add" ,method=RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person p)
    {
        if(p.getId()==0)
        {
            this.personService.addPerson(p);
        }
        else
        {
            this.personService.updatePerson(p);
        }
        return "redirect:/persons";
    }


    @RequestMapping(value = "/remove/{id}")
    public String removePerson(@PathVariable ("id") int id){
        this.personService.removePerson(id);
        return "redirect:/persons";
    }

}
