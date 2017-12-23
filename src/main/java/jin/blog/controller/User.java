package jin.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class User {
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    ResponseEntity retrieveUsers(@RequestParam(name = "name",defaultValue = "") String name){
        return ResponseEntity.ok("get the user");
    }

}
