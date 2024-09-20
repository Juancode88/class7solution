package com.example;

public class Balcon extends Casa {
    private boolean tieneBalcon;

    public Balcon(boolean tieneBalcon, String direccion, int numeroDeHabitaciones) {
        super(direccion, numeroDeHabitaciones);
        this.tieneBalcon = tieneBalcon;
    }

    public boolean isTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }

    public void darInfo() { 
        super.pantallaInfo(); 
        System.out.println("¿Tiene balcón?: " + (isTieneBalcon() ? "Sí" : "No"));
    }  
}