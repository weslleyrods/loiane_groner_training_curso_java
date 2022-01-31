package com.loiane.cursojava.aula56.labs;

public enum Operacao {
	
	
	
	SOMA("+") {
		@Override
		public double executarOperacao(double x, double y) {		
			return x + y;
		}
	}, SUBTRACAO("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	}, MULTIPLICACAO("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	}, DIVISAO("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};
	
	private String simboloOp;
	
	Operacao(String simboloOp){
		this.simboloOp = simboloOp;
	}
	
	public String toString() {
		return this.simboloOp; 
	}
	
	
	public abstract double executarOperacao(double x, double y);

	public String getSimboloOp() {
		return simboloOp;
	}

	public void setSimboloOp(String simboloOp) {
		this.simboloOp = simboloOp;
	}

}
