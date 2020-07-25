package ru.gotoqa;

import cucumber.api.java.Before;
import org.springframework.test.context.ContextConfiguration;
import ru.gotoqa.config.JpaConfig;

/**
 * Root class for all Step Definitions
 */
@ContextConfiguration(classes = {JpaConfig.class})
public class RootStepDefinition {

    @Before
    public void setup_cucumber_spring_context(){
    }

}