use companyInc;

CREATE TABLE departments (
	code int NOT NULL,
    name varchar(100),
    description varchar(255),
    PRIMARY KEY (code));

CREATE TABLE projects (
	id int NOT NULL,
    title varchar(100),
    duration varchar(15),
    PRIMARY KEY (id));

CREATE TABLE employees (
	id int NOT NULL auto_increment,
    first_name varchar(30),
    last_name varchar(50),
    email varchar(50),
    department int,
    PRIMARY KEY (id),
    FOREIGN KEY(department) REFERENCES departments(code));
    
CREATE TABLE employees_projects (
	p_id int,
    e_id int,
    FOREIGN KEY(p_id) REFERENCES projects(id),
    FOREIGN KEY(e_id) REFERENCES employees(id),
    PRIMARY KEY(p_id,e_id));
    
INSERT INTO departments VALUES
(001,"Management","Company CO, Human Resources"),
(005,"Production","Printing, Assembly, Storage and Testing"),
(006,"Sales","Phonesales, Websales, Storesales");

INSERT INTO projects VALUES
(283, "Dynamite Crackers", "2 months"),
(546, "Ballistic Biscuits", "8 months"),
(319, "Bug bombs", "14 days");

INSERT INTO employees(first_name,last_name,email,department) VALUES
("Jonas","Madsen","JM@company.com",001),
("Martin","Jensen","MJ@company.com",005),
("Rikke","Rasmussen","RR@company.com",005),
("Sacha","Aaberg","SA@company.com",006),
("Mikkel","Gustavsen","MG@company.com",006);

INSERT INTO employees_projects VALUES
(283,1),
(283,2),
(319,1),
(319,3),
(546,1),
(546,4),
(546,5);
