package io.github.insideranh.clase8;

public class Tucan extends Animal implements Volador, Fiel {

    @Override
    public void sonido() {
        System.out.println("El sonido es Roar Roar");
    }

    @Override
    public void comer() {
        System.out.println("Tucan comer");
    }

    @Override
    public void beber() {
        System.out.println("Tucan bebe");
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

    @Override
    public void volar() {
        System.out.println("El Tucan vuela");
    }

    @Override
    public void fiel() {
        System.out.println("El Tucan fiel");
    }
}
