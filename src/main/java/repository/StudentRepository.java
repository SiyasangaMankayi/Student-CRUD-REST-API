package com.example.senddatabase.repository;

import com.example.senddatabase.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<com.example.senddatabase.entity.Student, Long> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);
    Optional<com.example.senddatabase.entity.Student> findByEmail(String email);
}
