package com.ltp.contacts.service;

import java.util.List;
import java.util.Set;

import com.ltp.contacts.entity.Student;
import com.ltp.contacts.entity.Course;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledCourses(Long id);
}