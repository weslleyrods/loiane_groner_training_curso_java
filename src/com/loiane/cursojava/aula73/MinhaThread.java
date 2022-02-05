package com.loiane.cursojava.aula73;

public class MinhaThread implements Runnable{

	private String nome;
	private boolean estaSuspensa;
	private boolean foiTerminada;

	public MinhaThread(String nome) {
		this.nome = nome;
		this.estaSuspensa = false;
		new Thread(this, nome).start();
	}
	@Override
	public void run() {
		System.out.println("Executando "+nome);
		try {
			for(int i=0; i<10;i++) {
				System.out.println("Thread "+nome+", "+i);
				Thread.sleep(300);
				//bloco synchronized para uso dos métodos wait e notify
				//passando This como parâmetro, porque o objeto é suspender e resumir a execução 
				//da própria thread(MinhaThread). Então a própria classe é passada como recurso
				//para estar sincronizada.
				synchronized (this) {
					while(estaSuspensa) {
						wait(); //
					}
					
					//if para que que quando o método stop for chamado, notificar o wait
					//consequentemente o programa sai do while
					//e assim, sair do laço do for usando break 
					//e por fim terminando a execução da thread
					if(this.foiTerminada) {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread "+nome+" terminada");
	}
	
	void suspend(){
		this.estaSuspensa = true;
	}
	
	synchronized void resume() {
		this.estaSuspensa = false;
		notify(); //para notificar a Thread que está em wait
	}
	
	synchronized void stop(){
		this.foiTerminada = true;
		notify(); //para notificar a Thread que está em wait
	}
}

