package kz.smart.library.controller;

import kz.smart.library.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserController {
    User registerUser(@RequestParam String name);

    List<User> listUsers();
}
