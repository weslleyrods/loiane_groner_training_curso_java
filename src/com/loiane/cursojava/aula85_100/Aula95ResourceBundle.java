package com.loiane.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

import jdk.internal.loader.Resource;

public class Aula95ResourceBundle {

	public static void main(String[] args) {

		System.out.println("Locale atual: "+Locale.getDefault()); //minha máquina está em en_US
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		System.out.println("Hello en_US: "+ rb.getString("hello"));
		System.out.println("en_US: "+ rb.getString("world"));
		
		Locale br = new Locale("pt", "BR");
		//Locale.setDefault(new Locale("pt", "BR"));
		rb = ResourceBundle.getBundle("meu-texto", br);
		
		System.out.println("Olá pt_BR: "+ rb.getString("hello"));
		System.out.println("Olá pt_BR: "+ rb.getString("world"));
	}
}
