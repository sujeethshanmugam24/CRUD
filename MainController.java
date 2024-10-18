package com.example.project1.demo;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/hell")
//    public String home(Model model) {
//        ModelAndView mvc =new ModelAndView(hello);
//        model.addAttribute("message", "Hello, JSP with Spring Boot!");
//        return "hello";
//    }
//
//
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping(path = "/add")
    public String addNewUser(@RequestParam String name, @RequestParam String email) {
        User springUser = new User();
        springUser.setName(name);
        springUser.setEmail(email);
        userRepository.save(springUser);
        return "User added successfully";
    }
    @RequestMapping("/add")
    public String add(){
        return "addUser.jsp";
    }

    @GetMapping(path = "/all")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
