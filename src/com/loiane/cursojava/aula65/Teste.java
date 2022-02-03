package com.loiane.cursojava.aula65;

//Existem anotações que não há necessidade se der passada informações. 
	//Como a anotação que foi criada possui, houve a necessidade de ser passada informções.
	@InformacaoAula(
		autor = "Weslley",
		aulaNumero = 65,
		blog = "https://www.weslley.com"
	)
public class Teste {
	
		//Há possibilidade também de definir na annotation o local que ela deverá ser implementada (classe, método ou atributo)
		//como na annotation do exemplo não tem essa definição, pode ser implementada em qualquer lugar
	
	@InformacaoAula(
			autor = "Weslley",
			aulaNumero = 65,
			blog = "https://www.weslley.com"
		)
	public static void main (String[] args) {
			
	}

}
