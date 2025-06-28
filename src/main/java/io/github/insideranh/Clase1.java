package io.github.insideranh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase1 {

    public static void main(String[] args) {
        // -128 a 127
        byte vacunas = 10;
        // -32768 a 32,767
        short stockProductos = 1000;
        // -2,147,483,648 a 2,147,483,647
        int stockPedidos = 1000000;
        // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        long id = 1000000000000000000L;

        // Tipo de variable, nombre del campo = valor;

        float precio = 10.5f;
        double total = 1000.52214;

        char letra = 'A';
        String nombre = "InsiderAnh";

        boolean activo = true;

        // Imprimir por consola

        System.out.println("Vacunas: " + vacunas);
        System.out.println("Stock Productos: " + stockProductos);
        System.out.println("Stock Pedidos: " + stockPedidos);
        System.out.println("ID: " + id);

        System.out.println("Precio: " + precio);
        System.out.println("Total: " + total);

        System.out.println("Letra: " + letra);
        System.out.println("Nombre: " + nombre);

        System.out.println("Activo: " + activo);

        // Imprimir por consola
    }

}