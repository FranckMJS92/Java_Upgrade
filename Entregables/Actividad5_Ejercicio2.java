package Entregables;

import java.util.Scanner;

public class Actividad5_Ejercicio2 {
    /*Escribe un programa que calcule las combinaciones posibles de n elementos tomados de k en k utilizando recursividad. 
    * Una combinación es un subconjunto de tamaño k extraído de un conjunto den elementos.
    * Requisitos:
    * 1. El usuario debe ingresar n(el tamaño del conjunto) y k(el tamaño del subconjunto).
    * 2. Usa recursividad para calcular eñ numero total de combinaciones.
    * 3. Muestra el numero total del combinaciones posibles.
    */
    public static void main(String[] args) {
        byte conjunto=0;
        byte subConjunto=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamaño del conjunto: ");
        conjunto =scan.nextByte();
        System.out.println("Ingrese tamaño del subconjunto: ");
        subConjunto =scan.nextByte();
        System.out.println("El total de combinaciones para los parametros ingresados es:"+combinaciones(conjunto,subConjunto));
        scan.close();
    }

    public static int combinaciones(int n, int k){
        if(k==0 || n==k ) return 1;
        if(k==1) return n;
        return combinaciones(n-1, k-1)+combinaciones(n-1,k);
    }
}