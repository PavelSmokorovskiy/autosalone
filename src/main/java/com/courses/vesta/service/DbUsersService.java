package com.courses.vesta.service;

import com.courses.vesta.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DbUsersService {

    private String name;

    private static List<User> items = new ArrayList<>();
    static {

        items.add(new User(1, "Andrey"));
        items.add(new User(2, "Oleg"));
        items.add(new User(3, "Vasya"));
    }


    public List<User> findAll() {

        return items;
    }

    public void setName(String name) {
        this.name = name;
    }
}