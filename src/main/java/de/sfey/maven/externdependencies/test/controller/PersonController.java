package de.sfey.maven.externdependencies.test.controller;

import de.sfey.maven.externdependencies.test.model.Person;
import de.sfey.maven.externdependencies.test.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {


    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("")
    Person getPerson(@RequestParam("name") String name) {
        return personRepository.findByName(name);
    }

    @PostMapping("")
    Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}
