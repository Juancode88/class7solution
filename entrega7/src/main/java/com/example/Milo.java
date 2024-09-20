package com.example;

public class Milo extends Bebida {
    private Float miloDeMaquina;
    private Float cantidadDeMilo;
    private Float precioDelMilo;

     public Milo(Float precioAgua, Float cantidadDeAgua, String marca, Float cantidadDeMilo, Float precioDelMilo, 
            Float miloDeMaquina,int cantidadUnidades) {
            super(precioAgua, cantidadDeAgua, marca,cantidadUnidades);
            this.miloDeMaquina = miloDeMaquina;
            this.cantidadDeMilo = cantidadDeMilo;
            this.precioDelMilo = precioDelMilo;
    }

    public Float getMiloDeMaquina() {
        return miloDeMaquina;
    }

    public void setMiloDeMaquina(Float miloDeMaquina) {
        this.miloDeMaquina = miloDeMaquina;
    }

    public Float getCantidadDeMilo() {
        return cantidadDeMilo;
    }

    public void setCantidadDeMilo(Float cantidadDeMilo) {
        this.cantidadDeMilo = cantidadDeMilo;
    }

    public Float getPrecioDelMilo() {
        return precioDelMilo;
    }

    public void setPrecioDelMilo(Float precioDelMilo) {
        this.precioDelMilo = precioDelMilo;
    }

    public void servirMiloPorUnidad(int cantidadUnidades){
        if (miloDeMaquina >= 70) {
            System.out.println("La maquina sirvio una cantidad de milo de 70 g por cada unidad");
            for (int i = 1; i <= cantidadUnidades + 1; i++){
                miloDeMaquina -= 70.00f;
                if (miloDeMaquina < 70) {
                    System.out.println("La maquina sirvio una cantidad de milo menor a la requerida, porque el sudminitro de milo necesita ser llenado");
                }
            } 
            System.out.println("Cantidad de cacao restante: " + miloDeMaquina + "g");
        } else if (miloDeMaquina > 0 && miloDeMaquina < 70) {
            System.out.println("La maquina sirvio una cantidad de  menor a la requerida, porque el sudminitro de milo necesita ser llenado");
        } else {
            System.out.println("El sudminitro de milo esta vacio.");
        }
    }


    public float precioDelMilo( Float cantidadDeMilo){
        return cantidadDeMilo * 0.70f;      
    }

    public Float precioUnidadDeMilo(Float cantidadDeMilo, Float precioAgua) {
        return precioDelMilo(cantidadDeMilo) + precioAgua;
    }

    public Float totalPrecioDelMilo(Float precioAgua,int cantidadUnidades){
        return cantidadUnidades * (precioDelMilo(cantidadDeMilo) + precioUnidadDeAgua(cantidadDeMilo));
    }
    
    public void printBilling(Float totalPrecioDelMilo) {
        if (totalPrecioDelMilo != 0) {
            String value = Float.toString(totalPrecioDelMilo);
            System.out.println("El precio a pagar es: " + value);
        } else {
            System.out.println("El precio a pagar es: 0.0");
        }
    }
}