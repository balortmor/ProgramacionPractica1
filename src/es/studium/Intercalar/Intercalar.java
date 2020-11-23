package es.studium.Intercalar;

import java.util.Scanner;

public class Intercalar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		String cadena1, cadena2;
		String cadenaIntercalada = "";
		System.out.println("Escriba la primera cadena: ");
		cadena1 = teclado.nextLine();
		System.out.println("Escriba la segunda cadena: ");
		cadena2 = teclado.nextLine();
		teclado.close();

		if(cadena1.length()==cadena2.length()) {
			for (int i = 0; i <= cadena1.length(); i++) {
				cadenaIntercalada = cadenaIntercalada + cadena1.charAt(i) + cadena2.charAt(i);
			}
		}else if (cadena1.length()>cadena2.length()) {
			for (int j = 0; j < cadena2.length(); j++) {
				cadenaIntercalada = cadenaIntercalada + cadena1.charAt(j) + cadena2.charAt(j);
				if (j+1==cadena2.length()) {
					for (int i = cadena2.length(); i < cadena1.length(); i++) {
						cadenaIntercalada = cadenaIntercalada + cadena1.charAt(i);
					}
				}
			}
		}else {
			for (int j = 0; j < cadena1.length(); j++) {
				cadenaIntercalada = cadenaIntercalada + cadena1.charAt(j) + cadena2.charAt(j);
				if (j+1==cadena1.length()) {
					for (int i = cadena1.length(); i < cadena2.length(); i++) {
						cadenaIntercalada = cadenaIntercalada + cadena2.charAt(i);
					}
				}
			}		
		}
		System.out.println("El resultado de " + cadena1 + " intercalada con "+ cadena2 + 
				" es " + cadenaIntercalada);
	}

}
