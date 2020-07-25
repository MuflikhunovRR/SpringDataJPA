package ru.gotoqa.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gotoqa.entity.GeographyEntity;

/**
 * Spring magic interface repository for Geography table query
 */
public interface GeographyRepository extends CrudRepository<GeographyEntity, Long> {

}
