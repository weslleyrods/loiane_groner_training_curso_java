package com.loiane.cursojava.aula36.labs;

public class Aluno {
	
	private String nomeAluno;
	private String matricula;
	private double []notas;
	private double media;
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String obterInfo() {
		String info = "\nNome do aluno " + nomeAluno +"; ";
		info += "Matricula "+matricula+"; ";
		info += "Notas: ";
		
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
		}
		double media = soma/4;
		info += "\nMedia = "+media+ " - ";
		if(media >=7)
			return info += "Aprovado";
		else
			info += "Reprovado";			 
		return info;
 		 
	}
	
	public double obterMedia() {
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma/4;
	}
}
