package com.text.devellopement.service;


import com.text.devellopement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.text.devellopement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImp implements  StudentService {

@Autowired
    private StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Integer StudentId) {
        return null;
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
