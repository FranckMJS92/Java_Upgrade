package ProyectoInicial.src.Ejercicio_Recursividad;

/*
* Sumatoria de números 
* Escribe una función recursiva que calcule la suma de los 
* números del 1 al ( n ).
* Ejemplo: suma(5) = 1 + 2 + 3 + 4 + 5 = 15.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        int n = 0;
        System.out.println("La suma de los numeros del 1 al " + n + " es: " + suma(n));
    }

    public static int suma(int n) {
        if (n == 0)
            return 0;
        return n + suma(n - 1);
    }
}
