package ru.gotoqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gotoqa.entity.PersonEntity;

/**
 * Spring magic interface repository for Person table query
 */
@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

}
