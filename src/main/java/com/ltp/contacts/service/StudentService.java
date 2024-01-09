package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.model.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
}