package jin.blog.service;

import jin.blog.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Author: xuyongjin
 * Date: 2018/1/5
 * Time: 8:24
 */
public interface UserService {
    List<User> getUsers(Map params);

    Integer count(Map params);
}
