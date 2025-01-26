package ProyectoInicial.src.Entregables;

import java.util.Scanner;

public class BatallaNaval {

	static char[][] table0 = new char[5][5];
	static String[][] tableS = new String[5][5];
	static byte shots = 0;

	static final String ROJO = "\u001B[31m";
	static final String AZUL = "\u001B[34m";
	static final String F_AMARILLO = "\u001B[43m";
	static final String F_ROJO = "\u001B[41m";
	static final String NEGRITA = "\u001B[1m";
	static final String RESET = "\u001B[0m";

	public static void iniciarTablero() {

		/*
		 * Se inicia dos tableros; uno que se carga con las posiciones iniciales y otro
		 * que ira intereactuando y cambiando.
		 */

		// Inicio tablero con inicial
		for (byte x = 0; x < table0.length; x++) {
			for (byte y = 0; y < table0.length; y++) {
				table0[x][y] = '\u2652';
			}
		}

		// Inicio tablero con interactivo
		for (byte x = 0; x < tableS.length; x++) {
			for (byte y = 0; y < tableS.length; y++) {
				tableS[x][y] = "\u2652";
			}
		}

		/*Inicio los 3 barcos en tablero inicial
		for (byte b = 1; b <= 3; b++) {
			int fila = aleatorio.nextInt(5)+1;
			int columna = aleatorio.nextInt(5)+1;
			table0[fila-1][columna-1] = '\u26F5';
		}
		* Quite el aleatorio porque no supe como hacer que los pares de coordenadas
		* no se repitan. En ocasiones solo tenia 2 barcos en el tablero =(
		*/
		table0[0][4]= '\u26F5';
		table0[3][2]= '\u26F5';
		table0[2][1]= '\u26F5';
	}

	public static void mostrarTablero() {
		for (byte x = 0; x < tableS.length; x++) {
			System.out.println(tableS[x][0] + "\t" + tableS[x][1] + "\t" + tableS[x][2] + "\t" + tableS[x][3] + "\t"
					+ tableS[x][4] + "\n");
		}
	}

	public static void evaluaDisparo(byte r, byte c) {
		if (table0[r - 1][c - 1] == '\u26F5') {
			System.out.printf(ROJO + "%-5S %-5S %-5S %-5S %-5S %-5S %n%n" + RESET, "t", "o", "c", "a", "d", "o");
			shots += 1;
			tableS[r - 1][c - 1] = ROJO + "X" + RESET + "\t";
		} else {
			System.out.printf(AZUL + "%-8S %-8S %-8S %-8S %n%n" + RESET, "a", "g", "u", "a");
			tableS[r - 1][c - 1] = AZUL + "~" + RESET + "\t";
		}
	}

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		byte intentos = 0;
		byte  row, column;

		iniciarTablero();

		do {
			// Metodo para mostrar tablero simbolico
			mostrarTablero();

			// Solicitar fila y evalua que ingrese un entero entre 1 y 5
			while (true) {
				System.out.print("Ingresa coordenada de fila (1-5): ");
				if (escaner.hasNextInt()) {
					row = (byte) escaner.nextInt();
					if (row >= 1 && row <= 5) {
						break; // Romper bucle si todo es correcto
					} else {
						System.out.println("Por favor ingresa un número entre 1 y 5");
					}
				} else {
					System.out.println("Ingresa un numero entero");
					escaner.next(); // Descartar entrada incorrecta
				}
			}

			// Solicitar columna y evalua que ingrese un entero entre 1 y 5
			while (true) {
				System.out.print("Ingresa coordenada de columna (entre 1 y 5): ");
				if (escaner.hasNextInt()) {
					column = (byte) escaner.nextInt();
					if (column >= 1 && column <= 5) {
						break; // Romper bucle si todo es correcto
					} else {
						System.out.println("Por favor ingresa un número entre 1 y 5");
					}
				} else {
					System.out.println("Ingresa un numero entero");
					escaner.next(); // Descartar entrada incorrecta
				}
			}

			evaluaDisparo(row, column);
			if (shots == 3)
				break;
			intentos++;

		} while (intentos != 10);

		if (shots == 3) {
			System.out.printf(F_AMARILLO + NEGRITA + "%-3S %-3S %-3S %-3S %-3S %-3S %-3S %-3S %n" + RESET, "v", "i",
					"c", "t", "o", "r", "i", "a");
		} else {
			System.out.printf(F_ROJO + NEGRITA + "%-5S %-5S %-5S %-5S %-5S %-5S %-5S %n" + RESET, "d", "e", "r", "r",
					"o", "t", "a");
			System.out.println("Los barcos estaban en estas posiciones: \n");
			
			// Mostrar tablero inicial con posiciones de los barcos
			for (byte x = 0; x < table0.length; x++) {
				System.out.println(F_AMARILLO + table0[x][0] + "\t" + table0[x][1] + "\t" + table0[x][2] + "\t"
						+ table0[x][3] + "\t" + table0[x][4] + RESET);
			}
		}

		escaner.close();
	}
}