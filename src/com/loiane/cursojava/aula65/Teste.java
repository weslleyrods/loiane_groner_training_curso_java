package com.loiane.cursojava.aula65;

//Existem anota��es que n�o h� necessidade se der passada informa��es. 
	//Como a anota��o que foi criada possui, houve a necessidade de ser passada inform��es.
	@InformacaoAula(
		autor = "Weslley",
		aulaNumero = 65,
		blog = "https://www.weslley.com"
	)
public class Teste {
	
		//H� possibilidade tamb�m de definir na annotation o local que ela dever� ser implementada (classe, m�todo ou atributo)
		//como na annotation do exemplo n�o tem essa defini��o, pode ser implementada em qualquer lugar
	
	@InformacaoAula(
			autor = "Weslley",
			aulaNumero = 65,
			blog = "https://www.weslley.com"
		)
	public static void main (String[] args) {
			
	}

}
