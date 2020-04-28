package com.greenfox.error.service;

import com.greenfox.error.models.User;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 * Created by aze on 25/10/17.
 */
@Service
public class UserService {

    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    public UserService service() {
        return new UserService();
    }
}
