package com.loiane.cursojava.aula43.labs.exe02;

public abstract class Contribuinte {

		private String nome;
		private double rendaBruta;
		

		
		public abstract double calcularImposto();
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getRendaBruta() {
			return rendaBruta;
		}
		public void setRendaBruta(double rendaBruta) {
			this.rendaBruta = rendaBruta;
		}

		@Override
		public String toString() {
			String s = "\nNome: "+nome;
			s += "\nRenda bruta: "+rendaBruta;
			
			return s;
		}
		
		Contribuinte(String nome, double rendaBruta) {
			this.nome = nome;
			this.rendaBruta = rendaBruta;
		}



		
		

}
