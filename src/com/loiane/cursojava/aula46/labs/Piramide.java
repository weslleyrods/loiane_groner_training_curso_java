package com.loiane.cursojava.aula46.labs;

public class Piramide extends Figura3D{
	
	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase;
	//o tipo de dado Figura2D foi utilizado porque a base pode ser triagular, quadrilatera ou circular
	private Figura2D base;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public int getNumPoliBase() {
		return numPoliBase;
	}
	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	public Figura2D getBase() {
		return base;
	}
	public void setBase(Figura2D base) {
		this.base = base;
	}
	@Override
	public double calcularArea() {
		if(base != null) {
		double areaLateral = numPoliBase * ((arestaBase*apotema)/2);
		double areaTotal = base.calcularArea()+areaLateral;
		return areaTotal;
		}
		return 0;
	}
	@Override
	public double calcularVolume() {
		if (base != null) {
		return (base.calcularArea()*altura)/3;
		}
		return 0; 
	}
	
	
	
}
