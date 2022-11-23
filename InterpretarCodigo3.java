package com.dam.salva;

public class InterpretarCodigo3 {

	public static void main(String[] args) {

		int nFilas = 5;
		int nBlancos = (nFilas * 2) - 2;

		System.out.println();

		for (int i = 1; i <= nFilas; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= nBlancos; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			nBlancos -= 2;
			System.out.println();
		}
	}
}
