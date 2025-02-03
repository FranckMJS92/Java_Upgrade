package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 11. **Contar subconjuntos**  
*  Escribe una función recursiva que cuente el número de subconjuntos posibles de un conjunto dado.  
*  Ejemplo: subconjuntos({1, 2, 3}) = 8 (vacío incluido).
 */

public class Ejercicio11 {

    public static void main(String[] args) {
        int[] conjunto = { 1, 2, 3, 4, 5, 6 };
        System.out.println(contarSubconjunto(conjunto));
    }

    public static int contarSubconjunto(int[] c) {
        if (c.length == 0)
            return (int) Math.pow(2, c.length);
        if (c.length == 1)
            return (int) Math.pow(2, c.length);
        return (int) Math.pow(2, c.length);
    }

}
