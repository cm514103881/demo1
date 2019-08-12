package cn.itcast.service;

import cn.itcast.domain.Book;

public interface UpdateService {
    Book queryBook(Book book);

    Boolean updateBook(Book book);
}
