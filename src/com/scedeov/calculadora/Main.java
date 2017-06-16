package com.scedeov.calculadora;

public class Main {

    public static void main(String[] args) {
	Fraccion f1 = new Fraccion();
	f1.setNumerador(3);
	f1.setDenominador(4);

	Fraccion f2 = new Fraccion();
	f2.setNumerador(6);
	f2.setDenominador(4);

	Operaciones operacion = new Operaciones(f1,f2);
	System.out.println("Sumando fracciones...");
	System.out.println(operacion.sumar().toString());
	System.out.println("Restando fracciones...");
	System.out.println(operacion.restar().toString());


    }
}
