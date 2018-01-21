package jin.blog.controller;

import jin.blog.common.ListRes;
import jin.blog.domain.User;
import jin.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jin.blog.common.ListRes.wrapList;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    ResponseEntity<ListRes> retrieveUsers(@RequestParam(name = "name",defaultValue = "") String name){
        Map params = new HashMap();
        params.put("name",name);
        List<User> users = userService.getUsers(params);
        Integer count = userService.count(params);
        logger.info("success");
        logger.error("error");
        System.out.println(users);
        return ResponseEntity.ok(wrapList(users,count));
    }

}
