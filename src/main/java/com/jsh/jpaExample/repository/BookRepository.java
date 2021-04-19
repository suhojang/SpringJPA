package com.jsh.jpaExample.repository;

import com.jsh.jpaExample.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    public Book findBookByName(String name);
    public Book findBookByCategory(String category);
}
