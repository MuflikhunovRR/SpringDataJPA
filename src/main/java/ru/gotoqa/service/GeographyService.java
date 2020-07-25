package ru.gotoqa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gotoqa.entity.GeographyEntity;
import ru.gotoqa.repository.GeographyRepository;

import java.util.List;

/**
 * Service class for Geography table
 *
 * -Transactional
 * Spring Data JPA transaction management annotation
 */
@Service
@Transactional
public class GeographyService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GeographyService.class);

    @Autowired
    GeographyRepository repo;

    /**
     * Add record in the Geography table
     *
     * @param geographyEntity entity class for mapping to Geography table
     */
    public void save(GeographyEntity geographyEntity) {
        repo.save(geographyEntity);
    }

    /**
     * Get all records from Geography table
     *
     * @return {@link GeographyEntity} list records
     */
    public List<GeographyEntity> listAll() {
        return (List<GeographyEntity>) repo.findAll();
    }

    /**
     * Get record from Geography table by id
     *
     * @param id record identifier in the Geography table
     * @return {@link GeographyEntity}
     */
    public GeographyEntity get(Long id) {
        return repo.findById(id).get();
    }

    /**
     * Remove record from Geography table by id
     *
     * @param id record identifier in the Geography table
     */
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
