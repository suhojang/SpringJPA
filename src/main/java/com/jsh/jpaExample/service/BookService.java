package com.jsh.jpaExample.service;

import com.jsh.jpaExample.entity.Book;

import java.util.List;

public interface BookService {
    public Book findBookByName(String name);
    public Book findBookByCategory(String category);
    public Book save(Book book);
    public List<Book> findBookAll();
    public void delete(Long id);
}
