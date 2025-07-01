package io.github.insideranh;

import io.github.insideranh.clase8.Animal;
import io.github.insideranh.clase8.Gato;
import io.github.insideranh.clase8.Perro;

public class Clase8 {

    public static void main(String[] args) {
        // sonido
        // comer
        // beber

        // volar
        // arrastrar
        // ladrar

        // esDomestico

        Perro perro = new Perro();
        perro.sonido();
        perro.comer();
        perro.beber();

        perro.ladrar();

        Animal gato = new Gato();
        gato.sonido();
        gato.comer();
        gato.beber();


    }

}
