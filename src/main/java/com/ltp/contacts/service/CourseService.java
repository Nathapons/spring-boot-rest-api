package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.entity.Course;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}
