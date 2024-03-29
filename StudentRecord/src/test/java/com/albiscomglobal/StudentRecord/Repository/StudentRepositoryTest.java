package com.albiscomglobal.StudentRecord.Repository;

import com.albiscomglobal.StudentRecord.Entity.Student;
import org.hibernate.query.sqm.mutation.internal.cte.CteInsertStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void givenStudentObject_WhenSave_thenReturedSavedStudent(){


        //given -precondition or setup


        Student students = Student.builder()
                .firstname("Farhan")
                .surname("Woye")
                .matric_number("232090")
                .build();

        //When -action or the behaviour that we are going test

        Student savedStudent = studentRepository.save(students);


        //then - verify the output

        assertThat(savedStudent).isNotNull();
        assertThat(savedStudent.getId()).isGreaterThan(0);

    }


    // Junit test for get all student operation


    @DisplayName("Junit for student display")
@Test
    public void givenStudentList_whenFindAll_thenStudentList(){

        // given -precondition or setup

    Student students = Student.builder()
            .firstname("Ajetumobi")
            .surname("Akinloye")
            .matric_number("20090")
            .build();


    Student students2 = Student.builder()
            .firstname("Taofeeq")
            .surname("Abiona")
            .matric_number("20091")
            .build();

    studentRepository.save(students);
    studentRepository.save(students2);

        //when- action or the behaviour that we are going test

    List<Student> studentList = studentRepository.findAll();


        //then - verify the output

    assertThat(studentList).isNotNull();
    assertThat(studentList.size()).isEqualTo(2);

    }

//Junit test get employee by id operation
//
@DisplayName("Junit test for get student by id operation")
@Test
         public void givenStudentObject_whenFindById_thenReturnStudentObject(){

             // given -precondition or setup

    Student students = Student.builder()
            .firstname("Ajetumobi")
            .surname("saratu")
            .matric_number("21090")
            .build();

    studentRepository.save(students);


    //when- action or the behaviour that we are going test

    Student studentdb = studentRepository.findById(students.getId()).get();


         //then - verify the output


    assertThat(studentdb).isNotNull();

         }
// Junit test for Querty Method - get Student by matricnumber operation.



    @DisplayName("Junit test for get student by matric_number")
@Test
    public void givenSurname_whenFindBySurname_thenReturnSurname(){

        // given -precondition or setup
    Student students = Student.builder()
            .firstname("Ajetumobi")
            .surname("mariam")
            .matric_number("27090")
            .build();

    studentRepository.save(students);

    //when- action or the behaviour that we are going test
    Student studentDB = studentRepository.findBySurname(students.getSurname()).get();

    //then - verify the output
        assertThat(studentDB).isNotNull();
    }


}