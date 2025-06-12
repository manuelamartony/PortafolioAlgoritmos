package org.example;

public class Factorial {
    public int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(5));
        System.out.println(f.factorial(4));
        System.out.println(f.factorial(0));
        System.out.println(f.factorial(-1));

    }
}
/* PSEUDOCODIGO:

Clase Factorial (int n)
COM
    Si n = 0 Hacer  //CASO BASE  O(1)
        Devolver 1 // O(1)
    fin Si
    Devolver n * factorial(n-1) //SENTENCIA QUE LO COMPLEMENTA  0(N)
FIN
ORDEN TOTAL O(N)


¿Puedes verificar que siempre el algoritmo progresará hacia el caso base?
factorial(3)
→ 3 * factorial(2)
→ 3 * 2 * factorial(1)
→ 3 * 2 * 1 * factorial(0)
→ 3 * 2 * 1 * 1 = 6
siempre se llega al caso base (si n es positivo) ya que el valor se va reduciendo hasta que
se llega a este.





3. Si el numero es negativo tira excepcion ya que el numero va a ser cada vez mas negativo,
por lo que nunca va a llegar al caso base y queda en un loop infinito.
    Resultados:
    n = 5 ->120
    n = 4 ->24
    n = 0 -> 1



 */