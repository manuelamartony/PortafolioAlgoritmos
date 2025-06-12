package org.example;

public class Main {
    public static void main(String[] args) {
        imprimirTablero(7,7);

    }
    public static void imprimirTablero(int largo, int ancho){
        for (int i = 0; i < largo; i++){ //iteración del largo
            for (int j = 0; j < ancho; j++){ // iteración del ancho
                System.out.print("#");
            }
            System.out.println();//salta de renglon
        }
    }
}