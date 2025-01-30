package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 5. **Secuencia de Fibonacci**  
*  Escribe una función recursiva para obtener el \( n \)-ésimo término de la serie de Fibonacci.  
*  Ejemplo: fibonacci(5) = 5 (secuencia: 0, 1, 1, 2, 3, 5).
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("El término 14 de la sucesión de Fibonacci es el " + fibonacci(14));
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
