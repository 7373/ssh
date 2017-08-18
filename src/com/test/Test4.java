package com.test;

import java.math.BigDecimal;

public class Test4 {
	public static void main(String args[]){
		double a=1.3;
		int b=2;
		BigDecimal c=new BigDecimal(a);
		BigDecimal d=new BigDecimal(b);
		System.out.println(c.multiply(d).doubleValue());
	}

}
