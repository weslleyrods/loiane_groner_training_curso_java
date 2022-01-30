package com.loiane.cursojava.aula43.labs.exe03;

public class Peixe extends Animal{
	
	private String caracteristicas;
	
//	public Peixe() {
//		this.setPatas(0);
//		this.setAmbiente("Mar");
//		this.setCor("Cinza");
//		this.caracteristicas = "Barbatanas e cauda";
//	}
	
	public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
			String caracteristicas) {
		super(nome, comprimento, 0, "Cinza", "Mar", velocidade);
		this.caracteristicas = "Barbatanas e cauda";
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: "+caracteristicas;
		return s;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
 
	
}
