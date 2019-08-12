package cn.itcast.dao.Impl;

import cn.itcast.dao.UpdateDao;
import cn.itcast.domain.Book;
import cn.itcast.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;

public class UpdateDaoImpl implements UpdateDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDs());

    /**
     * 回显
     * @param book
     * @return
     */
    @Override
    public Book queryBook(Book book) {
        Book book1 = null;
        try {
            String sql = "select * from book where id = ?";
            book1 = template.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getId());
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return book1;
    }

    /**
     * 查询是否一样
     * @param name
     * @return
     */
    @Override
    public Book updateBook(String name) {
        Book book1 = null;
        try {
            String sql = "select * from book where name = ?";
            book1 = template.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), name);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return book1;
    }

    /**
     * 修改
     * @param book
     * @return
     */
    @Override
    public Boolean updateBooks(Book book) {
        Boolean flag = false;
        String sql = "update book set name =?,author = ?,price = ?,publish_time = ? where id = ?";
        int update = template.update(sql, book.getName(), book.getAuthor(), book.getPrice(), new Date(), book.getId());
        if (update > 0){
            flag = true;
        }
        return flag;
    }


}
