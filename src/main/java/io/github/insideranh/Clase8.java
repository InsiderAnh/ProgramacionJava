package io.github.insideranh;

import io.github.insideranh.clase8.*;

import java.util.ArrayList;

public class Clase8 {

    public static void main(String[] args) {
        // sonido
        // comer
        // beber

        // volar
        // arrastrar
        // ladrar

        // esDomestico

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Loro());

        for (Animal animal : animales) {
            if (animal instanceof Gato) {
                System.out.println("Es un Gato");
            } else if (animal instanceof Perro) {
                System.out.println("Es un Perro");
            } else if (animal instanceof Volador) {
                Volador volador = (Volador) animal;
                volador.volar();
                System.out.println("Es un Volador");
            }
        }
    }

}
