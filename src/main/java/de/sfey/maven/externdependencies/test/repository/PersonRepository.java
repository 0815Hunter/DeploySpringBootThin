package de.sfey.maven.externdependencies.test.repository;

import de.sfey.maven.externdependencies.test.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findByName(String name);

}
