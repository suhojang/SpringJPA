package com.jsh.jpaExample.service;

import com.jsh.jpaExample.entity.Book;
import com.jsh.jpaExample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> findBookAll() {
        return (List<Book>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Book findBookByName(String name) {
        return repository.findBookByName(name);
    }

    @Override
    public Book findBookByCategory(String category) {
        return repository.findBookByCategory(category);
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }
}
