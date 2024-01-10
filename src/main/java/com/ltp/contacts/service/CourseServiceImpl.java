package com.ltp.contacts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltp.contacts.entity.Course;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    
    @Override
    public List<Course> getCourse() {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Course getCourse(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
