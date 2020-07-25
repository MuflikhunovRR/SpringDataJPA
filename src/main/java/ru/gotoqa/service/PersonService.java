package ru.gotoqa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gotoqa.entity.PersonEntity;
import ru.gotoqa.repository.PersonRepository;

import java.util.List;

/**
 * Service class for Person table
 *
 * -Transactional
 * Spring Data JPA transaction management annotation
 */
@Service
@Transactional
public class PersonService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonService.class);

    @Autowired
    PersonRepository repo;

    /**
     * Add record in the Person table
     *
     * @param personEntity entity class for mapping to Person table
     */
    public void save(PersonEntity personEntity) {
        repo.save(personEntity);
    }

    /**
     * Get all records from Person table
     *
     * @return {@link PersonEntity} list records
     */
    public List<PersonEntity> listAll() {
        return (List<PersonEntity>) repo.findAll();
    }

    /**
     * Get record from Person table by id
     *
     * @param id record identifier in the Person table
     * @return {@link PersonEntity}
     */
    public PersonEntity get(Long id) {
        return repo.findById(id).get();
    }

    /**
     * Remove record from Person table by id
     *
     * @param id record identifier in the Person table
     */
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
