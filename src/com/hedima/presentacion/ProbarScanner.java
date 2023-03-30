package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {

//        //Declarar una variable primitiva
//        int numero = 10;
//        //Declara un objeto Scanner
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un numero->");
//        numero = sc.nextInt();
//        System.out.println("El numero es: " + numero);

//        String nombre = ("Juan");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese su nombre->");
//        nombre= sc.next();
//        if (nombre.equals("Juan")) {
//            System.out.println("Te damos la bienvenida :" + nombre );
//        } else {
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("ingrese dos numeros:");
//        int numero1 = sc.nextInt();
//        int numero2 = sc.nextInt();
//
//        if (numero1 == numero2) {
//            System.out.println("Los numeros son iguales: ");
//        } else {
//            System.out.println("Los numeros no son iguales: ");
//        }

//      Pedir doss números y decir cual es el mayor

        Scanner sc = new Scanner(System.in);
//        System.out.println("ingrese dos numeros:");
//        int numero1 = sc.nextInt();
//        int numero2 = sc.nextInt();
//
//        if (numero1 > numero2) {
//            System.out.println(numero1 +": Es mayor");
//        } else {
//            System.out.println(numero1 +": Es menor ");
//        }
//        System.out.println("Numero 1:");
//        int numero1 = sc.nextInt();
//        System.out.println("Numero 2:");
//        int numero2 = sc.nextInt();
//        if (numero1 == numero2) {
//            System.out.println("Los numeros son iguales");
//        } else if(numero1 > numero2) {
//            System.out.println(numero1+ " :Es mayor");
//        } else {
//            System.out.println(numero1+ " :Es menor");
//        }
//        //Pedir dos numeros y ordenarlos de mayor a menor
//        System.out.println("Numero 1:");
//        numero1 = sc.nextInt();
//        System.out.println("Numero 2:");
//        numero2 = sc.nextInt();
//        if (numero1 > numero2) {
//            System.out.println(numero1 +": Es mayor");
//            System.out.println(numero2 +": Es menor");
//        } else if(numero1 < numero2) {
//            System.out.println(numero2+ " :Es mayor");
//            System.out.println(numero1 +": Es menor");
//        }

        System.out.println("Escriba el primer número:");
        int numero1 = sc.nextInt();
        System.out.println("Escriba el segundo número:");
        int numero2 = sc.nextInt();
        if(numero1>numero2) {
            System.out.println(numero1 + " ," + numero2);
        }else{
            System.out.println(numero2 + "," + numero1);
        }


    }

}
