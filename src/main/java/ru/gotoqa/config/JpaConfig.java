package ru.gotoqa.config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Main Configuration class
 */
@Configuration
@ComponentScan(basePackages = {"ru.gotoqa"})
@EnableJpaRepositories("ru.gotoqa.repository")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class JpaConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(AppProperties props) {
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(dataSource(props));
        entityManagerFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        entityManagerFactory.setPackagesToScan(props.getDbPackagesScan());
        entityManagerFactory.setJpaProperties(getJpaProperties(props));

        return entityManagerFactory;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);

        return transactionManager;
    }

    private Properties getJpaProperties(AppProperties props) {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", props.getHibernateDialect());
        properties.put("hibernate.show_sql", props.getHibernateShowSql());
        properties.put("hibernate.hbm2ddl.auto", props.getHibernateHbm2ddlAuto());

        return properties;
    }

    @Bean
    public DataSource dataSource(AppProperties props) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(props.getDbDriverClassname());
        dataSource.setUrl(props.getDblUrl());
        dataSource.setUsername(props.getDbLogin());
        dataSource.setPassword(props.getDbPassword());

        // schema init
        Resource initSchema = new ClassPathResource("schema-h2.sql");
        Resource initData = new ClassPathResource("data-h2.sql");
        DatabasePopulator databasePopulator = new ResourceDatabasePopulator(initSchema, initData);
        DatabasePopulatorUtils.execute(databasePopulator, dataSource);

        return dataSource;
    }

}
