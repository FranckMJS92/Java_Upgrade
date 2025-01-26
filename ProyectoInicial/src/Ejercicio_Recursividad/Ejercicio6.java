package ProyectoInicial.src.Ejercicio_Recursividad;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(invertir("ba"));
    }

    public static String invertir(String palabra){
        if (palabra.isEmpty()) return palabra;
        return invertir(palabra.substring(1)) + palabra.charAt(0);
    }
}
