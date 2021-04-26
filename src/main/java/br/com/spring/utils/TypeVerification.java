package br.com.spring.utils;

import java.util.Optional;

public class TypeVerification {
	
	
	public static boolean isNumeric(String number)  {
		try {
			Optional.ofNullable(number).orElseThrow(() -> new Exception("O valores não podem ser nulos"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String numberReplaced = number.replaceAll(",", ".");
		return numberReplaced.matches("[0-9]");
	}
}
