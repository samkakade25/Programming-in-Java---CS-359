package com.Theory.Chapter1;

// Program 11: Program to check a leap year or not.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int year  = in.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year %400 == 0))
            System.out.println(year+" is Leap Year");
        else
            System.out.println(year+" is Not Leap Year");
    }
}
