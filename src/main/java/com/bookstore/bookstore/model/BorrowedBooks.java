package com.bookstore.bookstore.model;

import jakarta.persistence.*;


@Entity(name="BorrowedBooks")
public class BorrowedBooks{

    @Id
    @Column(name="BorrowedBooks_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="book_id")
    private Book book;

    @Column(name="user_id")
    private _User user;



}
