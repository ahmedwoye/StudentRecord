package com.albiscomglobal.StudentRecord.Controller;

import com.albiscomglobal.StudentRecord.Entity.Student;
import com.albiscomglobal.StudentRecord.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getSingleStudent(@PathVariable Long id){
        return new ResponseEntity<Student>(studentService.getSingleStudent(id), HttpStatus.OK);
    }
}
