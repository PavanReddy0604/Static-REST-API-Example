package com.api.book.bookrestapi.entities;



import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
    @Id
    private int id;
    private String bookName;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Author author;

    public Book() {
    }

    
    public Book(int id, String bookName,  Author author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(Author a) {
        this.author = a;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + "]";
    }

}
