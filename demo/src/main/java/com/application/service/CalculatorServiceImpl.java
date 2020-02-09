package com.application.service;

import org.springframework.stereotype.Service;

import com.application.dto.CalculatorDTO;

@Service 
public class CalculatorServiceImpl implements ICalculatorService{
		
	    @Override
		public int calculate(CalculatorDTO calculator) {
			int firstValue = calculator.getNumber1();
			int secondValue = calculator.getNumber2();
			int result = 1;
			for( int limit=1; limit<=secondValue; limit++ ) {
				result = result * firstValue;
			}
			return result;
		}
}
