package com.curd.my_app.repos;

import com.curd.my_app.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepository extends MongoRepository<Student, Long> {
}
