package com.loiane.cursojava.aula43.labs.exe01;

public class Teste {

	public static void main(String[] args) {
		System.out.println("**Conta Simples**");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Weslley Rodrigues");
		contaSimples.setNumConta("123456");
		contaSimples.depositar(50);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		System.out.println(contaSimples);

		System.out.println("\n**Conta Poupança**");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Lusia Rodrigues");
		contaPoupanca.setNumConta("8464646");
		contaPoupanca.setDiaRendimento(29);	
		contaPoupanca.depositar(100);
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 80);
		System.out.println(contaPoupanca);
		
		if(contaPoupanca.calcularNovoSaldo(0.2)) {
			System.out.println("Rendimento aplicado, o novo saldo é: "+contaPoupanca.getSaldo());	
		}
		else {
			System.out.println("Hoje não há rendimento, o novo saldo não será calculado");
		}
		
		System.out.println("\n**Conta Especial**");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("José Rodrigues");
		contaEspecial.setNumConta("87964");
		contaEspecial.setLimite(50);	
		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);	
		System.out.println(contaEspecial);
		
		
	}

	public static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado, o novo saldo é: " + conta.getSaldo());
		}
		else {
			System.out.printf("\nSaldo insuficente para realizar o saque de "+valor,".\n"+
			"O saldo atual é: "+ conta.getSaldo());
		}
	}

}
