package org.itstep;

public class main {

	public static void main(String[] args) {
		
	max(4, 2, 12);               
			}
	public static void max (int a, long b,double c) {
		    double rezult_ab=a*b;
			double rezult_ac=a*c;
			double rezult_bc=b*c;
			
		if (rezult_ab>rezult_ac & rezult_ab> rezult_bc) {
			System.out.println("максимальное значение результатов умножения введенных чисел - "+rezult_ab );}
		
			if (rezult_ac > rezult_bc & rezult_ac > rezult_ab ) {
				System.out.println("максимальное значение результатов умножения введенных чисел - "+rezult_ac );}
			else System.out.println("максимальное значение результатов умножения введенных чисел - "+rezult_bc );
	}
	}

