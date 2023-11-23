package com.argo.service.impl;

import com.argo.domain.Book;
import com.argo.mapper.BookMapper;
import com.argo.service.impl.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;
    @Override
    public boolean save(Book book) {
        return bookMapper.save(book);
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.delete(id);
    }

    @Override
    public boolean update(Book book) {

        return bookMapper.update(book);
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
