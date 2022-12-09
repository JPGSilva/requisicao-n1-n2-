package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifms.tads6.dsd_web_spring_service.model.Add;

@RestController
@RequestMapping(value = "/add")
public class AddController {
    
    @GetMapping("/{num1}/{num2}")
    public Integer add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
        return new Add(num1, num2).getResult();
    }


    @PostMapping
    public Integer addByPost(@RequestBody Add add) {
        return add.getResult();
        
    }
}
