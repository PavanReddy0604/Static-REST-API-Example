package com.api.book.bookrestapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bookrestapi.entities.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

    public Book findById(int id);

}
