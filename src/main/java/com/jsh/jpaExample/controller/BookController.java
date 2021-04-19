package com.jsh.jpaExample.controller;

import com.jsh.jpaExample.entity.Book;
import com.jsh.jpaExample.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping("/book")
    public List<Book> findAllBook(){
        List<Book> books    = service.findBookAll();
        books.forEach(System.out::println);
        return books;
    }

    @PostMapping("/book")
    public Book save(@RequestBody Book book){
        Book resBook    = service.save(book);
        log.info(resBook.toString());
        return resBook;
    }

    @PutMapping("/book/{bookId}")
    public Book updateBook(@PathVariable("bookId") Long bookId, @RequestBody Book book){
        book.setId(bookId);
        Book resBook    = service.save(book);
        log.info(resBook.toString());
        return resBook;
    }

    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable("bookId") Long bookId){
        service.delete(bookId);
    }
}
