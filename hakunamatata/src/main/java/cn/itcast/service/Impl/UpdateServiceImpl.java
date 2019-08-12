package cn.itcast.service.Impl;

import cn.itcast.dao.Impl.UpdateDaoImpl;
import cn.itcast.dao.UpdateDao;
import cn.itcast.domain.Book;
import cn.itcast.service.UpdateService;

public class UpdateServiceImpl implements UpdateService {
    private UpdateDao updateDao = new UpdateDaoImpl();

    @Override
    public Book queryBook(Book book) {
        Book book1 = updateDao.queryBook(book);
        return book1;
    }

    @Override
    public Boolean updateBook(Book book) {
        String name = book.getName();
        Book book1 =updateDao.updateBook(name);
        Boolean flag = false;
        if(book1 != null) {
            return flag;
        }
        flag = updateDao.updateBooks(book);

        return flag;
    }
}
