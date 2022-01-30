package com.loiane.cursojava.aula43.labs.exe01;


public class ContaEspecial extends ContaBancaria{
	
	private double limite;
	
	@Override
	public String toString() {
		String s = "";
		s += "\nLimite: " + limite;
		s += super.toString(); //chama o toString da classe pai para sobrescrever
		return s;
	}
	
	@Override
	public boolean sacar(double valor) {
		
		double saldoComLimite = this.getSaldo() + limite;
		if ((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true; 
		}
		else {
			return false;
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	} 

	
}
