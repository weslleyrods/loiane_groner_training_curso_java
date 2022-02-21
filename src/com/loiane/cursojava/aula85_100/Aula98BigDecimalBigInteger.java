package com.loiane.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigDecimalBigInteger {

	public static void main(String[] args) {

		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);
		
		BigDecimal a_ = new BigDecimal("0.03");
		BigDecimal b_ = new BigDecimal("0.04");
		BigDecimal c_ = b_.subtract(a_);
		System.out.println(c_);
		
		BigDecimal bd1 = new BigDecimal("15646.46498446684949849");
		BigDecimal bd2 = new BigDecimal("126446.568644689494946");
		
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(new BigDecimal("2")));
		
		BigInteger bi1 = new BigInteger("1000000000000000000000000");
		BigInteger bi2 = new BigInteger("9000000000000000000000000");
		
	}
}
