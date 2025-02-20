CREATE DATABASE company;
USE company;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    department VARCHAR(50),
    salary DECIMAL(10,2)
);

INSERT INTO employees (name, age, department, salary) VALUES
('Bipin Kumar Sahu', 30, 'IT', 70000.00),
('Om Tiwari', 25, 'HR', 50000.00),
('Aryan', 28, 'Finance', 60000.00);
