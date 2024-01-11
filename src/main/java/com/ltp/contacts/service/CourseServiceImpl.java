package com.ltp.contacts.service;

import java.util.List;
import java.util.Optional;

import com.ltp.contacts.entity.Course;
import com.ltp.contacts.entity.Student;
import com.ltp.contacts.exception.CourseNotFoundException;
import com.ltp.contacts.repository.CourseRepository;
import com.ltp.contacts.repository.StudentRepository;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    CourseRepository courseRepository;
    StudentRepository studentRepository;
    
    @Override
    public List<Course> getCourses() {
        return (List<Course> )courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course getCourse(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        return unwrapCourse(course, id);
    }

    @Override
    public Course addStudentToCourse(Long studentId, Long courseId) {
        Course course = getCourse(courseId);
        Optional<Student> student = studentRepository.findById(studentId);
        Student unwrapStudent = StudentServiceImpl.unwrapStudent(student, studentId);
        course.getStudents().add(unwrapStudent);
        return courseRepository.save(course);
    }

    static Course unwrapCourse(Optional<Course> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new CourseNotFoundException(id);
    }
}
