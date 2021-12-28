package com.bigblackbird.holaworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String index() {
        return "Why do we fall bruce!!?.. Just to rise up again!!";
    }
}
