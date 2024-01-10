package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.entity.Course;
import com.ltp.contacts.repository.CourseRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;
    
    @Override
    public List<Course> getCourses() {
        return (List<Course> )courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course getCourse(Long id) {
        return courseRepository.findById(id).get();
    }
}
