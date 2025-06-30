package io.github.insideranh.clase7;

public class Comida {

    private String nombre;
    private int precio;

    public Comida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

}