package ProyectoObjeto.src;

import ProyectoObjeto.src.ClaseFraccion.Fraccion;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion(3, 4);
        Fraccion f3 = new Fraccion(5);
        Fraccion f4 = new Fraccion(9,12);

        System.out.println("Fraccion con el constructor vacio = "+f1);
        System.out.println("Fraccion con el constructor con 2 parametros = "+f2);
        System.out.println("Fraccion con el constructor indicando solo numerador "+f3);
        System.out.println(f2.sumar(f4));

    }
}
