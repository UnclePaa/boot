package by.tms.boot.service;

import by.tms.boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private User user;

    public User createUser(String name, int age) {
        user.setName(name);
        user.setAge(age);
        return user;
    }
}