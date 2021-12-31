package com.bigblackbird.holaworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String index() {
        return "When you are good at something!!.. Don't do it for free";
    }
}
