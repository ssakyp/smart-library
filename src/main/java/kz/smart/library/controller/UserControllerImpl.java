package kz.smart.library.controller;

import kz.smart.library.model.User;
import kz.smart.library.service.UserService;
import kz.smart.library.service.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {
    private final UserService userService = new UserServiceImpl();

    @PostMapping("/register")
    @Override
    public User registerUser(@RequestParam String name) {
        return userService.registerUser(name);
    }

    @GetMapping
    @Override
    public List<User> listUsers() {
        return userService.listUsers();
    }

}
