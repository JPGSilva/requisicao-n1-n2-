package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sum")
public class SumController{
    
    @GetMapping("/{num1}/{num2}")
    public ResponseEntity<Float> add(@PathVariable("num1") String num1,
     @PathVariable("num2") String num2) {
        
        Float newnum1 = (float) 0;
        Float newnum2 = (float) 0;

        try {
            newnum1 = Float.parseFloat(num1);
        } catch (NumberFormatException nfe) {
            throw new ArithmeticException("Invalido primeiro paramentro deve ser number");}
      
        try {
            newnum2 = Float.parseFloat(num2);
        } catch (NumberFormatException nfe) {throw new ArithmeticException("503 BAD_REQUEST");
        }
        return ResponseEntity.ok(newnum1 + newnum2);
    }
}
