package com.loiane.cursojava.aula85_100;

import java.util.Random;

public class Aula99Random {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random()*10));
		
		Random rd = new Random();
		System.out.println(rd.nextInt(5));
	}

}
