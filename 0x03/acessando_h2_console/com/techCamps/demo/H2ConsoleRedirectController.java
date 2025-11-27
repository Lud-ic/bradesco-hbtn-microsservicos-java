package com.techCamps.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class H2ConsoleRedirectController {

    @GetMapping()
    public String redirectToH2Console() {
        return "Olá mundo";
    }
}

