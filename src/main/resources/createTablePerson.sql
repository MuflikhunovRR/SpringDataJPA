CREATE TABLE Person
(
    id         INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(150),
    last_name  VARCHAR(150),
    birthday   DATE,
    email      VARCHAR(150),
    phone      VARCHAR(150),
    job        VARCHAR(150)
);