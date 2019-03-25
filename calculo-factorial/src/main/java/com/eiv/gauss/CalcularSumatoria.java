package com.eiv.gauss;

/**
 * Calcula sumatoria de valores en forma directa.*/
public class CalcularSumatoria implements ICalcularGauss {

	@Override
	public double Calcular(double pNumero) {
		double sNumero = 0;
		System.out.println("Por Sumatoria");
		for(int indice = 1; indice < pNumero; indice++) {
			sNumero = sNumero + indice;
		};
		
		
		return sNumero;
	}

}
