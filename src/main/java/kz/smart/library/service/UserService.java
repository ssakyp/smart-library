package kz.smart.library.service;

import kz.smart.library.model.User;

import java.util.List;

public interface UserService {
    User registerUser(String name);

    List<User> listUsers();
}
