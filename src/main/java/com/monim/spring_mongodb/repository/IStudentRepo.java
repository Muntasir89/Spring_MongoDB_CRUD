package com.monim.spring_mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.monim.spring_mongodb.collection.Student;

@Repository
public interface IStudentRepo extends MongoRepository<Student, String>{

}
