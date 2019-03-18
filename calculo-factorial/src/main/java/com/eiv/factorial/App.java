package com.eiv.factorial;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		CalculoFactorial mCalculoFactorial = new CalculoFactorialImpl();
		
		System.out.println("Cargale un número!:");
		Scanner sStr = new Scanner(System.in);
		String sNumero = sStr.nextLine();
		int el_numero = Integer.valueOf(sNumero);
		long resultado = mCalculoFactorial.calcular(el_numero);
		sStr.close();
		System.out.println("El resultado del factorial de " + el_numero + " es " + resultado);
	}
}
