package com.monim.spring_mongodb.collection;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Student")
public class Student {
    @MongoId                 // Always use this annotation otherwise Id will be private
    private String _id;    
    private String name;
    private String marks;
}
