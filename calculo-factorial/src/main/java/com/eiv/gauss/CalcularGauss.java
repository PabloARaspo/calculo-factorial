package com.eiv.gauss;

/**
 * Calcula sumatoria de valores a traves de la formula de Euler.*/
public class CalcularGauss implements ICalcularGauss {

	@Override
	public double Calcular(double pNumero) {
		double sNumero = 0;
		System.out.println("Por Gauss");
		sNumero = Math.pow(pNumero, (pNumero + 1)) / 2;
		return sNumero;
	}

}