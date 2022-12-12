package java8.service.impl;

import java8.classes.Person;
import java8.service.PersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceIpml implements PersonService {
    private List<Person>people;
    @Override
    public String createPerson(List <Person> people) {
        this.people = people;
        return "pasport aldynyz";
    }

    @Override
    public List<Person> getAll(List<Person> people) {
        return this.people;
    }

    @Override
    public List<Person> findByName(String name, List<Person> people) {
        List<Person>people1 = new ArrayList<>();
        for (Person person : people) {
            if (name.equals(person.getName())){
                people1.add(person);
            }
        }
        return people1;
    }
}
