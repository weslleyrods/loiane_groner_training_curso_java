package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = new int[4][4];

		Random numRandom = new Random();

		for (int i = 0; i < m.length; i++) { // linha da matriz
			for (int j = 0; j < m[i].length; j++) { // coluna da matriz
				m[i][j] = numRandom.nextInt(10);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		int maior = 0;
		int linha = 0;
		int coluna = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > maior) {
					maior = m[i][j];
					linha = i;
					coluna = j;
				}
			}
		}

		System.out.println("\n\nMaior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + maior);

	}

}
