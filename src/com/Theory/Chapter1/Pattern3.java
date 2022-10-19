package com.Theory.Chapter1;

// Program 16: Program for pattern.

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int lim = in.nextInt();

        char ch = 'A';

        for(int i=1; i<=lim; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" "+ch);
            }
            ch++;
            System.out.println();
        }
    }
}
