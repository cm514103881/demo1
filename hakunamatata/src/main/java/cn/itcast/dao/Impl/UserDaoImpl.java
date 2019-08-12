package cn.itcast.dao.Impl;

import cn.itcast.dao.UsreDao;
import cn.itcast.domain.User;
import cn.itcast.utils.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UsreDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDs());

    @Override
    public User findUser(User user) {
        String sql = "select * from user where username = ? and password = ? ";
        System.out.println(user);

        User user1 = null;
        try {
            user1 = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), user.getUsername(), user.getPassword());
        } catch (DataAccessException e) {

        }



        return user1;
    }
}
