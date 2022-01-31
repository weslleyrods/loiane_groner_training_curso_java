package com.loiane.cursojava.aula56;

public class Pessoa {
	
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	@Override
	public String toString() {
		return "Tipo do documento: "+tipoDocumento + ": " + numeroDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
}

