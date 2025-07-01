package io.github.insideranh;

import io.github.insideranh.clase7.Ciudad;

public class Clase7 {

    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Lima", "Peru", 1000000);

        System.out.println(ciudad.getNombre() + " " + ciudad.getPais() + " " + ciudad.getPoblacion());

        ciudad.setPoblacion(2000000);

        System.out.println(ciudad.getNombre() + " " + ciudad.getPais() + " " + ciudad.getPoblacion());
    }

}
