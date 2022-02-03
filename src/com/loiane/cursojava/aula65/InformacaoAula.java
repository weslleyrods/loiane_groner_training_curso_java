package com.loiane.cursojava.aula65;

public @interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	//default define valor padr�o na annotation
	String blog() default "https://weslley.com";
	
	String site() default "https://weslley.dev.com";
	
}
