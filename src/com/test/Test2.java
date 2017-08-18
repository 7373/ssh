package com.test;

import java.math.BigDecimal;


public class Test2 {
	public static void main(String arg[]){	
		String a="12.00";
		double b=13.3;
		double c=Double.parseDouble(a);
		BigDecimal q= new BigDecimal(b);
		BigDecimal w= new BigDecimal(c);
		double s=q.add(w).doubleValue();
		System.out.println(s);
	
	}

}
