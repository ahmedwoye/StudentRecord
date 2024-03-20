package com.albiscomglobal.StudentRecord.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="student")
public class Student {


    @Id
@GeneratedValue(
        strategy = GenerationType.IDENTITY
)
    private Long id;
    private String firstname;
    private String surname;
    private String matric_number;
}
