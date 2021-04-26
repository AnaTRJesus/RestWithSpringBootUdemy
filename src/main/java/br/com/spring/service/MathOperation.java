package br.com.spring.service;

import java.util.Arrays;
import java.util.List;

import br.com.spring.exception.UnsuportedMathOperationException;
import br.com.spring.math.Operations;
import br.com.spring.utils.Converter;
import br.com.spring.utils.TypeVerification;

public class MathOperation {
	
	private String numberOne;
	private String numberTwo;
	
	public MathOperation(String numberOne, String numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	public MathOperation(String numberOne) {
		this.numberOne = numberOne;
	}

	public String getNumberOne(){
		return numberOne;
	}
	
	public String getNumberTwo() {
		return numberTwo;
	}
	
	public Double sum() throws UnsuportedMathOperationException, Exception {
		
		List<String> numbers = Arrays.asList(numberOne,numberTwo);
		boolean any = numbers.stream().anyMatch(number ->  TypeVerification.isNumeric(number) == false);
		
		if(any) throw new UnsuportedMathOperationException("Digite valore numéricos");
		
		Operations operations = new Operations(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
		
		return operations.sum();
		
	}
}
