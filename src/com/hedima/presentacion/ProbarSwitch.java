package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarSwitch {

    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingrese el estado civil:");
//        String estadoCivil = teclado.next();
//        switch (estadoCivil) {
//            case "S":
//                System.out.println("Soltero");
//                break;
//            case "V":
//                System.out.println("Viudo");
//                break;
//            case "D":
//                System.out.println("Divorciado");
//                break;
//            case "C":
//                System.out.println("Casado");
//                break;
//            default:
//                System.out.println("Estado no válido");
//                break;
//        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una nota:");
        int nota= teclado.nextInt();
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5,6,7:
                System.out.println("Suficiente");
                break;
            case 8:
                System.out.println("Bien");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota no válida");
                break;
        }



    }
}
