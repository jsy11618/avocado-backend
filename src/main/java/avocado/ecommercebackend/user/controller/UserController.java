package avocado.ecommercebackend.user.controller;


import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.service.UserService;
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