package br.com.spring.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.exception.UnsuportedMathOperationException;
import br.com.spring.service.MathOperation;


@RestController
public class MathController {
	
	
	@RequestMapping(value = "/api/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double getEmployeesById(@PathVariable String numberOne, @PathVariable String numberTwo ) throws UnsuportedMathOperationException, Exception  {
	    	
		MathOperation mathOperation = new MathOperation(numberOne, numberTwo);
		return mathOperation.sum();
	}
}
