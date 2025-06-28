package io.github.insideranh;

import java.util.ArrayList;
import java.util.Arrays;

public class Clase4 {

    public static void main(String[] args) {
        // tipo[] nombres = {};

        //                     0,       1,       2
        String[] nombres = {"Andres", "Paolo", "Pepe"};
        int[] edades = {15, 20, 25};

        nombres[0] = "Tito";

        System.out.println(Arrays.toString(nombres));
        System.out.println(nombres[1]);

        System.out.println("Edad pepe: " + edades[2]);

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Andres");
        listaNombres.add("Paolo");
        listaNombres.add("Pepe");
        listaNombres.add("Tito");

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(15);
        listaNumeros.add(20);
        listaNumeros.add(25);
        listaNumeros.add(30);

        // Double
        // Float
        // Long

        System.out.println(listaNombres);
        System.out.println(listaNumeros);
    }

}
