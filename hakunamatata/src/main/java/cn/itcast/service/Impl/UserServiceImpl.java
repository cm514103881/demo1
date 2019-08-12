package cn.itcast.service.Impl;

import cn.itcast.dao.Impl.UserDaoImpl;
import cn.itcast.dao.UsreDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

public class UserServiceImpl implements UserService {
    private UsreDao userDao = new UserDaoImpl();

    @Override
    public User findUser(User user) {
        User user1 = userDao.findUser(user);
        return user1;
    }
}
