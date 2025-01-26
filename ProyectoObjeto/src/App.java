package ProyectoObjeto.src;

import ProyectoObjeto.src.ClaseFraccion.Fraccion;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Fraccion fraccion = new Fraccion();
        Fraccion fraccion2 = new Fraccion(2, 3);
        Fraccion fraccion3 = new Fraccion(5);

        System.out.println("Fraccion con el constructor vacio = "+fraccion);
        System.out.println("Fraccion con el constructor con 2 parametros = "+fraccion2);
        System.out.println("Fraccion con el constructor indicando solo numerador "+fraccion3);

    }
}
