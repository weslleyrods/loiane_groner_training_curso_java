package com.loiane.cursojava.aula59;

//Static utilizado para permitir apenas a chamada de pow e sqrt.
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.*; //* importa todos os métodos de Math

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2.0;
		double b = 2.0;
		double c = 4.0;
	
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		
		//Com Static Import
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));
	}

}
