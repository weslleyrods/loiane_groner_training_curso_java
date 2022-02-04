package com.loiane.cursojava.aula71;

public class Calculadora {

	private int soma;
	
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for(int i = 0; i<array.length; i++) {
			
			soma+= array[i];
			
			//currentThread � um m�todo que permite identificar a thread atual que est� acessando o recurso compartilhado
			// e como a Thread tem o respectivo nome passado como par�metro, o m�todo getName() fica dispon�vel para uso 
			//mesmo sem a cria��o do getter
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
