package ProyectoInicial.src.Ejercicio_Recursividad;

import java.util.Scanner;

/*
 * 3. **Imprimir números en orden inverso**  
*  Escribe una función recursiva que reciba un número \( n \) y lo imprima en orden descendente.  
*  Ejemplo: Para \( n = 5 \), salida: 5, 4, 3, 2, 1.
*/

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese un numero entero positivo: ");
        n = sc.nextInt();

        System.out.println(inverso(n));

        sc.close();
    }

    public static String inverso(int n) {
        if (n == 0)
            return "";
        if (n == 1)
            return 1 + "";

        return n + " , " + inverso(n - 1);
    }
}
