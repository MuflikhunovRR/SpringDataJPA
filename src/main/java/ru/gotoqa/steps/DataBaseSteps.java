package ru.gotoqa.steps;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gotoqa.entity.GeographyEntity;
import ru.gotoqa.entity.PersonEntity;
import ru.gotoqa.service.GeographyService;
import ru.gotoqa.service.PersonService;

import java.util.List;

/**
 * Definitions db table steps & assertions
 */
public class DataBaseSteps {

    private final PersonService personService;
    private final GeographyService geographyService;

    @Autowired
    public DataBaseSteps(PersonService personService,
                         GeographyService geographyService) {
        this.personService = personService;
        this.geographyService = geographyService;
    }

    @Then("^get all: ([^\"]*) record(?:s | )from Person table$")
    public void checkCountRecordFromPerson(int countRecord) {
        List<PersonEntity> personEntities = personService.listAll();
        Assertions.assertEquals(countRecord, personEntities.size(),
                "Count of records in the Person table does not match");
    }

    @Then("^get all: ([^\"]*) record(?:s | )from Geography table$")
    public void checkCountRecordFromGeography(int countRecord) {
        List<GeographyEntity> geographyEntities = geographyService.listAll();
        Assertions.assertEquals(countRecord, geographyEntities.size(),
                "Count of records in the Geography table does not match");
    }

}
