package com.Theory.Chapter1;

// Program 20: Program to read and display 2D array

public class Example2d {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};

        for(int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr["+i+"]["+j+"]= "+arr[i][j]);
            }
        }

        System.out.println("Array elements are: ");
        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
