package ru.gotoqa;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;
import ru.gotoqa.config.JpaConfig;

/**
 * Root class for all Step Definitions
 */
@CucumberContextConfiguration
@ContextConfiguration(classes = {JpaConfig.class})
public class RootStepDefinition {

    @Before
    public void setup_cucumber_spring_context(){
    }

}