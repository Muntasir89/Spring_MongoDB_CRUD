package com.monim.spring_mongodb.collection;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String personId;
    private String firstName;
    private String lastName;
    private Integer age;
    private List<String>hobbies;
    private List<Address> addresses; 
}
