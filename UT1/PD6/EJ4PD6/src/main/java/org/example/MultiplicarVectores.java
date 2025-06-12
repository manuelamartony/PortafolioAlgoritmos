package org.example;

public class MultiplicarVectores {
    public static Integer productoEscalar(int[] vector1, int[] vector2) {
        // Verifica si los vectores son nulos
        if (vector1 == null || vector2 == null) {
            return null;
        }

        // Verifica si los vectores tienen la misma longitud
        if (vector1.length != vector2.length) {
            return null;
        }

        // Hace el producto escalar
        int resultado = 0;
        for (int i = 0; i < vector1.length; i++) {
            resultado += vector1[i] * vector2[i];
        }

        return resultado;
    }
    public static void main(String[] args) {
        // Ejemplo 1: Vectores que se pueden multiplicar
        int[] v1 = {1, 2, 3};
        int[] v2 = {4, 5, 6};

        Integer resultado = productoEscalar(v1, v2);
        if (resultado != null) {
            System.out.println("El producto escalar de los vectores es: " + resultado);
        } else {
            System.out.println("Los vectores no se pueden multiplicar");
        }

        // Ejemplo 2: Vectores de diferente longitud
        int[] v3 = {1, 2, 3};
        int[] v4 = {4, 5};

        resultado = productoEscalar(v3, v4);
        if (resultado != null) {
            System.out.println("El producto escalar de los vectores es: " + resultado);
        } else {
            System.out.println("Los vectores no se pueden multiplicar");
        }
    }
}
