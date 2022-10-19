package com.Theory.Chapter1;

// Program 12: Program to display maximum number

import java.util.Scanner;

public class TestMax {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b && a>c)
            System.out.println(a + " is the max");
        if (b>a && b>c)
            System.out.println(b + " is the max");
        else
            System.out.println(c + " is the max");
    }
}
