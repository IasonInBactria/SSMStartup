package com.argo.controller;


import com.argo.domain.Book;
import com.argo.mapper.BookMapper;
import com.argo.service.impl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return false;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return false;
    }

    @PutMapping
    public void update(@RequestBody Book book) {

    }

    @GetMapping("/{id}")
    public boolean getById(@PathVariable Integer id) {
        return false;
    }

    @GetMapping
    public List<Book> getAll() {
        return null;
    }
}
