package com.bookstore.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name="_user")
@Data
@NoArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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

    public User(long id,String name,String lastname,String password,String email,List<Book> borrowedBooks){
        this.id=id;
        this.name=name;
        this.lastname=lastname;
        this.password=password;
        this.email=email;
        this.borrowedBooks=borrowedBooks;
    }

}
