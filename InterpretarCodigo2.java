package com.dam.salva;

public class InterpretarCodigo2 {

	public static void main(String[] args) {

		int r = 5;

		for (int j = 1; j <= r; j++) {
			for (int i = 1; i <= r - j; i++) {
				System.out.print("  ");
			}

			for (int k = 1; k <= j; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
