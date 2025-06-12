package org.example;

public class ContadorDeNumeros {
    public static void main(String[] args) {
        NumberHolder contenedor = new NumberHolder();
        contenedor.aFloat = 3.14f;
        contenedor.anInt = 67;
        System.out.println("valor de anInt" + contenedor.anInt);
        System.out.println("valor de anFloat" + contenedor.aFloat);

    }
}
