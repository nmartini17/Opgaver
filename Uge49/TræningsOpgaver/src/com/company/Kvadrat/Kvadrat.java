package com.company.Kvadrat;

public class Kvadrat {

    public static void printSquare(int number, String sign) throws IllegalArgumentException {
        if (number > 20 || number < 20) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; i < number; j++) {
                System.out.println(sign + "\t");
            }
            System.out.println("\b");
        }
    }
}
