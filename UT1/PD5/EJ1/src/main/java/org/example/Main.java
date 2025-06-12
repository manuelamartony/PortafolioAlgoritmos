package org.example;

public class Main {
    public static void main(String[] args) {
        //Selecciona el nivel de dificultad
        NivelDificultad dificultadSeleccionada = NivelDificultad.DIFICIL;
        //imprime la dificultad seleccionada
        System.out.println("Dificultad seleccionada: " + dificultadSeleccionada);
        System.out.println(dificultadSeleccionada.Mensaje());
        //Muestra las dificultades disponibles
        System.out.println("\nNiveles de dificultad disponibles:");
        for (NivelDificultad nivel : NivelDificultad.values()) {
            System.out.println(nivel + ": " + nivel.Mensaje());
        }
    }
}