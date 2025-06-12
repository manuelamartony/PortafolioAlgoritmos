package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;


public class Ejercicio2 {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\Estudiante UCU\\Desktop\\Algoritmos\\PortafolioAlgoritmos\\numeros.txt";
        try {
            int[] arreglo = leerarchivo(archivo);
            int contador = ordenar(arreglo);
            System.out.println("Cantidad de elementos: " + arreglo.length);
            System.out.println("Cantidad de veces que se entro a if: " + contador);
            System.out.println("priemer elemento del arreglo ordenado: " + arreglo[0]);
            System.out.println("ultimo elemento del arreglo ordenado: " + arreglo[arreglo.length - 1]);
        }catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            System.out.println("Archivo buscado: " + archivo);
            System.out.println("Directorio actual: " + System.getProperty("user.dir"));
        }



    }
    public static int ordenar(int[] arreglo){
        int contador = 0;
        int N = arreglo.length;
        for (int i = 1; i< N; i++){
            for (int j = N - 1; j >= i; j--)
            {
                contador++;
                if (arreglo[j] < arreglo[j -1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = temp;
                }
            }
        }
        return contador;
    }
    public static int[] leerarchivo(String nombreArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            int N = Integer.parseInt(br.readLine());
            int[] arreglo = new int[N];

            for (int i = 0; i < N; i++) {
                arreglo[i] = Integer.parseInt(br.readLine());
            }
            return arreglo;
        }
    }

}
