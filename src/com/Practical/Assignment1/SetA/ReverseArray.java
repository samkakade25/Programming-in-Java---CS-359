package com.Practical.Assignment1.SetA;

// d) Write a program to accept the array element and display in reverse order.

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter the elements you Want to a store: ");
        n = in.nextInt();
        int[] arr = new int[5];

        System.out.print("Enter the elements of an arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("The elements are :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The elements in reverse order: ");

        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
