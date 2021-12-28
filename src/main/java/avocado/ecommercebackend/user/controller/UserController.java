package avocado.ecommercebackend.user.controller;


import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api") //원래 "/user"였음
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/add")
    public User add(@RequestBody User user){return userService.addUser(user);}

    @GetMapping("/user/getAll")
    public List<User> getAllUser(){return userService.getAllUser();}

    @GetMapping("/user/getUser/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUser(id);
    }
}