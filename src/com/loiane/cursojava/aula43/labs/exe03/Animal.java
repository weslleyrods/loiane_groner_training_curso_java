package com.loiane.cursojava.aula43.labs.exe03;

public class Animal { //não foi utilizado abstract, porque foi necessário instanciar a classe Animal
	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		//this.patas = 4;
		setPatas(4);
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}



	@Override
	public String toString() {
		String s = "\nAnimal: "+ nome;
		s += "\nComprimento: "+ comprimento+"cm";
		s += "\nPatas: "+ patas;
		s += "\nCor: "+ cor;
		s += "\nAmbiente: "+ ambiente;
		s += "\nVelocidade: "+ velocidade+"m/s";
		return s;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
