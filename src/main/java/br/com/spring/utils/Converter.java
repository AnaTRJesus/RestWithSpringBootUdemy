package br.com.spring.utils;

public class Converter {
	
	
	public static Double convertToDouble(String number) {	
		String numberReplaced = number.replaceAll(",", ".");
		return Double.parseDouble(numberReplaced);
	}
}
