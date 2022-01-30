package com.loiane.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int op;
		do {
		System.out.println("1 - Consultar contato\n2 - Adicionar contato\n3 - Sair");		
		op = scan.nextByte();		
		switch(op) {
			case 1:		
				try {
					System.out.println("Qual o nome do contato? ");
					String nome = scan.nextLine();
					if(agenda.consultaContato(nome) >= 0) {	
						System.out.println("Contato existe");
						System.out.println(agenda);										
					}
				} catch (ContatoNaoExisteException e) {
						System.out.println(e.getMessage());
					}		
				break;
			case 2:
				try {
					Contato contato = new Contato();
					System.out.println("Qual o nome do contato?");
					String nome = scan.nextLine();
					contato.setNome(nome);
					scan.nextLine();
					System.out.println("Qual o telefone do contato?");
					String telefone = scan.nextLine();
					contato.setTelefone(telefone);
					System.out.println("Qual o e-mail do contato?");
					String email = scan.nextLine();
					contato.setEmail(email);
					
					System.out.println("Contato adicionado com sucesso!");
					agenda.addContato(contato);		
					System.out.println(contato);
					
				} catch (AgendaCheiaException e) {
					System.out.println(e.getMessage());
					
					System.out.println("Contatos da agenda");
					System.out.println(agenda);
				}
				break;
			case 3:
				break;
			default: System.out.println("\nOpção inválida, digite novamente\n");
			}
		}while(op != 3);
		
		scan.close();
	}
}
