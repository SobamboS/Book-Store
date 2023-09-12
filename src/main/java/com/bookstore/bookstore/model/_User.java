package com.bookstore.bookstore.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="user")
public class _User{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="User_Id")
    private long id;

    @Column(name="Name")
    private String name;

    @Column(name="Last_name")
    private String lastname;

    @Column(name="Password")
    private String password;

    @Column(name="Email.")
    private String email;

    @Column(name="BorrowedBooks")
    @ManyToMany
    @JoinTable(
            name="borrowed_books",
            joinColumns= @JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="book_id")
    )
    private List<Book> borrowedBooks;


}
