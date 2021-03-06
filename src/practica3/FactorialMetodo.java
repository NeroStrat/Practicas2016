package practica3;
/** FactorialMetodo.java
  * Fecha: 21/11/2016
  * Autor: Alvaro Robles Andreu
  * Evalua el discriminante de una ecuación de segundo grado usando metodos
  */

import java.util.Scanner;
public class FactorialMetodo 	{
	public static void main(String argumentos[]) {
		factorial();}
	public static void factorial(){
		//Usamos un teclado especifico para los números y otro para la letra T
		Scanner teclado = new Scanner(System.in);
		Scanner tecladonum = new Scanner(System.in);
	
		// Variables
		String mensaje;
		mensaje = "Este programa lee numeros enteros positivos y nos muestra su factorial";
		System.out.println(mensaje);
		int num;
		double factorial = 1;
			mensaje = "Introduzca un número: ";
			System.out.println(mensaje);
			num = teclado.nextInt();
			if (num < 0) {

				// Se muestra por pantalla el resultado obtenido.
				System.out.println("El entero debe ser 0 o positivo.");

			} else {

				// Operaciones necesarias para la realización del factorial.
				if (num == 0)
					factorial = 0;
				else
					for (int i = 1; i <= num; i++)
						factorial = factorial * i;

				// Se muestra por pantalla el resultado obtenido.
				System.out.println("El factorial de " + num+ " (" + num + "!) es: " + factorial + ".");
				System.out.println("Fin del programa");
			}
			teclado.close();
			tecladonum.close();
		}
	}