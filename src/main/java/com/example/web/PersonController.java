package com.example.web;

import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{personId}")
    public Person getPerson(@PathVariable int personId) {
        return this.personService.getPerson(personId);
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return this.personService.savePerson(person);
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) {
        return this.personService.updatePerson(person);
    }

    @DeleteMapping("/{personId}")
    public String deletePerson(@PathVariable int personId) {
        this.personService.deletePerson(personId);
        return "Person Removed ID : " + personId;
    }

    @GetMapping
    public List<Person> findAllPersons() {
        return this.personService.findAllPersons();
    }

    @DeleteMapping
    public String deleteAllPersonFromCache() {
        personService.deleteAllPersonFromCache();
        return "All Cache Entries Removed";
    }

}
