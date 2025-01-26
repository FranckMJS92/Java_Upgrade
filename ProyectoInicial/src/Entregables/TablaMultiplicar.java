package ProyectoInicial.src.Entregables;

import java.util.Scanner;

public class TablaMultiplicar {
	
//	Escribe un programa que solicite al usuario un número entero y luego muestre la
//	tabla de multiplicar de ese número, del 1 al 10. Cada línea de la salida debe mostrar la
//	operación en el formato X * i = resultado.

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		//Pidiendo numero entero
		System.out.println("Ingrese numero entero: ");
		int number = escaner.nextInt();
		
		System.out.println("\nTabla de multiplicar del " + number);
		//Calculando tabla de multiplicar
		for (int i=1 ; i<=10 ;  i++) {
			System.out.println(number + " * " + i + " = " + number*i );
		}

		escaner.close();
	}

}
