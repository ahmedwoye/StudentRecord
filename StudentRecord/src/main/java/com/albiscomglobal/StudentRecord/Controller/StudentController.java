package com.albiscomglobal.StudentRecord.Controller;

import com.albiscomglobal.StudentRecord.Entity.Student;
import com.albiscomglobal.StudentRecord.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/student")
    public ResponseEntity<Student> saveSingleStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveSingleStudent(student), HttpStatus.CREATED);
    }




    @DeleteMapping("/student/{id}")
    public void deleteSingleStudent(@RequestParam Long id){
        studentService.deleteSingleStudent(id);
    }



    @PutMapping("/student")
    public Student updateSingleStudent(@RequestBody Student student , @PathVariable Long id){
        student.setId(id);
        return studentService.saveSingleStudent(student);
    }
}
