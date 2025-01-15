public class EjemploFunciones01 {
    public static void main(String[] args) {
        //Voy a crear una funcion que me permite elevar un numero 'a' a una potencia 'b'
        //La idea es que mas adelante esta siguiente linea funcione:    
        double resultado = potencia(2.8, 3.3);
        System.out.println("El resultado de elevar 2.8 a la 3.3 es: " + resultado);
    }
    
    public static double potencia(double a, double b) {
        double resultado = Math.pow(a, b);
        return resultado;
    }

}
