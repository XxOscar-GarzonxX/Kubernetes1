package co.edu.uptc.distri1.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.distri1.model.Calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/calculate")
public class CalculatorController {
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
    
    @Autowired
    private Calculator calculator;
    
    @GetMapping("/div/{num1}/{num2}")
    public int div(@PathVariable("num1") int num1,@PathVariable("num2") int num2 ) {
        return num1/num2; 
    }

    @GetMapping()
    public double div2() {
        return calculator.division(0, 0);
    }
}
