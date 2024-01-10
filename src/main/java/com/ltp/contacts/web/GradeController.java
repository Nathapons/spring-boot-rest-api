package com.ltp.contacts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.ltp.contacts.entity.Grade;
import com.ltp.contacts.service.GradeService;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    GradeService gradeService;

    // @GetMapping("/student/{studentId}/course/{courseId}")
    // public ResponseEntity<Grade> getGrade(@PathVariable Long studentId, @PathVariable Long courseId) {
    //     return new ResponseEntity<>(gradeService.getGrade(studentId, courseId), HttpStatus.OK);
    // }
    
    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<Grade>> getStudentGrades(@PathVariable Long studentId) {
        return new ResponseEntity<>(gradeService.getStudentGrades(studentId), HttpStatus.OK);
    }
    

    @PostMapping("/student/{studentId}/course/{courseId}") 
    public ResponseEntity<Grade> saveGrade(@RequestBody Grade grade, @PathVariable Long studentId, @PathVariable Long courseId) {
        return new ResponseEntity<>(gradeService.saveGrade(grade, studentId, courseId), HttpStatus.CREATED);
    }
}
