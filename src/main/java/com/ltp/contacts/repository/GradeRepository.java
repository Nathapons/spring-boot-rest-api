package com.ltp.contacts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.contacts.entity.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long>{
    Grade findByStudentId(Long studentId);
} 