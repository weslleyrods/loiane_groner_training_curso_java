package com.loiane.cursojava.aula56;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geraNumero() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumero() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumero();
}
