package com.example;

public class Chocolate extends Bebida {
    private Float chocolateDeMaquina;
    private Float cantidadDeCacao;
    private Float precioDelChocolate;

    public Chocolate(Float precioAgua, Float cantidadDeAgua, String marca, Float cantidadDeCacao, Float precioDelChocolate, Float chocolateDeMaquina,int cantidadUnidades) {
        super(precioAgua, cantidadDeAgua, marca, cantidadUnidades);
        this.cantidadDeCacao = cantidadDeCacao;
        this.chocolateDeMaquina = chocolateDeMaquina;
        this.precioDelChocolate = precioDelChocolate;
    }

    public Float getChocolateDeMaquina() {
        return chocolateDeMaquina;
    }

    public void setChocolateDeMaquina(Float chocolateDeMaquina) {
        this.chocolateDeMaquina = chocolateDeMaquina;
    }

    public Float getCantidadDeCacao() {
        return cantidadDeCacao;
    }

    public void setCantidadDeCacao(Float cantidadDeCacao) {
        this.cantidadDeCacao = cantidadDeCacao;
    }

    public Float getPrecioDelChocolate() {
        return precioDelChocolate;
    }

    public void setPrecioDelChocolate(Float precioDeChocolate) {
        this.precioDelChocolate = precioDeChocolate;
    }

    public void servirChocolatePorUnidad(int cantidadUnidades) {
        if (chocolateDeMaquina >= 55) {
            System.out.println("La maquina sirvio una cantidad de cacao 55 g por cada unidad");
            for (int i = 1; i <= cantidadUnidades + 1; i++){
                chocolateDeMaquina -= 55.00f;
                if (chocolateDeMaquina < 55) {
                    System.out.println("La maquina sirvio una cantidad de cacao menor a la requerida, porque el sudminitro de cacao necesita ser llenado");
                }
            }
            System.out.println("Cantidad de cacao restante: " + chocolateDeMaquina + "g");
        } else if (chocolateDeMaquina > 0 && chocolateDeMaquina < 55) {
            System.out.println("La maquina sirvio una cantidad de cacao menor a la requerida, porque el sudminitro de cacao necesita ser llenado");
        } else {
            System.out.println("El sudminitro de cacao esta vacio.");
        }
    }
 
    public float precioDelChocolate(Float cantidadDeCacao) {
        return cantidadDeCacao * 0.55f;
    }

    public Float preciounidadChocolate(Float cantidadDeCacao, Float precioAgua) {
        return precioDelChocolate(cantidadDeCacao) + precioAgua;
    }

    public Float totalPrecioChocolate(Float precioAgua, int cantidadUnidades){
        return cantidadUnidades * (precioDelChocolate(cantidadDeCacao) + precioUnidadDeAgua(cantidadDeCacao));
    }

    public void printBilling(Float totalPrecioChocolate) {
        if (totalPrecioChocolate != 0) {
            String value = Float.toString(totalPrecioChocolate);
            System.out.println("El precio a pagar es: " + value);
        } else {
            System.out.println("El precio a pagar es: 0.0");
        }
    }

}