package es.studium.FinalAnyo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class FinalAnyo {

	public static void main(String[] args) throws ParseException {

		//Creamos un String donde guardaremos la fecha que hemos escrito por teclado,
		//dos long que utilizaremos para restar las fechas y el teclado.
		String fechaComoString;
		long diferenciaMs, diferenciaDias;
		Scanner teclado = new Scanner (System.in);
		//Pedimos la fecha por consola.
		System.out.println("Dame una fecha(dd/MM/yyyy)");
		fechaComoString = teclado.nextLine();
		teclado.close();
		//Mediante la clase SimpleDateFormat creamos la fecha en el formato dd/MM/yyyy y la
		//guardamos en una variable de tipo Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = sdf.parse(fechaComoString);
		//Mediante LocalDate obtenemos el año siguiente al que hemos escrito por pantalla
		// y guardamos en otro Date el primer dia del nuevo nuevo.
		LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int anyoProximo  = localDate.getYear() + 1;
		Date finAnyo = sdf.parse("1/1/" + anyoProximo);
		//Pasamos a milisegundos las fechas y las restamos.El resultado diferenciaMs lo
		//pasaremos a dias y lo guardaremos en diferenciaDias.
		diferenciaMs = finAnyo.getTime() - fecha.getTime();
		diferenciaDias = diferenciaMs / (1000 * 60 * 60 * 24);
		//Lo pasaremos por pantalla el resultado.
		System.out.println("Quedan " + diferenciaDias + " dias para fin de año.");	
	}

}
