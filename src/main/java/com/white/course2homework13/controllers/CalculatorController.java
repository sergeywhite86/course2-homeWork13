package com.white.course2homework13.controllers;

import com.white.course2homework13.services.CalculatorService;
import com.white.course2homework13.services.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorServiceImpl service) {
        this.service = service;
    }

    @GetMapping()
    public String welcome() {
        return service.welcome();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        int result = service.addition(num1, num2);
        return String.format("%d + %d = %d", num1, num2, result);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        int result = service.subtraction(num1, num2);
        return String.format("%d - %d = %d", num1, num2, result);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        int result = service.multiplication(num1, num2);
        return String.format("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    public String division(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        double result = service.division(num1, num2);
        return String.format("%d / %d = %f", num1, num2, result);
    }
}
