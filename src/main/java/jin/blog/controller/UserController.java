package jin.blog.controller;

import jin.blog.domain.User;
import jin.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    ResponseEntity retrieveUsers(@RequestParam(name = "name",defaultValue = "") String name){
        List<User> users = userService.getUsers();
        System.out.println(users);
        return ResponseEntity.ok("get the user");
    }

}
