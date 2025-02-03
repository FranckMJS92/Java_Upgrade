package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 10. **Torre de Hanói**  
*  Implementa la solución al problema clásico de la Torre de Hanói para \( n \) discos.
 */

public class Ejercicio10 {

    public static void main(String[] args) {
        resolverTorre(3, 'A', 'B', 'C');
    }

    public static void resolverTorre(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        resolverTorre(n - 1, origen, destino, auxiliar); // resuelve la torre inmediatamente menor a esta dejándola
                                                         // enmedio

        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        resolverTorre(n - 1, auxiliar, origen, destino);
    }

}
