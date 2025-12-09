package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @GetMapping("/welcome")
    public String messageWelcome() {
        return "Bem vindo à CALCULATOR API REST.";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        Calculator calculator = new Calculator();
        Double resultado = calculator.sum(n1, n2);
        return String.valueOf(resultado);
    }

    @GetMapping("/subNumbers")
    public String subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        Calculator calculator = new Calculator();
        Double resultado = calculator.sub(n1, n2);
        return String.valueOf(resultado);
    }

    @GetMapping("/divideNumbers")
    public String divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        Calculator calculator = new Calculator();
        Double resultado = calculator.divide(n1, n2);
        return String.valueOf(resultado);
    }

    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "factorial") Integer factorial) {
        Calculator calculator = new Calculator();
        Integer resultado = calculator.factorial(factorial);
        return String.valueOf(resultado);
    }

    @GetMapping("/calculeDayBetweenDate")
    public String calculeDayBetweenDate(
            @RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
            @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
        Calculator calculator = new Calculator();
        Object resultado = calculator.calculeDayBetweenDate(localDate1, localDate2);
        return String.valueOf(resultado);
    }

    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
        Calculator calculator = new Calculator();
        Integer resultado = calculator.integerToBinary(n1);
        return String.valueOf(resultado);
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
        Calculator calculator = new Calculator();
        Object resultado = calculator.integerToHexadecimal(n1);
        return String.valueOf(resultado);
    }
}
