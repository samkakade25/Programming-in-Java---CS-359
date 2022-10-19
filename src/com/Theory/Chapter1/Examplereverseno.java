package com.Theory.Chapter1;

// Program 14: Program for reverse a number.

import java.util.Scanner;

public class Examplereverseno {
    public static void main(String[] args) {

        int rev = 0;
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while(num > 0) {
            rev = (rev * 10)+ (num%10);
            num = num / 10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
