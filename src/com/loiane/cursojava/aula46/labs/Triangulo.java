package com.loiane.cursojava.aula46.labs;

public class Triangulo extends Figura2D{
	
	private double altura;
	private double base;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public double calcularArea() {
		
		return (base*altura)/2;
	}
	
	
}
