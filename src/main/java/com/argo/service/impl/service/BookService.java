package com.argo.service.impl.service;

import com.argo.domain.Book;

import java.util.List;

public interface BookService {
    /**
     *
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     *
     * @param book
     */
    public void update(Book book);

    /**
     *
     * @param id
     * @return
     */
    public boolean getById(Integer id);

    /**
     *
     * @return
     */
    public List<Book> getAll();
}
