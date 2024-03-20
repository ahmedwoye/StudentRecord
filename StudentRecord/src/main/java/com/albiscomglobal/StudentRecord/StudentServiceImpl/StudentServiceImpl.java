package com.albiscomglobal.StudentRecord.StudentServiceImpl;

import com.albiscomglobal.StudentRecord.Entity.Student;
import com.albiscomglobal.StudentRecord.Repository.StudentRepository;
import com.albiscomglobal.StudentRecord.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getSingleStudent(Long id) {
        return null;
    }

    @Override
    public void deleteSingleStudent(Long id) {

    }

    @Override
    public Student saveSingleStudent(Student student) {
        return null;
    }

    @Override
    public Student updateSingleStudent(Student student, Long id) {
        return null;
    }
}
