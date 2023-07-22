package com.ahmad.mongodb.mongodb.domain;

import com.ahmad.mongodb.mongodb.enumiration.Gender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Student {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favoriteSubjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime createDate;

    public Student(String firstname, String lastname, String email, Gender gender, Address address, List<String> favoriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime createDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favoriteSubjects = favoriteSubjects;
        this.totalSpentInBooks = totalSpentInBooks;
        this.createDate = createDate;
    }
}
