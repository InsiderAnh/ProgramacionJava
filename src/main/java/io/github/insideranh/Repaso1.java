package io.github.insideranh;

import java.util.Scanner;

public class Repaso1 {

    public static void main(String[] args) {
        /*
        Crea un programa que solicite al usuario su nombre y su edad
        y muestre en pantalla su nombre y a que categoría de edad pertenece
        tambien indica si es mayor de edad o menor de edad.

        Anotaciones:
        - Usa un metodo con retorno para ver a que categoria pertenece
        - Usa un metodo con retorno para ver si es mayor de edad o menor de edad
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");

        String nombre = scanner.nextLine();
        System.out.println("Escribe tu edad:");

        int edad = Integer.parseInt(scanner.nextLine());

        String categoria = obtenerCategoria(edad);
        String esMayor = obtenerMayorEdad(edad);

        System.out.println("Hola " + nombre);
        System.out.println("Tienes: " + edad + " años");
        System.out.println("Perteneces a la categoria: " + categoria);
        System.out.println("Y eres: " + esMayor);
    }

    private static String obtenerCategoria(int edad) {
        if (edad >= 65) {
            return "Adulto mayor";
        }
        if (edad >= 30) {
            return "Adulto";
        }
        if (edad >= 18) {
            return "Joven";
        }
        if (edad >= 13) {
            return "Adolescente";
        }
        return "Niño";
    }

    static String obtenerMayorEdad(int edad) {
        if (edad >= 18) {
            return "Mayor edad";
        }
        return "Menor edad";
    }

}