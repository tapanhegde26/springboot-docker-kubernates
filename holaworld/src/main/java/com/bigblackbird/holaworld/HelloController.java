package com.bigblackbird.holaworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String index() {
        return "tan tana tan tan tan tara...chalti he kya nou do gyara!";
    }
}
