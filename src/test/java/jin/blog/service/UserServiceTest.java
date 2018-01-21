package jin.blog.service;

import jin.blog.base.BaseTest;
import jin.blog.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: xuyongjin
 * Date: 2018/1/7
 * Time: 9:57
 */
public class UserServiceTest extends BaseTest{
    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        Map params = new HashMap();
        List<User> users = userService.getUsers(params);
//        System.out.println(users);
        System.out.println("test");
    }
}
