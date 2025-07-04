package io.github.insideranh.clase8;

public class Perro extends Animal implements Fiel {

    @Override
    public void sonido() {
        System.out.println("El sonido es Gau Gau");
    }

    @Override
    public void comer() {
        System.out.println("Perro comer");
    }

    @Override
    public void beber() {
        System.out.println("Perro bebe");
    }

    public void ladrar() {
        System.out.println("Guau guau");
    }

    @Override
    public boolean esDomestico() {
        return true;
    }

    @Override
    public void fiel() {
        System.out.println("El perro fiel");
    }

    @Override
    public String getNombre() {
        return "";
    }

}