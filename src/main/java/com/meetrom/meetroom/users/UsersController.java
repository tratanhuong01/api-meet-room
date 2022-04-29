package com.meetrom.meetroom.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")

public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("")
    public List<Users> getUsersAll() {
        return usersService.getUsersAll();
    }

    @PostMapping("")
    public Users addUser(@RequestBody Users users) {
        return usersService.addUser(users);
    }

    @PutMapping("")
    public Users updateUser(@RequestBody Users users) {
        return usersService.updateUser(users);
    }

    @DeleteMapping("")
    public void deleteUser(@RequestBody Users users) {
        usersService.deleteUser(users);
    }

}
