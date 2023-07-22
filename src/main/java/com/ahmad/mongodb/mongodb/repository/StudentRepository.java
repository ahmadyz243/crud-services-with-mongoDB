package com.ahmad.mongodb.mongodb.repository;

import com.ahmad.mongodb.mongodb.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
