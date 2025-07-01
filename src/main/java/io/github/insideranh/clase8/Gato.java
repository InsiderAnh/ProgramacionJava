package io.github.insideranh.clase8;

public class Gato extends Animal {

    @Override
    public void sonido() {
        System.out.println("El sonido es Meow Meow");
    }

    @Override
    public void comer() {
        System.out.println("Gato comer");
    }

    @Override
    public void beber() {
        System.out.println("Gato bebe");
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

}
