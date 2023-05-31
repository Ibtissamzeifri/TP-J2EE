package com.text.devellopement.service;

import com.text.devellopement.entity.Student;

import java.util.List;


public interface StudentService {

    Student saveStudent(Student student);
    List<Student> fetchStudentList();
    Student updateStudent(Student student,Integer StudentId);
    void deleteStudentById(Integer studentId);
}
