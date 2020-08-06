package ru.gotoqa.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Variables for db connecting (application.properties)
 */
@Component
@Getter
public class AppProperties {

    @Value("${spring.datasource.url}")
    private String dblUrl;

    @Value("${spring.datasource.username}")
    private String dbLogin;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Value("${spring.datasource.driverClassName}")
    private String dbDriverClassname;

    @Value("${em.packages.scan}")
    private String dbPackagesScan;

    @Value("${spring.jpa.database-platform}")
    private String hibernateDialect;

    @Value("${spring.jpa.show-sql}")
    private String hibernateShowSql;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String hibernateHbm2ddlAuto;

}
