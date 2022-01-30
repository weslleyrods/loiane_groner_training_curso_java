package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char[][] hashGame = new char[3][3];
		System.out.println("Jogador 1 - X\nJogador 2 - O");

		boolean ganhou = false;
		int jogada = 1;
		int linha = 0, coluna = 0;
		char sinal;

		while (!ganhou) {
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogador 1 - X");
				sinal = 'x';
			} else {
				System.out.println("Vez do jogador 2 - O");
				sinal = 'o';
			}

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha 1, 2 ou 3");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3)
					linhaValida = true;
				else
					System.out.println("Linha inválida, tente novamente");

			}
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna 1, 2 ou 3");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3)
					colunaValida = true;
				else
					System.out.println("Coluna inválida, tente novamente");
			}

			linha--;
			coluna--;
			if (hashGame[linha][coluna] == 'x' || hashGame[linha][coluna] == 'o')
				System.out.println("Posição já usada, tente novamente");
			else { // jogada válida
				hashGame[linha][coluna] = sinal;
				jogada++;
			}

			for (int i = 0; i < hashGame.length; i++) {
				for (int j = 0; j < hashGame[i].length; j++) {
					System.out.print(hashGame[i][j] + " | ");
				}
				System.out.println();
			}

			if ((hashGame[0][0] == 'x' && hashGame[0][1] == 'x' && hashGame[0][2] == 'x') || // linha 1
					(hashGame[1][0] == 'x' && hashGame[1][1] == 'x' && hashGame[1][2] == 'x') || // linha 2
					(hashGame[2][0] == 'x' && hashGame[2][1] == 'x' && hashGame[2][2] == 'x') || // linha 3
					(hashGame[0][0] == 'x' && hashGame[1][0] == 'x' && hashGame[2][0] == 'x') || // coluna 1
					(hashGame[0][1] == 'x' && hashGame[1][1] == 'x' && hashGame[2][1] == 'x') || // coluna 2
					(hashGame[0][2] == 'x' && hashGame[1][2] == 'x' && hashGame[2][2] == 'x') || // coluna 3
					(hashGame[0][0] == 'x' && hashGame[1][1] == 'x' && hashGame[2][2] == 'x')) { // diagonal
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou");
			} else if ((hashGame[0][0] == 'o' && hashGame[0][1] == 'o' && hashGame[0][2] == 'o') || // linha 1
					(hashGame[1][0] == 'o' && hashGame[1][1] == 'o' && hashGame[1][2] == 'o') || // linha 2
					(hashGame[2][0] == 'o' && hashGame[2][1] == 'o' && hashGame[2][2] == 'o') || // linha 3
					(hashGame[0][0] == 'o' && hashGame[1][0] == 'o' && hashGame[2][0] == 'o') || // coluna 1
					(hashGame[0][1] == 'o' && hashGame[1][1] == 'o' && hashGame[2][1] == 'o') || // coluna 2
					(hashGame[0][2] == 'o' && hashGame[1][2] == 'o' && hashGame[2][2] == 'o') || // coluna 3
					(hashGame[0][0] == 'o' && hashGame[1][1] == 'o' && hashGame[2][2] == 'o')) { // diagonal
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou");
			}
		}
	}
}
