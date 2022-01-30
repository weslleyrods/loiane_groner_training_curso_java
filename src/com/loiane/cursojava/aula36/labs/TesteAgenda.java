package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		System.out.println("Qual o nome da agenda?");
		agenda.setNomeAgenda(scan.nextLine());
		
		//Outras maneiras para definir o nome da agenda
		/*String nome = scan.nextLine();
		Agenda agenda = new Agenda(nome);
		agenda.setNomeAgenda(nome);*/
		
		
		Contato[] contatos = new Contato[3];
		
		
		for(int i=0;i<3;i++) {
			System.out.println("Entre com as informações do contato "+(i+1));
			
			Contato c = new Contato();
			
			System.out.println("Informe o nome do contato");
			c.setNome(scan.nextLine());
			
			System.out.println("Informe o telefone do contato");
			c.setTelefone(scan.nextLine());
			
			System.out.println("Informe o email do contato");
			c.setEmail(scan.nextLine());
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		if(agenda != null) {
		System.out.println(agenda.obterInfo());
		}
	}
}
