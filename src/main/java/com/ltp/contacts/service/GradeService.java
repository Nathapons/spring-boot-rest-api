package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.entity.Grade;

public interface GradeService {
    Grade getGrade(Long studentId, Long courseId);
    Grade saveGrade(Grade grade, Long studentId, Long courseId);
    Grade updateGrade(String score, Long studentId, Long courseId);
    List<Grade> getAllGrades();
    List<Grade> getStudentGrades(Long studentId);
    void deleteGrade(Long studentId, Long courseId);
}
