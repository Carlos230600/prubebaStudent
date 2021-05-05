package com.example.appBack.Student.controller;

import com.example.appBack.Student.Entity.Student;
import com.example.appBack.Student.Entity.StudentDTO;
import com.example.appBack.Student.repositorio.ServicioStudent;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostRemove;

@RestController
public class StudentController {

    @Autowired
    ServicioStudent servicioStudent;

    @PostMapping
    public ResponseEntity addStudent(StudentDTO studentDTO){
        servicioStudent.addStudent(studentDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping


    @DeleteMapping


    @PutMapping


    /*@PostMapping
    public ResponseEntity addStudent(Student student){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity deleteStudent(String id){
        return ResponseEntity.badRequest().build();
    }

    @GetMapping
    public Student obtenerAlumno(String id){
        Student student=new Student();
        return student;
    }*/

}
