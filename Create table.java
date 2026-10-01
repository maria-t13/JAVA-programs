CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    roll_no INT,
    name VARCHAR(50) NOT NULL,
    age INT,
    DOB DATE,
    email VARCHAR(100) NOT NULL,
    phone_no VARCHAR(15) NOT NULL,
    address VARCHAR(100)
);

INSERT INTO Student
(student_id, roll_no, name, age, DOB, email, phone_no, address)
VALUES
(1, 101, 'Maria', 20, '2006-03-13', 'maria@gmail.com', '9876543210', 'Bangalore');

INSERT INTO Student
(student_id, roll_no, name, age, DOB, email, phone_no, address)
VALUES
(2, 102, 'Anu', 20, '2006-05-20', 'anu@gmail.com', '9876543211', 'Mysore');

INSERT INTO Student
(student_id, roll_no, name, age, DOB, email, phone_no, address)
VALUES
(3, 103, 'Rahul', 21, '2005-08-15', 'rahul@gmail.com', '9876543212', 'Chennai');

SELECT * FROM Student;
