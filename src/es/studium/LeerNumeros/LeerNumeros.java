package es.studium.LeerNumeros;

import java.util.Scanner;

public class LeerNumeros {

	public static void main(String[] args) {

		//Creamos la tabla de tipo int y una constante int que será el tamaño de la tabla.
		//También el Scanner.
		final int TAM = 10;
		int tabla[] = new int[TAM];
		Scanner teclado = new Scanner(System.in);
		//Recorremos la tabla e insertamos las variables de tipo int que pasamos por teclado
		//en cada posición de la tabla.
		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame el valor de la tabla[" + i + "]:");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();//Cerramos el teclado.
		//Imprimimos por consola el resultado de la media de todas las variables utilizando 
		//una función.
		System.out.println("La media de los valores introducidos es igual a " + media(tabla));
		//Recorremos con un for la tabla desde el final hasta el principio imprimiendo por 
		//pantalla cada variable.
		for (int i = TAM-1; i >= 0; i--) {
			System.out.print(tabla[i]+" ");
		}
	}
	//Creamos la funcion para calcular la media que pedirá una tabla de tipo int y devolverá
	//un float.
	private static float media(int[] tabla) {
		//Creamos la variable de tipo float donde guardaremos nuestro resultado.
		float resultado = 0;
		//Con un for sumaremos todas las variables de tipo int de nuestra tabla y la guardaremos 
		//en nuestra variable de tipo float.
		for (int i = 0; i < tabla.length; i++) {
			resultado = resultado + (float)tabla[i];
		}
		//La suma total la dividiremos entre el número de variables que hay en la tabla
		//consiguiendo así la media y la devolveremos con return.
		resultado = resultado/tabla.length;
		return resultado;
	}

}
