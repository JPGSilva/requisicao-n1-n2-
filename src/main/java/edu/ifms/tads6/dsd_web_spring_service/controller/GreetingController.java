package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.ifms.tads6.dsd_web_spring_service.model.Greeting;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    
    @GetMapping
    public Greeting sayHello() {
        return new Greeting("Hello, World!");
    }

    
    @GetMapping("/{name}")
    public Greeting pathParam(@PathVariable("name") String name) {
        return new Greeting("Hello, " + name);
    }


    @GetMapping("/")
    public Greeting queryParam(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello, " + name);
    }


    @PostMapping
    public Greeting postMethod(@RequestBody Greeting greeting) {
        return greeting;
    }
}
