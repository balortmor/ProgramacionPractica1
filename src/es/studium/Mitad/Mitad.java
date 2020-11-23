package es.studium.Mitad;

import java.util.Scanner;

public class Mitad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int num;
		System.out.print("Dame un número");
		num = teclado.nextInt();
		teclado.close();
		System.out.println("La mitad de " + num + " es igual a " + funMitad(num));
	}

	private static float funMitad(int num) {

		float resultado = (float)num/2;
		return resultado;
	}

}
