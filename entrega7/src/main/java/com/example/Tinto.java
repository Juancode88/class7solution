package com.example;

public class Tinto extends Bebida {
    private Float cafeDeCafetera;
    private Float cantidadDeCafe;
    private Float precioDelCafe;


    public Tinto(Float precioAgua, Float cantidadDeAgua, String marca, Float cantidadDeCafe, Float precioDelCafe, Float cafeDeCafetera,int cantidadUnidades) {
        super(precioAgua, cantidadDeAgua, marca,cantidadUnidades);
        this.cafeDeCafetera = cafeDeCafetera;
        this.cantidadDeCafe = cantidadDeCafe;
        this.precioDelCafe = precioDelCafe;
    }

    public Float getCafeDeCafetera() {
        return cafeDeCafetera;
    }

    public void setCafeDeCafetera(Float cafeDeCafetera) {
        this.cafeDeCafetera = cafeDeCafetera;
    }

    public Float getCantidadDeCafe() {
        return cantidadDeCafe;
    }

    public void setCantidadDeCafe(Float cantidadDeCafe) {
        this.cantidadDeCafe = cantidadDeCafe;
    }

    public Float getPrecioDeCafe() {
        return precioDelCafe;
    }

    public void setPrecioDeCafe(Float precioDelCafe) {
        this.precioDelCafe = precioDelCafe;
    }

    public void servirCafe(int cantidadUnidades) {
        if (cafeDeCafetera >= 44) {
            System.out.println("La maquina sirvio una cantidad de cafe 44 g por unidad");
            for (int i = 1; i <= cantidadUnidades + 1; i++){
                cafeDeCafetera -= 44.00f;
                if (cafeDeCafetera < 44) {
                    System.out.println("La maquina sirvio una cantidad de cafe menor a la requerida, porque la cafetera necesita ser llenada");
                }
            }
            System.out.println("Cantidad de cafe restante: " + cafeDeCafetera + "g");
        } else if (cafeDeCafetera > 0 && cafeDeCafetera < 44) {
            System.out.println("La maquina sirvio una cantidad de cafe menor a la requerida, porque la cafetera necesita más sudministro");
        } else {
            System.out.println("La cafetera esta vacia.");
        }
    } 

    public Float precioDelCafe(Float cantidadDeCafe) {
        return cantidadDeCafe * 0.44f;
    }

    public Float precioUnidadTinto(Float cantidadDeCafe, Float precioAgua) {
        return precioDelCafe + precioAgua;
    }

    public Float totalPrecioTinto(Float precioAgua, int cantidadUnidades){
        return cantidadUnidades * (precioDelCafe(cantidadDeCafe) + precioUnidadDeAgua(cantidadDeCafe));
    }

    public void printBilling(Float totalPrecioTinto) {
        if (totalPrecioTinto != 0) { 
            String value = Float.toString(totalPrecioTinto);
            System.out.println("El precio a pagar es: " + value);
        } else {
            System.out.println("El precio a pagar es: 0.0");
        }
    }
}