package jin.blog.dao;

import jin.blog.aop.annotation.DataSource;
import jin.blog.domain.User;

import java.util.List;

/**
 * Author: xuyongjin
 * Date: 2018/1/5
 * Time: 8:27
 */
public interface UserDao extends BaseDao<User>{
    @DataSource(source = DataSource.READ)
    List<User> getUsers();
}
