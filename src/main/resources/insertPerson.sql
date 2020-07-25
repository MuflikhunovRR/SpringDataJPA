-- INSERT Multiple Rows
INSERT INTO Person (first_name, last_name, birthday, email, phone, job)
VALUES
('Eva', 'Muflikhunova', null, 'eva@gotoqa.ru', '+7-916-548-7777', 'newborn'),
('Roman', 'Muflikhunov', null, 'roman@gotoqa.ru', '+7-916-548-8888', 'Sber'),
('Vika', 'Muflikhunova', DATE '2015-12-17', 'vika@gotoqa.ru', '+7-916-548-9999', 'Sber'),
('John', 'Travolta', DATE '1980-12-17', 'john@gotoqa.ru', '+7-916-548-1111', 'BBC'),
('Ken', 'Barby', DATE '1930-12-17', 'ken@gotoqa.ru', '+7-916-548-0000', 'Alatoys');


-- Insert 1 row
INSERT INTO Person
VALUES (1, 'Eva', 'Muflikhunova', null, 'eva@gotoqa.ru', '+7-916-548-7777', 'newborn');

INSERT INTO Person
VALUES (2, 'Roman', 'Muflikhunov', null, 'roman@gotoqa.ru', '+7-916-548-8888', 'Sber');

INSERT INTO Person
VALUES (3, 'Vika', 'Muflikhunova', DATE '2015-12-17', 'vika@gotoqa.ru', '+7-916-548-9999', 'Sber');

INSERT INTO Person
VALUES (4, 'John', 'Travolta', DATE '1980-12-17', 'john@gotoqa.ru', '+7-916-548-1111', 'BBC');

INSERT INTO Person
VALUES (5, 'Ken', 'Barby', DATE '1930-12-17', 'ken@gotoqa.ru', '+7-916-548-0000', 'Alatoys');

INSERT INTO Person
VALUES (null, 'Ken', 'Barby', DATE '1930-12-17', 'ken@gotoqa.ru', '+7-916-548-0000', 'Alatoys');


-- Reset AutoIncrement in SQL Server after Delete
ALTER TABLE tablename AUTO_INCREMENT = 1;