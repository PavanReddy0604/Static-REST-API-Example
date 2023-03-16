package com.api.book.bookrestapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
    @Id
    private int authorId;
    private String fName;
    private String lName;
     @OneToOne(mappedBy="author")
     @JsonBackReference
    private Book book;
   
    public Author() {
    }

    public Author(int authorId, String fName, String lName, Book book) {
        this.authorId = authorId;
        this.fName = fName;
        this.lName = lName;
        this.book = book;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
   
    
    
}
