package org.example;

public enum NivelDificultad {
    FACIL,MEDIO,DIFICIL,EXPERTO;

    public String Mensaje() {
        switch (this) {
            case FACIL:
                return "Has elegido el nivel fácil: perfecto para principiantes.";
            case MEDIO:
                return "Has elegido el nivel medio: un desafío moderado.";
            case DIFICIL:
                return "Has elegido el nivel difícil: ¡solo para valientes!";
            default:
                return "Dificultad desconocida.";

        }
    }
}
