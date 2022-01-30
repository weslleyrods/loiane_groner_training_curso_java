package com.loiane.cursojava.aula43.labs.exe01;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;


public boolean sacar(double valor) {

	if ((saldo - valor) >= 0) {
		saldo -= valor;
		return true;
	}
	else {
		return false;
	}
} 

	public void depositar(double valor){
		saldo += valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	@Override
	public String toString() {
		
		String s = "\nNome do Cliente: "+ nomeCliente;
		s += "\nNº da Conta: " + numConta;
		s += "\nSaldo da conta: " + saldo;		
		return s;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
