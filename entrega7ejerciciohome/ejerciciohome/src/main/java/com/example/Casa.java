package com.example;

public class Casa {
    private String direccion;
    private int numeroDeHabitaciones;

    public Casa(String direccion, int numeroDeHabitaciones) {
        this.direccion = direccion;
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public String getDireccion() {
        return direccion; 
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public void pantallaInfo() {
        System.out.println("Address: " + getDireccion());
        System.out.println("Number of Rooms: " + getNumeroDeHabitaciones());
    } 
}