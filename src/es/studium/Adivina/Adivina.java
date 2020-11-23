package es.studium.Adivina;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {

		//Creamos la tabla de tipo String, una constante int que será el tamaño de la tabla 
		//y un String donde guardaremos nuestra respuesta.
		final int TAM = 5;
		String tabla[] = new String[TAM];
		String respuesta;
		//Creamos el Scanner para escribir por consola.
		Scanner teclado = new Scanner(System.in);
		//Recorremos la tabla con un for para introdcuir las cadenas.
		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame la cadena de la posición[" + i + "]:");
			tabla[i] = teclado.nextLine();
		}
		//Creamos un numero aleatorio de 0 a 4.
		Random generadorAleatorios = new Random();
		int numeroAleatorio = generadorAleatorios.nextInt(5);
		System.out.println(numeroAleatorio);
		//Escribiremos por teclado la respuesta que intenta adivinar.
		System.out.println("Escribe una de las cadenas dadas:");
		respuesta = teclado.nextLine();
		teclado.close();
		//Comparamos la respuesta con la cadena de la tabla en la posición
		//del número aleatorio que hemos creado y pasaremos por consola si hemos acertado o no.
		if(respuesta.equals(tabla[numeroAleatorio])) {
			System.out.println("!Has adivinado la cadena¡");
		}else {
			System.out.println("No has adivinado la cadena.");
		}

	}

}
