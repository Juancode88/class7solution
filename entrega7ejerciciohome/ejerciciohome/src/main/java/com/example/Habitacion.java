package com.example;

public class Habitacion extends Casa {
    private Persona residente;

    public Habitacion(Persona residente, String direccion, int numeroDeHabitaciones) {
        super(direccion, numeroDeHabitaciones);
        this.residente = residente;
    }

    public Persona getResidente() {
        return residente;
    }

    public void setResidente(Persona residente) {
        this.residente = residente;
    }

    public void mostrarInfo() { 
        super.pantallaInfo(); 
        System.out.println("Detalles del residente:");
        residente.mostrarInfo();  
    }  
}
