package com.ejercicios.entregables;

import java.util.Scanner;

public class SumadorNumeros {
	
//	Escribe un programa que permita al usuario ingresar una serie de números enteros.
//	El programa debe seguir pidiendo números hasta que el usuario ingrese "0". Una vez
//	que se ingresa "0", el programa debe mostrar la suma total de todos los números
//	ingresados (sin contar el 0 final).

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int number;
		int suma=0;
		
		do {
			System.out.println("Ingrese numero:");
			number = scaner.nextInt();
			suma=suma+number;
			System.out.println();
		}
		while(number != 0);
		System.out.println("La suma de los numeros es " + suma);
	}

}
