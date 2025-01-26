package ProyectoInicial.src.Ejercicio_Recursividad;

public class Ejercicio7 {
    public static void main(String[] args) {
            System.out.println("La suma de los digitos del numero 123 es: "+sumaDigitos(123) );
    }

    public static int sumaDigitos(int n){
        if(n==0) return 0;
        return n%10 + sumaDigitos(n/10);
    }
}
