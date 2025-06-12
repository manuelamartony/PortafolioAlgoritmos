package org.example;

public class Potencia {

    public int Potencia(int numero, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        else if (exponente > 0) {
            return numero * Potencia(numero, exponente - 1);
        }
        else {
            if (numero == 0) {
                throw new ArithmeticException("No se puede elevar 0 a un exponente negativo (división por cero)");
            }

            return 1 / (numero * Potencia(numero, -exponente - 1));
        }
    }

    public static void main(String[] args) {
        Potencia p = new Potencia();
        try {
            System.out.println(p.Potencia(5, 3));   // Si ambos son positivos devuelve un numero positivo
            System.out.println(p.Potencia(5, -3));  // Se redondea a 0
            System.out.println(p.Potencia(-5, -3)); // Se redondea a 0
            System.out.println(p.Potencia(-5, 2));  // Base devuelve un numero positivo
            System.out.println(p.Potencia(-5, 1));  // Devuelve un numero negativo
            System.out.println(p.Potencia(-5, 0));  // Devuelve 1
            System.out.println(p.Potencia(0, -1));  // Lanza excepcion
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
Funcion Potencia
COM
    SI exponente = 0 ENTONCES
        Devolver 1
    FIN SI
    SINO SI exponente > 0 ENTONCES
        Devolver numero * Potencia(numero,exponente -1)
    FIN SINO
    SINO
        SI numero = 0 ENTONCES
            EXCEPCION
        FIN SI
        DEVOLVER 1/(numero * Potencia(numero, -exponente - 1))
   FIN SINO
FIN

 */