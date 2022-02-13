package com.loiane.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {

		System.out.println(Math.pow(2, 3));
		//arreponda p/ cima, acima de 2.4 e arredonda p/ baixo, abaixo de 2.5
		System.out.println(Math.round(2.4));
		System.out.println(Math.round(2.5));
		//arredonda sempre para cima
		System.out.println(Math.ceil(2.4));
		System.out.println(Math.ceil(2.7));
		
		//arredonda sempre para baixo
		System.out.println(Math.floor(2.4));
		System.out.println(Math.floor(2.7));
		
		//gera número aleatório maior ou igual a 0.0 a menor que 1.0
		System.out.println(Math.round(Math.random()*3));
		
		//Calculo do seno/cosseno/tangente, por padrão o parâmetro está radianos 
		//usamos o toRadians para inserir angulo em grau
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.cos(Math.toRadians(1)));
		System.out.println(Math.tan(Math.toRadians(45)));
	}

}
