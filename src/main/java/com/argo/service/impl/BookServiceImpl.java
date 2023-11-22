package com.argo.service.impl;

import com.argo.domain.Book;
import com.argo.mapper.BookMapper;
import com.argo.service.impl.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
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
        return false;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public boolean getById(Integer id) {
        return false;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
