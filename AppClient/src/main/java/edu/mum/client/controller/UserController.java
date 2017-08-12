package edu.mum.client.controller;

import edu.mum.client.model.User;
import edu.mum.client.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rabin Shrestha on 8/12/2017.
 */
@Controller
public class UserController {
    // UserService userService;

    @Autowired
    private UserService uService;

    @RequestMapping("/test")
    public String home(Model model) {

        User p = uService.getUser("598e7ea5fb3cd11dac9d4189");

        model.addAttribute("user", p);
        return "usertest";
    }

}
