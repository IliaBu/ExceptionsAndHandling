package org.example.s02;

public class task2 {

/* 2. Если необходимо, исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/

    public static void main(String[] args) {

        try {
            int d = 4;
            int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
