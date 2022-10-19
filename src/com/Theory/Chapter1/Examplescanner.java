package com.Theory.Chapter1;

// Program 8: Program to read a line using Scanner

import java.util.Scanner;

public class Examplescanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String strname = input.nextLine();

        System.out.println("Name is "+ strname);
        input.close();
    }

}
