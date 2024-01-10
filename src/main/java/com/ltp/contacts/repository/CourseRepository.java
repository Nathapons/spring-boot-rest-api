package com.ltp.contacts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.contacts.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
    boolean existsBySubjectAndCodeAndDescription(String subject, String code, String description);
}