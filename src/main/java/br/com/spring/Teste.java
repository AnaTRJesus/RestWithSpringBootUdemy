package br.com.spring;

public class Teste {
	
	public static void main(String args []) {
		
		System.out.println("Teste");
		
		try {
		System.out.println(10/0);
		}catch(ArithmeticException x) {
			x.getMessage();
			System.out.println(x.getMessage());
		}
		
		System.out.println("Testando");
	}

}
