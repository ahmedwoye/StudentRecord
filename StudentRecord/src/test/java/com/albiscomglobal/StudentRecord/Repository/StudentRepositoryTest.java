package com.albiscomglobal.StudentRecord.Repository;

import com.albiscomglobal.StudentRecord.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudentRepository(){

        Student students = Student.builder()
                .firstname("Ahmed")
                .surname("Woye")
                .matric_number("991890")
                .build();
        studentRepository.save(students);

    }

}