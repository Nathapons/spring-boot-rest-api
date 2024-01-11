package com.ltp.contacts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ltp.contacts.entity.Course;
import com.ltp.contacts.entity.Grade;
import com.ltp.contacts.entity.Student;
import com.ltp.contacts.exception.GradeNotFoundException;
import com.ltp.contacts.repository.CourseRepository;
import com.ltp.contacts.repository.GradeRepository;
import com.ltp.contacts.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GradeServiceImpl implements GradeService{

    GradeRepository gradeRepository;
    StudentRepository studentRepository;
    CourseRepository courseRepository;

    @Override
    public List<Grade> getAllGrades() {
        return (List<Grade>)gradeRepository.findAll();
    }
    
    @Override
    public Grade getGrade(Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        if (grade.isPresent()) {
            return grade.get();
        } else {
            throw new GradeNotFoundException(studentId, courseId);
        }
    }

    @Override
    public Grade saveGrade(Grade grade, Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId).get();
        Course course = courseRepository.findById(courseId).get();
        grade.setStudent(student);
        grade.setCourse(course);
        return gradeRepository.save(grade);
    }

    @Override
    public Grade updateGrade(String score, Long studentId, Long courseId) {
        Optional<Grade> grade = gradeRepository.findByStudentIdAndCourseId(studentId, courseId);
        if (grade.isPresent()) {
            Grade unwrapGrade = grade.get();
            unwrapGrade.setScore(score);
            return gradeRepository.save(unwrapGrade);
        } else {
            throw new GradeNotFoundException(studentId, courseId);
        }
    }

    @Override
    public List<Grade> getStudentGrades(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    static Grade unwrapGrade(Optional<Grade> entity, Long studentId, Long courseId) {
        if (entity.isPresent()) return entity.get();
        else throw new GradeNotFoundException(studentId, courseId);
    }

    @Override
    public void deleteGrade(Long studentId, Long courseId) {
        
    }
}
