package com.aol.alkuznetsov.fluffy.best.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${vars.api-version}")
public class HelloWorldRestController {
    @GetMapping
    public String hello() {
        return "Hello, My Fluffy Friend!";
    }
}
