package com.example.project1.demo;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Home {
    @GetMapping("/home")
    public String home(Model model) {
        //model.addAttribute("message", "Hello, JSP with Spring Boot!");
        return "hello.jsp";
    }
}
