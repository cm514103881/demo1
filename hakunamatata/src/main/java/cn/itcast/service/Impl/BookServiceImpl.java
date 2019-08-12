package cn.itcast.service.Impl;

import cn.itcast.dao.BookDao;
import cn.itcast.dao.Impl.BookDaoImpl;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();
    /**
     * 查询所有书籍数据
     * @return
     */
    @Override
    public List<Book> findAll() {
        List<Book> list = bookDao.findAll();
        return list;
    }
}
