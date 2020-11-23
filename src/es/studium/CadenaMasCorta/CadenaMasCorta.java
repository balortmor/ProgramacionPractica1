package es.studium.CadenaMasCorta;

import java.util.Scanner;

public class CadenaMasCorta {

	public static void main(String[] args) {

		final int TAM = 10;
		String tabla[] = new String[TAM];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame la cadena de la posición[" + i + "]:");
			tabla[i] = teclado.nextLine();
		}
		teclado.close();
		System.out.println("La cadena más corta de la tabla es: " + fun_cadenaCorta(tabla));
	}

	private static String fun_cadenaCorta(String[] tabla) {

		String cadena;
		cadena = tabla[0];
		for (int i = 1; i < tabla.length; i++) {
			if (cadena.length()>tabla[i].length()) {
				cadena = tabla[i];
			}
		}
		return cadena;
	}
}
