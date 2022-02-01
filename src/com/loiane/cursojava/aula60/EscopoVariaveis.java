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
		
		//i++; //erro de compilação, porque i não é uma variável global dentro da classe outroTeste

		int j;
		for (j=0; j<10; j++){
			System.out.println(j);
		}

		System.out.println(j); //j tem valor 10, porque é uma variável global dentro da classe outroTeste
	}

	public void maiUmTeste(){

		boolean flag = true;
		
		if (flag){

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}

		//System.out.println(umaVariavel); //erro de compilação, porque a variavel local está sendo chamada fora do escopo de if
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
			//outroNum++; //erro de compilação, porque outroNum é uma variável local do escopo do try
			//e.printStackTrace(); //erro de compilação, porque "e" é uma variável local do escopo do catch
		}

		num++;

		//outroNum++; //erro de compilação, porque outroNum é uma variável local do escopo do try
		//e.printStackTrace(); //erro de compilação, porque "e" é uma variável local do escopo do catch
	}
}
