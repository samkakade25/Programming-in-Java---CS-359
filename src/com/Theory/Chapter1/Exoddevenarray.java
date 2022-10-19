package com.Theory.Chapter1;

// Program 18: Program to print odd and even numbers from an array.

public class Exoddevenarray {
    public static void main(String[] args) {

        int[] arr = {10, 23, 54, 61, 32, 22};
        System.out.print("Even array elements: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        System.out.print("Odd Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
