package com.eiv.gauss;

import java.util.Scanner;

public class AppGauss {

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		double sNumero = mScanner.nextInt();
		mScanner.close();
		double sResultado = 0;
		
		ICalcularGauss sCalcular = new CalcularGauss();
		
		sResultado = sCalcular.Calcular(sNumero);
		
		System.out.println("Resultado: " + sResultado);
		
	}

}
