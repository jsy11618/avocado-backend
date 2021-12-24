package busanprojectday2.avocadoday2.users.controller;

import busanprojectday2.avocadoday2.users.model.User;
import busanprojectday2.avocadoday2.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User add(@RequestBody User user){return userService.addUser(user);}

    @GetMapping("/getAll")
    public List<User> getAllUser(){return userService.getAllUser();}


}
