package com.weilearning.dockerpublish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello World Pre Boomi Practice here!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test Pre Boomi Practice!";
    }

    @GetMapping("/here")
    public String here() {
        return "Here Pre Boomi Practice!";
    }
}
