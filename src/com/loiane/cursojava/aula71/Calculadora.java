package com.loiane.cursojava.aula71;

public class Calculadora {

	private int soma;
	
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for(int i = 0; i<array.length; i++) {
			
			soma+= array[i];
			
			//currentThread é um método que permite identificar a thread atual que está acessando o recurso compartilhado
			// e como a Thread tem o respectivo nome passado como parâmetro, o método getName() fica disponível para uso 
			//mesmo sem a criação do getter
			System.out.println("Executando a soma"+ Thread.currentThread().getName()+
					"somando o valor "+array[i]+" com o total de "+soma);
			
			try {
				Thread.sleep(200); //pequena pausa durante o compartilhamento do vetor entre as threds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return soma;
	}
}
