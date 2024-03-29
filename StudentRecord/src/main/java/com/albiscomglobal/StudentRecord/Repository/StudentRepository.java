package com.albiscomglobal.StudentRecord.Repository;


import com.albiscomglobal.StudentRecord.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    Optional<Student> findBySurname (String surname);
}
