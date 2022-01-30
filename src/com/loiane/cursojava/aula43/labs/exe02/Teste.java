package com.loiane.cursojava.aula43.labs.exe02;

public class Teste {

	public static void main(String[] args) {
				
		PessoaFisica p1 = new PessoaFisica("Pessoa 1", "165.897.456-73", 1000);
		PessoaFisica p2 = new PessoaFisica("Pessoa 2", "098.309.620-16", 2000);
		PessoaFisica p3 = new PessoaFisica("Pessoa 2", "914.001.960-86", 2850);
		
		
		PessoaJuridica pf1 = new PessoaJuridica("Pessoa Juridica 1", "70.166.366/0001-10", 3000);
		PessoaJuridica pf2 = new PessoaJuridica("Pessoa Juridica 2", "90.275.889/0001-02", 3700);
		PessoaJuridica pf3 = new PessoaJuridica("Pessoa Juridica 3", "03.747.793/0001-03", 4000);
		
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = pf1;
		contribuintes[4] = pf2;
		contribuintes[5] = pf3;
		
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
	}

}
