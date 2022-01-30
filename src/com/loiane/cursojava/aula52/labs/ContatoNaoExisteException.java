package com.loiane.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	
	
	@Override
	public String getMessage() {
		return "O contato "+ nomeContato +" existe na agenda.";
	}
}
