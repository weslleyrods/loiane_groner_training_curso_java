package com.loiane.cursojava.aula43.labs.exe03;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
			String alimento) {
		super(nome, comprimento, patas, cor, "Terra", velocidade);
		this.alimento = alimento;
	}


	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: "+alimento;
		return s;
	}
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
}
