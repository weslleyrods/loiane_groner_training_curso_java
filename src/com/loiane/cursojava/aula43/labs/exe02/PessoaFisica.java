package com.loiane.cursojava.aula43.labs.exe02;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;
	 
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	PessoaFisica(String nome, String cpf, double rendaBruta) {
		super(nome, rendaBruta);
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if(renda >= 0 && renda <= 1400) {
			return 0;
		}
		else if(renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}
		else if(renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		else if(renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		
			return (renda * 0.3) - 700;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCPF: "+ cpf;
		s += "\nImposto: " + calcularImposto();
		return s;
	}
	
}
