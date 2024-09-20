package com.example;

public class Bebida {
    private String marca;
    private Float cantidadDeAgua;
    private Float precioAgua;
    private int cantidadUnidades;

    public Bebida(Float precioAgua, Float cantidadDeAgua, String marca,int cantidadUnidades) {
        this.cantidadDeAgua = cantidadDeAgua;
        this.marca = marca;
        this.precioAgua = precioAgua;
        this.cantidadUnidades = cantidadUnidades;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public void setCantidadDeAgua(Float cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }

    public Float getPrecioAgua() {
        return precioAgua;
    }

    public void setPrecioAgua(Float precioAgua) {
        this.precioAgua = precioAgua;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public void servirAgua(){
        this.cantidadDeAgua -= 250.00f;
        System.out.println("La maquina sirvio una cantidad de agua: 250.00ml");
        System.out.println("Cantidad de agua restante: " + cantidadDeAgua + "ml");
    }

    public Float precioUnidadDeAgua(Float cantidadDeAgua){
        return precioAgua = cantidadDeAgua * 0.35f;
    }

    public Float totalPrecioAgua(Float precioAgua){
        return cantidadUnidades * (precioUnidadDeAgua(cantidadDeAgua));
    }
} 
 