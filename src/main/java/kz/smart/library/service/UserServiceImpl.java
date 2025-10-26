package kz.smart.library.service;

import kz.smart.library.model.User;
import kz.smart.library.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepository();

    @Override
    public User registerUser(String name) {
        return userRepository.save(new User(null, name));
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
