package com.ITAcademy.restproject;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    private static final String template = "Hello, ";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greetings")
    public Greetings greetings(@RequestParam(value = "Ivan", defaultValue = "World") final String name) {

        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }
}


