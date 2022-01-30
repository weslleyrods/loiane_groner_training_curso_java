package com.loiane.cursojava.aula46.labs;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.setNome("Quadrado");
		quadrado.setCor("Azul");
		quadrado.setLado(2);
		
		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setCor("vermelho");
		circulo.setRaio(2);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triangulo");
		triangulo.setCor("Verde");
		triangulo.setAltura(2);
		triangulo.setBase(3);
		
		Cubo cubo = new Cubo();
		cubo.setNome("Cubo");
		cubo.setCor("Roxo");
		cubo.setAresta(3);
		
		Cilindro cilindro = new Cilindro();
		cilindro.setNome("Cilindro");
		cilindro.setCor("Cinza");
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		
		Piramide piramide = new Piramide();
		piramide.setNome("Piramide");
		piramide.setCor("Amarela");
		piramide.setAltura(4);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
			
		//Upcasting
		FiguraGeometrica [] figuras = new FiguraGeometrica[6];
		figuras[0] = quadrado;
		figuras[1] = circulo;
		figuras[2] = triangulo;
		figuras[3] = cubo;
		figuras[4] = cilindro;
		figuras[5] = piramide;
		
		for(FiguraGeometrica figura : figuras){
			System.out.println("--------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2D) {
				Figura2D figura2d = (Figura2D) figura; //Downcasting para ter acesso aos métodos calcularArea e calcular Volume
				System.out.println(figura2d.calcularArea());
			}
			
			if(figura instanceof Figura3D) {
				Figura3D figura3d = (Figura3D) figura; //Downcasting para ter acesso aos métodos calcularArea e calcular Volume
				System.out.println(figura3d.calcularArea());
				System.out.println(figura3d.calcularVolume());
			}
			
		}

	}

}
