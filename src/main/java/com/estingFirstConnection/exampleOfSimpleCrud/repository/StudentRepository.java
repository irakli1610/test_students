package com.estingFirstConnection.exampleOfSimpleCrud.repository;

import com.estingFirstConnection.exampleOfSimpleCrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public interface StudentRepository extends JpaRepository<Student,Long> {
}
