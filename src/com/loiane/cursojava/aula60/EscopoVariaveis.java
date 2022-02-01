package com.loiane.cursojava.aula60;

public class EscopoVariaveis {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int calculaValor(int valor){

		valor = valor + 10;
		
		//this.valor = valor;

		return valor;
	}

	public int teste(){

		int valor = 5;

		if (true){

			valor--;
		}

		//this.valor = valor; //referencial valor global/atributo da classe

		return valor;
	}

	public void outroTeste(){

		for (int i=0; i<10; i++){
			System.out.println(i);
		}
		
		//i++; //erro de compila��o, porque i n�o � uma vari�vel global dentro da classe outroTeste

		int j;
		for (j=0; j<10; j++){
			System.out.println(j);
		}

		System.out.println(j); //j tem valor 10, porque � uma vari�vel global dentro da classe outroTeste
	}

	public void maiUmTeste(){

		boolean flag = true;
		
		if (flag){

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		//System.out.println(umaVariavel); //erro de compila��o, porque a variavel local est� sendo chamada fora do escopo de if
	}

	public void maiUmOutroTeste(int num){

		int total = 0;

		try {
			int outroNum = 0;

			total = num/outroNum;

		} catch (Exception e){
			e.printStackTrace();
		} finally {

			total++;
			//outroNum++; //erro de compila��o, porque outroNum � uma vari�vel local do escopo do try
			//e.printStackTrace(); //erro de compila��o, porque "e" � uma vari�vel local do escopo do catch
		}

		num++;

		//outroNum++; //erro de compila��o, porque outroNum � uma vari�vel local do escopo do try
		//e.printStackTrace(); //erro de compila��o, porque "e" � uma vari�vel local do escopo do catch
	}
}
