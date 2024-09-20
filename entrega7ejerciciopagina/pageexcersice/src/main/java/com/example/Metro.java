package com.example;

public class Metro extends TransportePublico { 
    private int numeroEstaciones; 

    public Metro(int numeroEstaciones, String ruta, String tipo) {
        super(tipo, ruta); // Corrected the order of arguments in the super constructor call
        this.numeroEstaciones = numeroEstaciones;
    }

    public int getNumeroEstaciones() {
        return numeroEstaciones;
    }

    public void setNumeroEstaciones(int numeroEstaciones) {
        this.numeroEstaciones = numeroEstaciones;
    }

    public double calcularTarifaMetro() {
        double tarifaBaseMetro = 1.0;
        double costoPorEstacion = 0.2;
        double tarifaTotal = tarifaBaseMetro + (costoPorEstacion * getNumeroEstaciones());
        return tarifaTotal;
    }

    public void mostrarMapa() {
        System.out.println("Mostrando mapa de la ruta: " + getRuta());
        System.out.println("Número de estaciones en esta ruta: " + getNumeroEstaciones());
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de transporte: " + getTipo());
        System.out.println("Ruta: " + getRuta());
        System.out.println("Número de Estaciones: " + getNumeroEstaciones());
        System.out.println("Tarifa: " + calcularTarifaMetro());
        System.out.println("Distancia Recorrida: " + getDistanciaRecorrida() + " km");
        System.out.println("Tiempo Recorrido: " + getTiempoRecorrido() + " minutos");
    }
}