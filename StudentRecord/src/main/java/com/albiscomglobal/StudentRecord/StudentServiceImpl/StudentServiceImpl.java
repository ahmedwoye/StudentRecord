package com.albiscomglobal.StudentRecord.StudentServiceImpl;

import com.albiscomglobal.StudentRecord.Entity.Student;
import com.albiscomglobal.StudentRecord.Repository.StudentRepository;
import com.albiscomglobal.StudentRecord.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
        Optional<Student> Hayat = studentRepository.findById(id);
        if(Hayat.isPresent()){
            return Hayat.get();
        }
        throw new RuntimeException("The student with the id cannot be found " + id);
    }

    @Override
    public void deleteSingleStudent(Long id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Student saveSingleStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateSingleStudent(Student student, Long id) {
        Student existingStudent = getSingleStudent(id);
        existingStudent.setFirstname(student.getFirstname() !=null ? existingStudent.getFirstname() : student.getFirstname());
        existingStudent.setSurname(student.getSurname() !=null ? existingStudent.getSurname() : student.getSurname());
        existingStudent.setMatric_number(student.getMatric_number() !=null ? existingStudent.getMatric_number() : student.getMatric_number());
        return studentRepository.save(student);
    }
}
