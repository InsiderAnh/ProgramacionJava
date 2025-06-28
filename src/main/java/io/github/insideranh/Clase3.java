package io.github.insideranh;

public class Clase3 {

    public static void main(String[] args) {
        // if
        // if else
        // switch

        /*
        > < = != >= <=
         */

        int edad = 17;
        String diaSemana = "lunes";

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        if (edad >= 30) {
            System.out.println("Eres adulto.");
        } else if (edad >= 18) {
            System.out.println("Eres joven.");
        } else if (edad >= 11) {
            System.out.println("Eres adolescente.");
        } else {
            System.out.println("Eres niño.");
        }

        switch (diaSemana) {
            case "lunes": {
                System.out.println("Es un dia pesado.");
                break;
            }
            case "martes": {
                System.out.println("Es un dia pasajero.");
                break;
            }
            default: {
                System.out.println("Es un dia normal.");
                break;
            }
        }

        System.out.println("No estoy dentro de la condición.");
    }

}
