package edu.mum.client.controller;

import edu.mum.client.model.User;
import edu.mum.client.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rabin Shrestha on 8/12/2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    // UserService userService;

    @Autowired
    private UserService uService;

    @RequestMapping("/{id}")
    public String home(Model model, @PathVariable String id) {

        User user = uService.getUser(id);

        System.out.println("returned data :"+user);

        model.addAttribute("user", user);
        return "userProfile";
    }

}
