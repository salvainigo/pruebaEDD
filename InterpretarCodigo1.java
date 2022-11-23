package com.dam.salva;

public class InterpretarCodigo1 {

	public static void main(String[] args) {
		int r = 5;

		for (int x = 1; x <= r; x++) {
			for (int i = 1; i <= x; i++) {
				System.out.print("* ");
			}

			System.out.println("");
		}
	}
}
