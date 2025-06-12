package org.example;

import java.lang.invoke.StringConcatFactory;

public class SumaLineal {

    public int SumaLineal(int[] A, int n) {
        if (n == 1){
            return A[0];
        }
        return SumaLineal(A, n-1)+ A[n - 1];
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        SumaLineal n = new SumaLineal();
        System.out.println(n.SumaLineal(A, -3));

    }
}
/* PSEUDOCODIGO
Funcion SumaLineal
COM
    SI n = 1 ENTONCES
        DEVOLVER A[0]
    FIN SI
    DEVOLVER SumaLineal(A, n-1) + A[n - 1]
FIN

 */