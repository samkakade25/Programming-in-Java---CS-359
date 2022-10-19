package com.Theory.Chapter1;

// Program 15: Program for pattern.

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int lim = in.nextInt();

        for (int i = lim; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();

        }
    }
}
