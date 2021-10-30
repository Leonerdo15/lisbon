package com.ultimate.lisbon.controllers;

import com.ultimate.lisbon.models.User;
import com.ultimate.lisbon.models.exceptions.NotFoundException;
import com.ultimate.lisbon.models.exceptions.Response;
import com.ultimate.lisbon.models.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<User> getUsers(){
        logger.info("Sending all users");
        return UserRepository.getAllUsers();
    }

    @GetMapping(path = "{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User getStudent(@PathVariable("id") int id)
            throws NotFoundException {
        logger.info("Sending user with number " + id);
        User user = UserRepository.getUser(id);
        if (user != null) return user;
        else throw new NotFoundException("" + id, "User", "number");
    }

    @DeleteMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteStudent(@PathVariable("id") int id) {
        logger.info("Deleting user with number " + id);
        if (UserRepository.deleteUser(id)) {
            return new Response(id + " was deleted", null);
        } else {
            return new Response(id + " not found!", null);
        }
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public User addStudent(@RequestBody User user) {
        UserRepository.addUser(user);
        return user;
    }


}
