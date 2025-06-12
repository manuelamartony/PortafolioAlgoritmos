package org.example;

public class ValueOfDemo {
    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf (args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue ();
            // do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }
}

/* El codigo funciona correctamente luego de un par de cambios.En la linea 10 se llamaba a value en vez de float
    value y, en la linea 7 se igualaba el largo a 3 cuando el codigo solo recibe dos parametros

    Al correr el codigo con los parametros 13.4 y 66.1 este devuelve:
    a + b = 79.5
    a - b = -52.699997
    a * b = 885.7399
    a / b = 0.20272315
    a % b = 13.4

 */