package com.spring.restapi.service;


import com.spring.restapi.entity.Student;

import java.util.List;

public interface StudentService {

    //CREATE
    Student saveStudent(Student student);

    //READ ALL
    List<Student> getAllStudents();

    //READ ONE BY ID
    Student getStudentById(Long id);

    //UPDATE
    Student updateStudent(Long id, Student student);

    //DELETE
    void deleteStudentById(Long id);


}

