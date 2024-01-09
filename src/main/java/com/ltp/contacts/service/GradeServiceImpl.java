package com.ltp.contacts.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ltp.contacts.model.Grade;
import com.ltp.contacts.repository.GradeRepository;

public class GradeServiceImpl implements GradeService{

    @Autowired
    GradeRepository gradeRepository;
    
    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        return null;
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        return null;
    }
}
