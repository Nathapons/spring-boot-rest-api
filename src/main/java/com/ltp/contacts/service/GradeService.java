package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.model.Grade;

public interface GradeService {
    Grade getGrade(Long studentId, Long courseId);
    Grade saveGrade(Grade grade, Long studentId, Long courseId);
    Grade updateGrade(String score, Long studentId, Long courseId);
    List<Grade> getAllGrades();
}
