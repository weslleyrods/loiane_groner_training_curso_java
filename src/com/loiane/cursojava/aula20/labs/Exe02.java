package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exe02 {

	public static void main(String[] args) {

		int m[][] = new int[10][10];
		Random numRandom = new Random();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = numRandom.nextInt(11);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		int maiorLinhaCinco = 0;
		int menorLinhaCinco = 11;
		int maiorColSete = 0;
		int menorColSete = 11;

		for (int i = 0; i < m[5].length; i++) {
			if (m[5][i] > maiorLinhaCinco) {
				maiorLinhaCinco = m[5][i];
			}
			if (m[5][i] < menorLinhaCinco) {
				menorLinhaCinco = m[5][i];
			}
		}

		System.out.println("\nO maior valor da L5 = " + maiorLinhaCinco);
		System.out.println("\nO menor valor da L5 = " + menorLinhaCinco);

		for (int j = 0; j < m.length; j++) {
			if (m[j][7] > maiorColSete) {
				maiorColSete = m[j][7];
			}
			if (m[j][7] <= menorColSete) {
				menorColSete = m[j][7];
			}
		}

		System.out.println("\nO maior valor da C7 = " + maiorColSete);
		System.out.println("\nO menor valor da C7 = " + menorColSete);
	}
}
