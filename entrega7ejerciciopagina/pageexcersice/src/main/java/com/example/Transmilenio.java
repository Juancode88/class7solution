package com.example;

public class Transmilenio extends TransportePublico {
    private int numeroParadas;

    public Transmilenio(int numeroParadas, String ruta, String tipo) {
        super(tipo, ruta); // Corrected the order of arguments in the super constructor call
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }
 
    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public double calcularTarifaTransmilenio() {
        double tarifaBaseTransmilenio = 1.8;
        double costoPorParada = 0.25;
        double tarifaTotal = tarifaBaseTransmilenio + (costoPorParada * getNumeroParadas());
        return tarifaTotal;
    }

    public void mostrarRuta() {
        System.out.println("Mostrando ruta del Transmilenio: " + getRuta());
        System.out.println("Número de Paradas en esta ruta: " + getNumeroParadas());
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de Transporte: " + getTipo());
        System.out.println("Ruta: " + getRuta());
        System.out.println("Número de Paradas: " + getNumeroParadas());
        System.out.println("Tarifa: " + calcularTarifaTransmilenio());
        System.out.println("Distancia Recorrida: " + getDistanciaRecorrida() + " km");
        System.out.println("Tiempo Recorrido: " + getTiempoRecorrido() + " minutos");
    } 

}
