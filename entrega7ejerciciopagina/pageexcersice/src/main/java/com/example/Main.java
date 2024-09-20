package com.example;

public class Main {
    public static void main(String[] args) { 
        Bus miBus = new Bus(30, "Ruta 10", "Bus");
        miBus.calcularDistanciaRecorrida();
        miBus.calcularTiempoRecorrido();

        System.out.println("Información del Bus:");
        miBus.mostrarInformacion();
        System.out.println();

        Metro miMetro = new Metro(12, "Línea 1", "Metro");
        miMetro.calcularDistanciaRecorrida();
        miMetro.calcularTiempoRecorrido();

        System.out.println("Información del Metro:");
        miMetro.mostrarInformacion();
        miMetro.mostrarMapa();
        System.out.println();

        Transmilenio miTransmilenio = new Transmilenio(15, "Ruta A", "Transmilenio");
        miTransmilenio.calcularDistanciaRecorrida();
        miTransmilenio.calcularTiempoRecorrido();

        System.out.println("Información del Transmilenio:");
        miTransmilenio.mostrarInformacion();
        miTransmilenio.mostrarRuta(); 
    }
}