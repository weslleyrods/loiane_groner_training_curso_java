package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		String[][] compromissos = new String[31][24];

		byte op;
		do {
			System.out.println("1 - Agendar\n2 - Consultar\n3 - Sair\n");
			Scanner scan = new Scanner(System.in);
			op = scan.nextByte();

			switch (op) {
			case 1: {
				System.out.println("Dia do mês: ");
				int dia = scan.nextInt();

				System.out.println("Hora: ");
				int hora = scan.nextInt();

				if ((dia > 0 && dia <= 31) && (hora >= 0 && hora <= 24)) {
					System.out.println("Compromisso");
					compromissos[dia - 1][hora] = scan.next();
				} else {
					System.out.println("Dia e hora inválidos");
				}
				break;
			}
			case 2: {
				System.out.println("Dia do mês: ");
				int dia = scan.nextInt();

				System.out.println("Hora: ");
				int hora = scan.nextInt();

				if ((dia > 0 && dia <= 31) && (hora >= 0 && hora <= 24)) {
					System.out.println("O compromisso agendado é: " + compromissos[dia - 1][hora]);

				} else {
					System.out.println("Dia e hora inválidos");
				}
				break;
			}
			case 3:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (op != 3);
	}
}
