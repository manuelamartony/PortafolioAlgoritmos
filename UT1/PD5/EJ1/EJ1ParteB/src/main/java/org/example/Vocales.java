package org.example;

public enum Vocales {
    A, E, I, O, U;

    public static boolean esVocal(char letra) {
        letra = Character.toUpperCase(letra); // Convertir a mayúscula para comparación
        for (Vocales vocal : Vocales.values()) {
            if (vocal.name().charAt(0) == letra) {
                return true;
            }

        }
        return false;
    }
}