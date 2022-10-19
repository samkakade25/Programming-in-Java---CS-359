package com.Theory.Chapter1;

// Program 10: Program to reading data from console

import java.io.*;
//import java.io.InputStreamReader;

public class ExampleBufferedReader {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        System.out.print("Enter data: ");
        name=br.readLine();
        System.out.println("data is: "+ name);
    }
}
