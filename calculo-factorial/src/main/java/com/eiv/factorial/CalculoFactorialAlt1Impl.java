package com.eiv.factorial;

public class CalculoFactorialAlt1Impl implements CalculoFactorial {

	@Override
	public long calcular(int numero) {
		long resultado = 1;

		for(int indice = 1; indice < numero; indice++) {
			resultado = resultado * (indice + 1);
		};
		
		return resultado;
	}
	
	public String detalle() {
		return "Calculo algo!";
	} 
	
	
}
