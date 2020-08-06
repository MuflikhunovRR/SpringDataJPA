package ru.gotoqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gotoqa.entity.GeographyEntity;

/**
 * Spring magic interface repository for Geography table query
 */
@Repository
public interface GeographyRepository extends CrudRepository<GeographyEntity, Long> {

}
