package br.com.spring.math;

public class Operations {
	
	private Double numberOne;
	private Double numberTwo;
	
	public Operations(Double numberOne, Double numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	
	public Operations(Double numberOne) {
		this.numberOne = numberOne;
	}

	public Double getNumberOne() {
		return numberOne;
	}
	
	public Double getNumberTwo() {
		return numberTwo;
	}
	
	public Double sum() {
		return numberOne + numberTwo;
	}
}
