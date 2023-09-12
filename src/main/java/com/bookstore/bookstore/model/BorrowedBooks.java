package com.bookstore.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name="BorrowedBooks")
@Data
@NoArgsConstructor
public class BorrowedBooks{

    @Id
    @Column(name="BorrowedBooks_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="book_id")
    private Book book;

    @Column(name="user_id")
    private User user;



}
