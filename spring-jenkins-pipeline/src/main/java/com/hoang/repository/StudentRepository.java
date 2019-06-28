package com.hoang.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hoang.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
