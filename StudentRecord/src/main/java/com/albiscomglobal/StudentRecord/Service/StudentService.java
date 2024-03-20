package com.albiscomglobal.StudentRecord.Service;

import com.albiscomglobal.StudentRecord.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    Student getSingleStudent (Long id);

    void deleteSingleStudent(Long id);

    Student saveSingleStudent(Student student);

    Student updateSingleStudent (Student student, Long id);
}
