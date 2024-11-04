package com.ejercicios.entregables;

import java.util.Scanner;

public class MenuInteractivo {
	
//	Diseña un programa que muestre un menú interactivo con tres opciones:
//		1.
//		Saludar
//		2.
//		Despedirse
//		3.
//		Salir
//		El programa debe permitir al usuario elegir una opción y responder en consecuencia
//		(por ejemplo, “¡Hola!” o “Adiós”). Este menú debe seguir apareciendo hasta que el
//		usuario seleccione la opción “Salir”. Si el usuario selecciona una opción inválida, el
//		programa debe mostrar un mensaje de error e invitar a elegir nuevamente.

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int opcion;
		
		do {
			 //Opciones de Menu
			 System.out.println("Hola usuario, elige una de estas 3 opciones (poniendo solo el número correspondiente):");
		     System.out.println("1.\nSaludar");
		     System.out.println("2.\nDespedirse");
		     System.out.println("3.\nSalir");
		     
		     opcion = escaner.nextInt();
		        
			switch (opcion) {
	        case 1:
	        	System.out.println("Hola! Hello! Salut! Ciao! ☋\n");
	            break;
	        case 2:
	        	System.out.println("Adios! Bye! Au revoir! Ciao! ☋\n");
	            break;
	        case 3:
	            System.out.println("S a l i e n d o . . . ");
	            break;
	        default:
	            System.out.println("Por favor elegir una opcion correcta.\n" );
			}
		} while(opcion != 3);

	}

}
