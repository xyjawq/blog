package jin.blog.serviceimpl;

import jin.blog.aop.annotation.DataSource;
import jin.blog.dao.UserDao;
import jin.blog.domain.User;
import jin.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author: xuyongjin
 * Date: 2018/1/5
 * Time: 8:25
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUsers(Map params) {
        return userDao.list(params);
    }

    @Override
    public Integer count(Map params) {
        return userDao.count(params);
    }
}
