package org.example;

public class EJ5Parte6 {

    public class Contador {
        public final int MAX_COUNT = 50;
        public int contador = 1;
        public int incremento = 1;
        public void displayCount(){
            for (;contador <=MAX_COUNT;contador += incremento){
                System.out.println(contador);
            }
        }
        public void main(String[] args) {

            Contador contador = new Contador();
            contador.displayCount();
        }

    }

}
