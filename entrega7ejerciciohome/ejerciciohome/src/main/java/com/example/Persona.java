package com.example;

public class Persona extends Casa {
    private String nombre;
    private int edad;

    public Persona(int edad, String nombre, String direccion, int numeroDeHabitaciones) {
        super(direccion, numeroDeHabitaciones);
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    } 

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo() { // Corrected from 'posterInfo' to 'mostrarInfo'
        super.pantallaInfo(); 
        System.out.println("Nombre del residente: " + getNombre());
        System.out.println("Edad del residente: " + getEdad());
    } 
}
