package Ejercicio_Recursividad;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println(contarCeros(102030));
    }

    public static int contarCeros(int n){
        if(n<10) return (n==0)? 1:0;
        return 0;
    }
}
