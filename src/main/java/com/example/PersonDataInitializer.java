package com.example;

import com.example.model.Person;
import com.example.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Component
@EnableTransactionManagement
@Slf4j
public class PersonDataInitializer implements CommandLineRunner {

    private final PersonService personService;

    public PersonDataInitializer(PersonService personService) {
        this.personService = personService;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        personService.deleteAllPersonFromCache();
        long start = System.currentTimeMillis();
        log.info("Starting person batch job {}", start);
        for (int i = 1; i <= 10; i++) {
            Person person = new Person("firsName" + i, "lastName" + i);
            personService.savePerson(person);
        }
        long end = System.currentTimeMillis();
        log.info("Completed person batch job Time taken : {}", (end - start));
    }

}
