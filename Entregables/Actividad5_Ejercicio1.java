package Entregables;

import java.util.Arrays;

public class Actividad5_Ejercicio1 {

    /*Ejercicio 1: Sobrecarga de Funciones para Media, Moda y Mediana.
    *
    *Descripción: Crea un programa que implemente una función sobrecargada llamada "calcular" 
    *que realice las siguientes operaciones dependiendo del tipo de parámetro recibido:
    *
    *Media (int[]): Calcula la media de un arreglo de números enteros.
    *Moda (double[]): Encuentra el valor más frecuente en un arreglo de números decimales.
    *Mediana (String[]): Determina la mediana (orden alfabético) de un arreglo de cadenas.
    *
   * Requisitos:
    *
    *Implementa tres versiones de la función "calcular" para manejar enteros, decimales y cadenas.
    *Muestra ejemplos para cada caso.
     */

     /*
     *---------------------------------------------------------------------------------------------------------------------------
     Commit: Se graban los cambios hechos en el proyecto de forma local, 
     estos cambios no se ven reflejados en el repositorio de forma inmediata, para ello se debe hacer un push.
     Push: Se cargan los cambios hechos en el proyecto y grabados de forma loca al repositorio git.
     De este modo los cambios realizados ahora pueden ser vistos por todos aquellos que tengan acceso al repositorio git.
     Pull: Se cargan al equipo (local) los cambios hecho por ti u otros usuarios que empleen el repositorio
     y que no se encuentren reflejados en mi equipo. Entiendo que ya sea que hayan o no cambios en el archivo del repositorio, se carga
     el archivo tal como se encuentra en ese momento en el repositorio a mi equipo para trabajarlo.
      *--------------------------------------------------------------------------------------------------------------------------
      */

    public static void main(String[] args) {
        int[] enteros = {1, 20, 10, 5};
        double [] decimales = {1.1, 1, 5, 6, 6.2, 7,9, 5, 5.2, 5.2, 5.2, 3, 10, 73};
        String [] cadenas = {"hola","adios","calcula","calcio"};
        System.out.println(calcular(enteros));
        System.out.println(calcular(decimales));
        System.out.println(calcular(cadenas));
    }

    //Media
    public static int calcular(int[] i){
        //Si el arreglo esta vacio retorna cero
        if(i.length == 0) return 0; 
        
        int suma = 0;
        byte count=0;

        for (int num : i){
            suma += num;
            count++;
        }
        return suma/count;
    }

    //Moda
    public static double calcular(double[] d){
        //Si el arreglo esta vacio retorna cero
        if(d.length == 0) return 0; 

        double moda=0;
        byte rep=0;
        byte cantRep=0;

        for(byte i=0;i<d.length;i++) {
            for(byte j=0;j<d.length;j++) {
            if(d[i]==d[j]) cantRep++;
            }
            if(cantRep>rep) moda=d[i];
            rep=cantRep;
            cantRep=0;
        }
        return moda;
    }

    //Mediana
    public static String calcular(String[] s){
        String mediana="";
        //Convierte las cadenas a minusculas
        for (byte i=0;i<s.length;i++){
            s[i].toLowerCase();
        }

        //Si el array esta vacio devuelve cero
        if(s.length==0) return "";
        
        //Ordena alfabeticamente el array String
        Arrays.sort(s);

        //Calculo si el tamaño del array es impar, entonces la mediana se encuentra en el medio
        //El calculo seria (tamaño del array -1/ 2)
        if(s.length%2!=0) mediana= s[(s.length-1)/2];

        //Si el tamaño del array es par, el medio puede tener 2 posibilidades.
        //Para ello se compara para saber cual es el mayor por ASCII
        if(s.length%2==0){
            if (s[(s.length/2)-1].compareTo(s[s.length/2])==0){
                mediana= s[s.length/2];
            }
            else if(s[(s.length/2)-1].compareTo(s[s.length/2])<0){
                mediana= s[(s.length/2)-1];
            }
            else if(s[(s.length/2)-1].compareTo(s[s.length/2])>0){
                mediana= s[s.length/2];
            }
        }
        return mediana;
    }
}