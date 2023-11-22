package com.argo.controller;


import com.argo.domain.Book;
import com.argo.mapper.BookMapper;
import com.argo.service.impl.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
    @Resource
    BookService bookService;

    public boolean save(Book book) {
        return false;
    }

    public boolean delete(Integer id) {
        return false;
    }

    public void update(Book book) {

    }

    public boolean getById(Integer id) {
        return false;
    }

    public List<Book> getAll() {
        return null;
    }
}
