package com.ltp.contacts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ltp.contacts.entity.Grade;

import jakarta.transaction.Transactional;

public interface GradeRepository extends CrudRepository<Grade, Long>{
    Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long couseId);
    List<Grade> findByStudentId(Long studentId);
    @Transactional
    void deleteByStudentIdAndCourseId(Long student, Long couseId);
} 