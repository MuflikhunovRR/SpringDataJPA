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

    @Value("${hibernate.mysql.url}")
    private String dbMySqlUrl;

    @Value("${hibernate.mysql.schema}")
    private String dbMySqlSchema;

    @Value("${hibernate.mysql.login}")
    private String dbMySqlLogin;

    @Value("${hibernate.mysql.password}")
    private String dbMySqlPassword;

    @Value("${driver.mysql.classname}")
    private String dbDriverClassname;

    @Value("${em.packages.scan}")
    private String dbPackagesScan;

    @Value("${hibernate.dialect}")
    private String hibernateDialect;

    @Value("${hibernate.show_sql}")
    private String hibernateShowSql;

    @Value("${hibernate.hbm2ddl.auto}")
    private String hibernateHbm2ddlAuto;

}
