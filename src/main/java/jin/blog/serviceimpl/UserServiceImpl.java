package jin.blog.serviceimpl;

import jin.blog.aop.annotation.DataSource;
import jin.blog.dao.UserDao;
import jin.blog.domain.User;
import jin.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: xuyongjin
 * Date: 2018/1/5
 * Time: 8:25
 */

@Service
public class UserServiceImpl implements UserService {

    //todo:需要配置mybatis才能使userDao生效，然后再验证datasource的使用
    @Autowired
    UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
