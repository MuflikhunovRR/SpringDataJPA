package ru.gotoqa.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gotoqa.entity.PersonEntity;

/**
 * Spring magic interface repository for Person table query
 */
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

}
