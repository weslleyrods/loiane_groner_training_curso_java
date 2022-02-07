package com.loiane.cursojava.aula74.labs;

public class MinhaThread implements Runnable{

	private CorSemaforo cor;
	private boolean parar;
	private boolean corMudou;

	public MinhaThread() {
		this.cor = CorSemaforo.VERMELHO; 
		this.parar = false;
		this.corMudou = false;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {

		while(!parar) {
			try {
				switch(this.cor) {
				case VERMELHO:	
					Thread.sleep(2000);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;
				case AMARELO:
					Thread.sleep(300);
					break;
				default:
					break;
				}
				
				//outra forma mais simplificada que utilizar a passagem de tempo 
				//das cores no Switch, definindo-as no Enum
				//Thread.sleep(this.cor.getTempoDeEspera());
							
				this.mudarCor();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	public synchronized void mudarCor() {
		switch(this.cor){
		case VERMELHO:
			this.cor = CorSemaforo.VERDE;
			break;
		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;
		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;			
		}
		this.corMudou = true;
		notify();
	}

	public synchronized void esperaCorMudar(){
		while(!this.corMudou) {
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}
	
	public synchronized void desligarSemaforo() {
		this.parar = true;
		notify();
	}
	
	public CorSemaforo getCor() {
		return cor;
	}
}

