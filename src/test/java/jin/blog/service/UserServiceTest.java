package jin.blog.service;

import jin.blog.base.BaseTest;
import jin.blog.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        List<User> users = userService.getUsers();
//        System.out.println(users);
        System.out.println("test");
    }
}
