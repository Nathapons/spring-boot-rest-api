package com.ltp.contacts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ltp.contacts.entity.Grade;
import com.ltp.contacts.entity.Student;
import com.ltp.contacts.exception.GradeNotFoundException;
import com.ltp.contacts.repository.GradeRepository;
import com.ltp.contacts.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService{

    GradeRepository gradeRepository;
    StudentRepository studentRepository;

    @Override
    public List<Grade> getAllGrades() {
        return (List<Grade>)gradeRepository.findAll();
    }
    
    // @Override
    // public Grade getGrade(Long studentId, Long courseId) {
    //     Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
    //     return unwrapGrade(grade, studentId, courseId);
    // }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId).get();
        System.out.println(studentId);
        System.out.println(student);
        grade.setStudent(student);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        return null;
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    static Grade unwrapGrade(Optional<Grade> entity, Long studentId, Long courseId) {
        if (entity.isPresent()) return entity.get();
        else throw new GradeNotFoundException(studentId, courseId);
    }
}
