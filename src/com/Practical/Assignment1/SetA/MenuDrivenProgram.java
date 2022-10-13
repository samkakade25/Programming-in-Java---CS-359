package com.Practical.Assignment1.SetA;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        float pi = 3.14f;
        int radius, height, n, choice;

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 to Calculate the volume of cylinder");
            System.out.println("Press 2 to Find the factorial of a given number");
            System.out.println("Press 3 to Check the number is Armstrong or Not");
            System.out.println("Press 4 to Exit");

            System.out.print("Make your choice: ");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the radius of cylinder: ");
                    radius = in.nextInt();
                    System.out.print("Enter the height of cylinder: ");
                    height = in.nextInt();
                    double volume = pi*(radius*radius)*height;
                    System.out.println("The volume of the cylinder is = "+volume+"\n");
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    n = in.nextInt();
                    int fact =1;
                    for(int i=1; i<=n; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " +n+"is "+fact+"\n");
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    n= in.nextInt();
                    int originalnumber, remainder, result=0;
                    originalnumber = n;

                    while(originalnumber != 0) {
                        remainder = (originalnumber % 10);
                        result += Math.pow(remainder,3);
                        originalnumber /= 10;
                    }
                    if (result==n)
                        System.out.println(n+" is an Armstrong Number"+"\n");
                    else
                        System.out.println(n+" is not an Armstrong Number"+"\n");
                    break;

                case 4:
                    System.out.println("Exit Program");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}