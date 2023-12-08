package com.monim.spring_mongodb.collection;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id; // Always use this annotation otherwise Id will be null
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Student")
public class Student {
    @Id
    private String Id;
    private String name;
    private String marks;
}
