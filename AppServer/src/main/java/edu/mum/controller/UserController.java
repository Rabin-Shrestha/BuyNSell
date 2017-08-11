package edu.mum.controller;

import edu.mum.domain.User;
import edu.mum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by Rabin Shrestha on 8/10/2017.
 */
@RestController
@RequestMapping("/user")
public class UserController implements IController<User>{
    @Autowired
    private UserService userService;


    @Override
    @PostMapping("/")
    public User add(@RequestBody User user) {
        System.out.println("user:"+user);
        return userService.add(user);
    }

    @Override
    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathParam("id") String id) {
        user.setId(id);
        return userService.update(user,id);
    }

    @Override
    @DeleteMapping("/{id}")
    public User delete(@RequestBody User user,@PathParam("id") String id) {
        user.setId(id);
        return userService.delete(user);
    }

    @Override
    @GetMapping("/")
    public List<User> getAll() {
        return userService.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public User get(@PathParam("id") String id) {
        return userService.get(id);
    }


}
