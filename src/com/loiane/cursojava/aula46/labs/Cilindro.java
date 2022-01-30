package com.loiane.cursojava.aula46.labs;

public class Cilindro extends Figura3D{
	
	private int altura;
	private double raio;
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		double areaBase = Math.PI*Math.pow(raio, 2);
		double areaLateral = 2*Math.PI*raio*altura;
		double areaTotal = (2*areaBase)+areaLateral;
		return areaTotal;
		//return 2*Math.PI*raio*(altura+raio); //outra forma de calcular a area total
		
	}
	@Override
	public double calcularVolume() {
		//V = \pi r^2 h
		return (Math.PI*Math.pow(raio, 2))*altura;
	}
	
	
}
