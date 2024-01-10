package com.ltp.contacts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.contacts.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
}