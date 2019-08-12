package cn.itcast.dao;

import cn.itcast.domain.Book;

public interface UpdateDao {
    Book queryBook(Book book);

    Book updateBook(String name);

    Boolean updateBooks(Book book);
}
