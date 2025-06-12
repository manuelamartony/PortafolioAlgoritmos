package org.example;

public class EsPrimo {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int calcularParesImpares(int n) {
        int suma = 0;
        if (isPrime(n)) {
            for (int i = 2; i <= n; i += 2) {
                suma += i;
            }
        } else {
            for (int i = 1; i < n; i += 2) {
                suma += i;
            }
        }
        return suma;
    }
}