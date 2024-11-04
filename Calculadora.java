package com.ejercicios.entregables;

import java.util.Scanner;

public class Calculadora {
	
//	Crea un programa que solicite al usuario ingresar dos números y un símbolo de
//	operación (+, -, *, /). El programa debe realizar la operación especificada entre los dos
//	números y mostrar el resultado. Si el usuario ingresa un símbolo que no sea válido, el
//	programa debe mostrar un mensaje de error.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese primer numero:");
		double number1 = sc.nextDouble();
		System.out.println("Ingrese segundo numero:");
		double number2 =  sc.nextDouble();
		System.out.println("Ingrese operador: (+, -, *, /)");
		String ope = sc.next();
		
		switch(ope) {
			case "*":
				System.out.println("La multiplicacion de " + number1 + " * " + number2 + " = " + number1*number2);
				break;
				
			case "/":
				System.out.println("La division de " + number1 + " / " + number2 + " = " + (number1/number2));
				break;
				
			case "+":
				System.out.println("La suma de " + number1 + " + " + number2 + " = " + (number1+number2));
				break;
			
			case "-":
				System.out.println("La resta de " + number1 + " - " + number2 + " = " + (number1-number2));
				break;			
		}

	}

}
