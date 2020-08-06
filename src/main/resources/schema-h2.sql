DROP TABLE IF EXISTS Person;
DROP TABLE IF EXISTS Geography;

CREATE TABLE Geography(
    country    VARCHAR(150),
    city       VARCHAR(150),
    population INT,
    language   VARCHAR(150)
);

CREATE TABLE Person(
    id         INT(11) NOT NULL,
    first_name VARCHAR(150),
    last_name  VARCHAR(150),
    birthday   VARCHAR(10),
    email      VARCHAR(150),
    phone      VARCHAR(150),
    job        VARCHAR(150)
);