package com.example;

import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Component
@EnableTransactionManagement
public class PersonDataInitializer implements CommandLineRunner {

    private final PersonService personService;

    public PersonDataInitializer(PersonService personService) {
        this.personService = personService;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        long start = System.currentTimeMillis();
        System.out.println("Starting batch job");


        for (int i = 1; i <= 10; i++) {
            Person person = new Person("firsName" + i, "lastName" + i);
            personService.savePerson(person);
        }

        long end = System.currentTimeMillis();

        System.out.println("Ending batch job");

        System.out.println("Time taken : " + (end - start));

    }

}
