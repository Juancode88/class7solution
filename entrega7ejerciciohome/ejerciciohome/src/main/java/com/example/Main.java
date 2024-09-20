package com.example;

public class Main {
    public static void main(String[] args) {
        Persona residenteAlice = new Persona(30, "Alice", "123 Main St", 3);
        
        Persona residenteLuis = new Persona(37, "Luis", "23c Stuttgart", 3);
        
        Habitacion habitacion = new Habitacion(residenteAlice, "123 Main St", 2);
        
        Balcon balcon = new Balcon(true, "123 Main St", 2);
        
        System.out.println("Detalles de la habitación:");
        habitacion.mostrarInfo();
        
        System.out.println("\nDetalles del balcón:");
        balcon.darInfo();
        
        System.out.println("\nDetalles del segundo residente:");
        residenteLuis.mostrarInfo();
    }  
}