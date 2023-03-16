package com.api.book.bookrestapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bookrestapi.dao.BookRepo;
import com.api.book.bookrestapi.entities.Book;

@Service
public class BookService {

    @Autowired
    private BookRepo br;

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) br.findAll();
        return list;
    }

    public Book getBookById(int i) {
        Book book = null;
        try {
            book = this.br.findById(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book b) {
        Book book = br.save(b);
        return book;
    }

    public void deleteBook(int id) {
        br.deleteById(id);
    }

    public void updateBook(Book book, int id) {
        book.setId(id);
        br.save(book);

    }

}
