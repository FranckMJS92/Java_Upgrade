package com.ejercicios.entregables;

public class Comparador_edades_y_descuento {

	public static void main(String[] args) {
		int e1 = 18 , e2 = 17 , e3 = 16 , e4 = 15;
		double precio = 22.5;
		int dcto = 20;
		int i = 0;
		System.out.println("Las edades de los compradores son: "+e1+", "+e2+", "+e3+", "+e4);
		if (e1 > 18) i++;
		//else i=i+0;
		if (e2 > 18) i++;
		//else i=i+0;
		if (e3 > 18) i++;
		//else i=i+0;
		if (e4 > 18) i++;
		else i=i+0;
		
		if (i>2) {
			System.out.println("Aplica descuento!");
			// El casting de int a double es implicito
			precio = precio-precio*(dcto)/100;
			System.out.println("El nuevo precio es : "+precio);
		} else {
			System.out.println("No aplica descuento =(");
			System.out.println("Precio final = "+precio);
		}
		
	}

}
