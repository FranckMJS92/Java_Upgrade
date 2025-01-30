package ProyectoObjeto.src.ClaseFraccion;

/**
 * Clase que representa una fracción con numerador y denominador.
 * Demuestra el uso de la programación orientada a objetos en Java.
 * Incluye atributos, un constructor, métodos de acceso (getters y setters)
 * y un método para mostrar información.
 * 
 * @author Francisco Adolfo Lopez Monrroy
 * @version 1.0
 * @fecha 2025-01-26
 */
public class Fraccion {
    /**
     * El numerador de la fracción.
     */
    private int numerador;

    /*
     * El denominador de la fracción.
     */
    private int denominador;

    /*Constructor de la clase Fraccion sin parametros.
     * Permite inicializar el numerador en cero 
     * y el denominador de la fracción en 1.
     */
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Constructor de la clase Fraccion.
     *
     * @param numerador   El numeroador de la fraccion.
     * @param denominador El denominador de la fraccion. Que no debe ser cero!
     * 
     * Si el denominador es cero, se imprime un mensaje de error
     * indicando que el denominador debe ser distinto de cero.
     */
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador == 0) {
            System.out.println("El denominador debe ser distinto de 0.");
        } else
            this.denominador = denominador;
    }

    /**
     * Constructor de la clase Fraccion con un numerador especifico y un denominador por defecto igual a 1.
     *
     * @param numerador el numerador de la fracción.
     */
    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    /**
     * Actualiza el numerador de la fracción.
     *
     * @param numerador el valor del numerador.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Actualiza el denominador de la fracción.
     * Si el denominador proporcionado es cero, se imprime un mensaje de error y no se establece el denominador.
     *
     * @param denominador el valor a establecer como denominador. No debe ser cero.
     */
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            System.out.println("El denominador debe ser distinto de 0.");
        } else
            this.denominador = denominador;
    }

    /**
     * Devuelve el numerador de la fracción.
     *
     * @return el numerador como un número entero
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Devuelve el denominador de la fracción.
     *
     * @return el denominador como un número entero
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Devuelve una representación de cadena de la fracción en el formato "numerador/denominador".
     *
     * @return una representación de cadena de la fracción
     */
    @Override
    public String toString() {
        //return numerador + "/" + denominador;
        return (denominador ==1 ) ? String.valueOf(denominador) : numerador + "/" + denominador;
    }
}
