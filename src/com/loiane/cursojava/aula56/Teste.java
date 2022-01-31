package com.loiane.cursojava.aula56;

public class Teste {

	public static void main(String[] args) {

		/*
		for (TipoDocumento documentos : TipoDocumento.values()) {
			System.out.println(documentos+" - "+documentos.geraNumero());
		}*/
		
		Pessoa pf = new Pessoa();
		//pf.setTipoDocumento(TipoDocumento.CPF);			
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF")); //outra forma de retornar o tipo do documento
		
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumero());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(TipoDocumento.CNPJ);			
		//pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF")); //outra forma de retornar o tipo do documento
		
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumero());		
		System.out.println(pj);
		
		
	}

} 
