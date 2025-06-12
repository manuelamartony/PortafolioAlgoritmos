package org.example;
public class EJ5 {
    class Contador {
        public final int MAX_COUNT = 50;
        public int contador = 1;
        public int incremento = 1;
        public void displayCount(){
            while(contador <= MAX_COUNT){
                System.out.println(contador);
                contador+=incremento;
            }
        }

    }

    public void main(String[] args) {
        Contador contador = new Contador();
        contador.displayCount();
    }
}

