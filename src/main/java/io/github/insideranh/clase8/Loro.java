package io.github.insideranh.clase8;

public class Loro extends Animal implements Volador {

    @Override
    public void sonido() {
        System.out.println("El sonido es Roar Roar");
    }

    @Override
    public void comer() {
        System.out.println("Loro comer");
    }

    @Override
    public void beber() {
        System.out.println("Loro bebe");
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

    @Override
    public void volar() {
        System.out.println("El loro vuela");
    }

}
