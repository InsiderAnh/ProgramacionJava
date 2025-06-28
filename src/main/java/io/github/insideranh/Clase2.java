package io.github.insideranh;

public class Clase2 {

    public static void main(String[] args) {
        /*
        modificador tipoDeRetorno nombreDelMetodo(parametros) {

        }

        public,
        private,
        protected

        static,

        void
         */

        saludar();
        int resultado = sumarNumeros();
        double resultadoSuma = sumar(10.0, 20);
        String frase = nombresApellidos("Pedrito", "Benites", 24);

        System.out.println("Resultado: " + resultado);
        System.out.println("Frase: " + frase);
        System.out.println("Resultado suma: " + resultadoSuma);
    }

    public static void saludar() {
        System.out.println("Hola, soy el metodo Saludar.");
    }

    public static int sumarNumeros() {
        return 5 + 5;
    }

    public static double sumar(double numero1, int numero2) {
        return numero1 + numero2;
    }

    public static String nombresApellidos(String nombre, String apellido, int edad) {
        return "El nombre es: " + nombre + " " + apellido + " " + edad;
    }

    public void creacion() {
        destruir();
    }

    public void destruir() {

    }

}
