package org.example;

public class ValueOfDemo {
    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

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
        } else if (args.length == 3) {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
        else {System.out.println("El programa necesita de dos números enteros");}
    }
}

