CREATE TABLE Student (
  Id INT AUTO_INCREMENT NOT NULL,
   REGISTRATION_N VARCHAR(255),
   Name VARCHAR(30) NOT NULL,
   birthday date,
   stillActive BOOLEAN,
   lastConnection TIMESTAMP,
   CONSTRAINT pk_student PRIMARY KEY (Id)
);

ALTER TABLE Student ADD CONSTRAINT uc_student_registration_n UNIQUE (REGISTRATION_N);