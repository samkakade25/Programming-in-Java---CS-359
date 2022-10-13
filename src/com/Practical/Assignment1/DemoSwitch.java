package com.Practical.Assignment1;

//Sample Program 5: Program for 'switch_case'

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The day is: ");
        char ch = in.next().charAt(0);

        switch(ch) {
            case 'S':
                System.out.println("Sunday");
                break;
            case 'M':
                System.out.println("Monday");
                break;
            case 'T':
                System.out.println("Tuesday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'H':
                System.out.println("Thursday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'A':
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter valid input");
        }
    }
}
