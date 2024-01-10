package com.ltp.contacts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "course")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "subject", nullable = false)
    @NonNull
    private String subject;

    @Column(name = "code", nullable = false)
    @NonNull
    private String code;

    @Column(name = "description", nullable = false)
    @NonNull
    private String description;
}
