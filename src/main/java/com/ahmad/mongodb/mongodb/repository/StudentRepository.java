package com.ahmad.mongodb.mongodb.repository;

import com.ahmad.mongodb.mongodb.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> findStudentByEmail(String email);

    /* for using queries
    @Query("mongo queries")
    void test();
     */

}
