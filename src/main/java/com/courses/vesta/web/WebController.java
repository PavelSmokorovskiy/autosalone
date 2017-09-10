package com.courses.vesta.web;

import com.courses.vesta.model.User;
import com.courses.vesta.service.DbUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class WebController {

    @Autowired
    private DbUsersService dbUsersService;

    @RequestMapping
    public List<User> getList(){

        return dbUsersService.findAll();
    }
}