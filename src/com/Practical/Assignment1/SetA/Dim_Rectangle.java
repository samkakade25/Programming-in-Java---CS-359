package com.Practical.Assignment1.SetA;

// b) Write a program to calculate perimeter and area of triangle

import java.util.Scanner;

public class Dim_Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Length= ");
        float length  = in.nextFloat();
        System.out.print("Breadth= ");
        float breadth = in.nextFloat();

        float area = length * breadth;
        double perimeter = 2*(length+breadth);

        System.out.println("The area of rectangle: "+ area);
        System.out.println("The perimeter of rectangle: "+ Math.round(perimeter));
    }
}
