package com.slalom.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private static final String template = "The total is: %s.";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/calculation")
    //test this via http://localhost:8080/calculation?number1=1&number2=2
    public Calculation calculation(@RequestParam(value = "number1", defaultValue = "0") String number1, @RequestParam(value="number2", defaultValue = "0") String number2) {
        return new Calculation(counter.incrementAndGet(), String.format(template, Integer.parseInt(number1) + Integer.parseInt(number2)));
    }
}