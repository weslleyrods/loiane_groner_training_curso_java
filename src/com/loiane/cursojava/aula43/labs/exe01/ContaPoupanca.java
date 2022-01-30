package com.loiane.cursojava.aula43.labs.exe01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	
private double diaRendimento;	
	
	@Override
	public String toString() {
		String s = "";
		s += "\nRendimento do dia: " + diaRendimento;
		s += super.toString(); //chama o toString da classe pai para sobrescrever
		return s;
	}



	public double getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public boolean calcularNovoSaldo(double taxaRendimento){
		
		Calendar hoje = Calendar.getInstance(); 
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
			//saldo += saldo * taxaRendimento; 
			this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento));
			return true;
		}
		else {
			return false;
		}
		
	}	
	
}
