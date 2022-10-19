package com.Theory.Chapter1;

// Program 21: Program to read and display 2D array using Scanner.

import java.util.Scanner;

public class Example2d1 {
    public static void main(String[] args) {

        int m, n, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        m = in.nextInt();
        System.out.print("Enter the no. of columns: ");
        n = in.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements of the array: ");

        for (i=0; i < m; i++) {
            for (j=0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of the array are: ");
        for (i=0; i < m; i++) {
            for (j=0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
