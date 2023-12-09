package com.monim.spring_mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.monim.spring_mongodb.collection.Student;
import com.monim.spring_mongodb.repository.IStudentRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class StudentController {
    @Autowired
    private IStudentRepo iStudentRepo;

    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents() {
        List<Student> students = iStudentRepo.findAll();
        if(students.size()>0){
            return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No record present", HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        iStudentRepo.save(student);

        return new ResponseEntity<Student>(student, HttpStatus.CREATED);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudent(@PathVariable("id") String id) {

        Optional<Student>studentOptional =  iStudentRepo.findById(id);
        if(studentOptional.isPresent()){
            return new ResponseEntity<Student>(studentOptional.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No student record present with id "+id, HttpStatus.NOT_FOUND);
        }
    }
    
}
