package com.example.service;

import com.example.model.Person;
import com.example.repo.PersonRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PersonService {

    public static final String PERSON_CACHE = "PERSON_CACHE";
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @CachePut(cacheNames = {"PERSON_CACHE"}, key = "#result.personId")
    public Person savePerson(Person person) {
        return this.personRepository.save(person);
    }

    @CachePut(cacheNames = {PERSON_CACHE}, key = "#result.personId")
    public Person updatePerson(Person person) {
        return this.personRepository.save(person);
    }

    @Cacheable(cacheNames = {PERSON_CACHE})
    public Person getPerson(@PathVariable int personId) {
        return this.personRepository.findById(personId).get();
    }

    @CacheEvict(cacheNames = {PERSON_CACHE})
    public void deletePerson(@PathVariable int personId) {
        this.personRepository.deleteById(personId);
    }

    public List<Person> findAllPersons() {
        return this.personRepository.findAll();
    }

    @CacheEvict(cacheNames = {PERSON_CACHE}, allEntries = true)
    public void deleteAllPersonFromCache() {
    }
}
