package com.Practical.Assignment1;

//Sample Program 7: Program for Multidimentional Array

public class Demo_multdimarr {
    public static void main(String[] args) {

        int arr[][]={{11,22,33},{44,55,66},{77,88,99}};     //declaring and initializing 2D array

        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");   //display 2D array

            }
            System.out.println();
        }
    }
}
