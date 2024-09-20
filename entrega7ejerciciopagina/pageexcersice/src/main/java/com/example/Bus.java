package com.example;

public class Bus extends TransportePublico { 
    private int capacidad;

    public Bus(int capacidad, String ruta, String tipo) {
        super(tipo, ruta); // Corrected the order of arguments in the super constructor call
        this.capacidad = capacidad; 
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double calcularTarifaBus() {
        double tarifaBaseBus = 2.0;
        double costoPorPasajero = 0.3;
        double tarifaTotal = tarifaBaseBus + (costoPorPasajero * getCapacidad());
        return tarifaTotal;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de Transporte: " + getTipo());
        System.out.println("Ruta: " + getRuta());
        System.out.println("Capacidad: " + getCapacidad() + " pasajeros");
        System.out.println("Tarifa: " + calcularTarifaBus());
        System.out.println("Distancia Recorrida: " + getDistanciaRecorrida() + " km");
        System.out.println("Tiempo Recorrido: " + getTiempoRecorrido() + " minutos");
    }

}