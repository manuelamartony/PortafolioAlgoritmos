package org.example;

public class EJ3 {
    public class Multsuma {
        private double primernum = 1;
        private double segundonum = 2;
        private double tercernum= 3;

        public double multsum (){
            double resultado = primernum * segundonum + tercernum ;
            return resultado;
        }
        public static void main(String[] args) {
            org.example.Multsuma multsum = new org.example.Multsuma();
            double resultado = multsum.multsum();
            System.out.println(resultado);
        }
    }


}
