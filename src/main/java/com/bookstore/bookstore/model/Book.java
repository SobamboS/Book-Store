package com.bookstore.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity(name="book")
@Data
@NoArgsConstructor
public class Book{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Book_Id")
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private  String author;

    @Column(name="publication")
    private Date publication;

    @Column(name="numberOfInstance")
    private int numberOfInstance;

    @ManyToMany(mappedBy="borrowedBooks")
    private List<User> user;

}
