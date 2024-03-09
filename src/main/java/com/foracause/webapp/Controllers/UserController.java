package com.foracause.webapp.Controllers;

import com.foracause.webapp.Models.User;
import com.foracause.webapp.respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserRepo repo;
    @GetMapping(value = "/")
    public String abcd() {
        return "Hello";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {

        return repo.findAll();
    }


}
