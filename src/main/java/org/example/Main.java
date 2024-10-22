package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double suma = Calculadora.suma(5,3);
        double resta = Calculadora.resta(5,3);

        System.out.println("La suma es de: " + suma);
        System.out.println("La resta es de: " + resta);
    }
}