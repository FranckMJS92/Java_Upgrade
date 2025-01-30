package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 9. **Buscar un elemento en un arreglo**  
*  Escribe una función recursiva que determine si un número está en un arreglo.  
*  Ejemplo: buscar([1, 3, 5, 7], 5) → true.
 */

public class Ejercicio9 {

    public static void main(String[] args) {
        int[] arreglo = { 1, 3, 5, 7 };
        System.out.println(buscar(arreglo, 3));
        
    }

    public static boolean buscar(int[] a, int b) {
        if (a.length == 0)
            return false;

        for (int x : a) {
            if (b == x)
                return true;
        }
        return false;
    }

}
