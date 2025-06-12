package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InvertirArray {

    public int[] InvertirArray(int[] A, int i, int j) {
        if (i >= j){
            return A;
        }
        int aux = A[i];
        A[i] = A[j];
        A[j] = aux;
        return InvertirArray(A, i+1, j-1);

    }

    public static void main(String[] args) {
        InvertirArray a = new InvertirArray();
        int[] A = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(a.InvertirArray(A, 0, A.length-1)));
    }
}

/* PSEUDOCODIGO
Funcion InvertirArray
COM
    Si i >= j Entonces
        Devolver A
    Fin Si
    aux <- A[i]
    A[i]<- A[j]
    A[j]<- aux
    Devolver InvertirArray(A, i+1, j-1)
FIN

*/
