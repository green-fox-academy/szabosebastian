/*-- SHOW databases;

-- CREATE DATABASE IF NOT EXISTS Todo;

-- USE todo;

CREATE TABLE TodoList(
id INT unsigned NOT NULL AUTO_INCREMENT,
description VARCHAR(200) NOT NULL,
priority ENUM ('low', 'medium', 'high'),
PRIMARY KEY (id)
); 

INSERT INTO todoList (description, priority)
VALUES ('Shopping', 'medium'), ('Gaming', 'high'), ('Cleaning','medium');

SELECT * FROM TodoList;

CREATE TABLE people(
id INT unsigned NOT NULL AUTO_INCREMENT,
name VARCHAR(100),
PRIMARY KEY (id)
);

INSERT INTO people (name)
VALUE ('Lajos'), ('Andor'),('Zsombor');

DELETE FROM people WHERE id IN(4);

UPDATE people SET id=4 WHERE id=6;

SELECT DISTINCT * FROM people;

DROP TABLE people;

CREATE TABLE people(
id INT unsigned NOT NULL AUTO_INCREMENT,
name VARCHAR(100),
task_id INT unsigned,
FOREIGN KEY (task_id) REFERENCES todolist (id),
PRIMARY KEY (id)
);

INSERT INTO people (name)
VALUE ('Lajos'), ('Andor'),('Zsombor');

SELECT * FROM people
INNER JOIN todolist;*/

SELECT * FROM people WHERE name LIKE '_n%';


