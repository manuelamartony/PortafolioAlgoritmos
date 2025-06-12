package org.example;
public class Main {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String frase = "Hola mundo maravilloso y espectacular";
        int totalPalabras = contador.contarPalabras(frase);
        System.out.println("Cantidad de palabras: " + totalPalabras);
        int vocales = contador.ContadorVocales(frase);
        System.out.println("Cantidad de vocales: " + vocales);
    }
}
