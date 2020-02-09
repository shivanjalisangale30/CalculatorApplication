package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.CalculatorDTO;
import com.application.service.CalculatorServiceImpl;

@RequestMapping("/calculatorservice")
@RestController
public class CalculatorController {

	@Autowired
	CalculatorServiceImpl calculatorService;
	
	@PostMapping("/operation")
	public int operation(@RequestBody CalculatorDTO calculator) {
		System.out.println("CalculatorController.operation()");
		int value = calculatorService.calculate(calculator);
		return value;
	}
}