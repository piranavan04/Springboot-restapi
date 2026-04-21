package com.spring.restapi.controller;

import com.spring.restapi.entity.Student;
import com.spring.restapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentservice;

    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @PostMapping
    public Student addAddress(@RequestBody Student student) {
        return studentservice.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentservice.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentservice.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentservice.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentservice.deleteStudentById(id);
    }
}
