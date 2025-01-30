package ProyectoInicial.src.Ejercicio_Recursividad;

/*
*  4. **Potencia**  
*  Escribe una función recursiva para calcular \( a^b \), donde \( a \) es la base y \( b \) el exponente.  
*  Ejemplo: potencia(2, 3) = 8.
*/

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println(potencia(0, 5));
    }

    public static int potencia(int a, int b){
        //if(a==0) return 0;
        if (b==0) return 1;
        if (b==1) return a;
        return a*potencia(a, b-1);
    }
}
