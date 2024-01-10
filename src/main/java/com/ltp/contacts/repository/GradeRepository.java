package com.ltp.contacts.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ltp.contacts.entity.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long>{
    Grade findByStudentIdAndCourseId(Long studentId);
    List<Grade> findByStudentId(Long studentId);
} 