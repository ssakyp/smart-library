package kz.smart.library.repository;

import kz.smart.library.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();
    private long idCounter = 1;

    public User save(User user) {
        user.setId(idCounter++);
        users.put(user.getId(), user);
        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
