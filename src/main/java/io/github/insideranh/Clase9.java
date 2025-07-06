package io.github.insideranh;

import java.util.ArrayList;

public class Clase9 {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        ArrayList<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");

        for (String s : array) {
            System.out.println(s);
        }

        for (String s : lista) {
            System.out.println(s);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hola " + i);
        }

        int i = 1;
        int contador = 0;
        while (contador <= 10) {
            i++;
            if (i % 2 != 0) {
                System.out.println("Impar " + i);
                break;
            }

            System.out.println("Par " + i);
            contador++;
        }

        int j = 0;
        do {
            System.out.println("Do while ejecutado");
            j++;
        } while (j <= 2);
    }

}
