package java8.service;

import java8.classes.Person;

import java.util.List;

public interface PersonService {
    String createPerson(List <Person> people);
    List<Person>getAll(List<Person>people);

    List<Person> findByName(String name, List<Person>people);
}
