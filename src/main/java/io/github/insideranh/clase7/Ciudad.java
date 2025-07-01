package io.github.insideranh.clase7;

public class Ciudad {

    private String nombre;
    private String pais;
    private int poblacion;

    public Ciudad(String nombre, String pais, int poblacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

}