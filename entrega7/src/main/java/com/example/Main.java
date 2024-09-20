package com.example;

public class Main { 
    public static void main(String[] args) {
        Milo milo = new Milo(10.0f, 200.0f, "Milo", 290.0f, 200.0f, 200.0f, 2);
        Tinto tinto = new Tinto(10.0f, 200.0f, "Tinto", 200.0f, 44.0f, 200.0f, 2);
        Chocolate chocolate = new Chocolate(50.0f, 200.0f, "Chocolate", 250.0f, 10.0f, 200.0f, 2);

        System.out.println("Testing servir methods:");
        milo.servirMiloPorUnidad(1);
        tinto.servirCafe(1);
        chocolate.servirChocolatePorUnidad(1);

        System.out.println("\nTesting pricing methods:");
        Float precioAgua = 0.35f; // define the precioAgua value
        Float precioMilo = milo.totalPrecioDelMilo(precioAgua, 1);
        Float precioTinto = tinto.totalPrecioTinto(44.0f, 1);
        Float precioChocolate = chocolate.totalPrecioChocolate(50.0f, 1);

        milo.printBilling(precioMilo);
        tinto.printBilling(precioTinto);
        chocolate.printBilling(precioChocolate);
    } 
}
