package cn.itcast.dao.Impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.utils.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements BookDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDs());

    /**
     * 查询所有书籍数据
     * @return
     */
    @Override
    public List<Book> findAll() {
        String sql = "select * from book ";
        List<Book> book = template.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return book;
    }
}
