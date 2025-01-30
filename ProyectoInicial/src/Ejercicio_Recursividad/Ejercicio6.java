package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 6. **Invertir una cadena**  
*  Escribe una función recursiva que invierta una cadena de texto.  
*  Ejemplo: invertir("recursivo") → "ovisrucer".
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(invertir("ba"));
    }

    public static String invertir(String palabra) {
        if (palabra.isEmpty())
            return palabra;
        return invertir(palabra.substring(1)) + palabra.charAt(0);
    }
}
