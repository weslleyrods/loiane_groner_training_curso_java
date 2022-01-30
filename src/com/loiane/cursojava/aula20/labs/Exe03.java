package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] m = new int[3][3];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite os valores da posição: [" + i + "]" + "[" + j + "]");
				m[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();

		int numPar = 0;
		int numImpar = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] % 2 == 0) {
					numPar++;
				} else
					numImpar++;
			}
		}
		System.out.println(String.format("Quantidade de numeros pares %d", numPar));
		System.out.println(String.format("Quantidade de numeros impares %d", numImpar));
	}
}
