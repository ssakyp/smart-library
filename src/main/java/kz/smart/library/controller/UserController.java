package kz.smart.library.controller;

import kz.smart.library.model.User;
import kz.smart.library.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService = new UserService();

    @PostMapping("/register")
    public User registerUser(@RequestParam String name) {
        return userService.registerUser(name);
    }

    @GetMapping
    public List<User> listUsers() {
        return userService.listUsers();
    }

}
