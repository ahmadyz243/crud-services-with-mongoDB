package com.ahmad.mongodb.mongodb.controller.rest;

import com.ahmad.mongodb.mongodb.domain.Student;
import com.ahmad.mongodb.mongodb.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
