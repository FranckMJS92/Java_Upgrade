package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 7. **Sumar dígitos de un número**  
*  Escribe una función recursiva que sume los dígitos de un número.  
*  Ejemplo: sumaDigitos(123) = 1 + 2 + 3 = 6.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("La suma de los digitos del numero 123 es: " + sumaDigitos(123));
    }

    public static int sumaDigitos(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumaDigitos(n / 10);
    }
}
