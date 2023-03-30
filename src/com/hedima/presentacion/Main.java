package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        //Decir si un número está entre 0 y 100
        int numero=-101;
        if(numero>=0 && numero<=100){
            System.out.println("El numero está entre 0 y 100");
        }else{
            System.out.println("El numero no está entre 0 y 100");
        }
        //Los artículos raton y teclado tienen el 10% de descuento
         String nombreArticulo= "Raton";
        double descuento=0.1, precio= 20;
        if(nombreArticulo.equalsIgnoreCase("raton") || nombreArticulo.toLowerCase().equals("teclado")){
            System.out.println("El descuento es: "+descuento*precio);
        }else{
            System.out.println("No tiene descuento");
        }


    }
}