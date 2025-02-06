package ProyectoInicial.src.Ejercicio_Recursividad;

/*
 * 10. **Torre de Hanói**  
*  Implementa la solución al problema clásico de la Torre de Hanói para \( n \) discos.
 */

/**
 * The Ejercicio10 class provides a solution to the Tower of Hanoi problem using recursion.
 * The main method demonstrates the solution by solving the problem for 3 disks.
 * 
 * The resolverTorre method prints the steps required to move 'n' disks from the origin rod to the destination rod using an auxiliary rod.
 * 
 * @param n       the number of disks to move
 * @param origen  the rod from which to move the disks
 * @param auxiliar the rod to use as an auxiliary during the move
 * @param destino the rod to which to move the disks
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
