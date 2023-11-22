package com.argo.mapper;

import com.argo.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {

    @Insert("insert into tbl_book (type,name,description) values (null, #{type}, #{name}, #{description})")
    public boolean save(Book book);
    @Delete("delete from tbl_book where id=#{id}")
    public boolean delete(Integer id);
    @Update("update tbl_book set type=#{type}, name=#{name}, decription=#{description} where id=#{id}")
    public boolean update(Book book);
    @Select("select * from tbl_book where id=#{id}")
    public Book getById(Integer id);
    @Select("select * from tbl_book")
    public List<Book> getAll();
}
