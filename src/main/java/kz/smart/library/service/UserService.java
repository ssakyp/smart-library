package kz.smart.library.service;

import kz.smart.library.model.User;
import kz.smart.library.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public User registerUser(String name) {
        return userRepository.save(new User(null, name));
    }

    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
