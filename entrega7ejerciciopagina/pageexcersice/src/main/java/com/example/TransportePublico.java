package com.example;

public class TransportePublico { 
    private String tipo;
    private String ruta;
    private double tarifa;
    private double distanciaRecorrida;
    private int tiempoRecorrido;

    public TransportePublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
        this.tarifa = 0.0;
        this.distanciaRecorrida = 0.0;
        this.tiempoRecorrido = 0;
    }

    public double calcularTarifa() {
        double tarifaBase = 1.5;
        double costoPorKilometro = 0.5;
        this.tarifa = tarifaBase + (costoPorKilometro * distanciaRecorrida);
        return this.tarifa;
    }

    public double calcularDistanciaRecorrida() {
        // Implementar lógica de cálculo de distancia recorrida
        // For now, let's assume a fixed distance of 10.0 km
        this.distanciaRecorrida = 10.0;
        return this.distanciaRecorrida;
    }

    public int calcularTiempoRecorrido() {
        int velocidadPromedio = 30;
        this.tiempoRecorrido = (int) (distanciaRecorrida / velocidadPromedio) * 60;
        return this.tiempoRecorrido;
    }

    // Getters and setters for the attributes
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getTarifa() {
        return tarifa;
    } 

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public void setTiempoRecorrido(int tiempoRecorrido) {
        this.tiempoRecorrido = tiempoRecorrido;
    }

}
