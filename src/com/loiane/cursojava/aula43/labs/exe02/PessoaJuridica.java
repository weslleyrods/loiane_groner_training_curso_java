package com.loiane.cursojava.aula43.labs.exe02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica(String nome, String cnpj, double rendaBruta) {
		super(nome, rendaBruta);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCNPJ: "+ cnpj;
		s += "\nImposto: " + calcularImposto();
		return s;
	}

	@Override
	public double calcularImposto() {	
		return this.getRendaBruta()*0.1;
	}

}
