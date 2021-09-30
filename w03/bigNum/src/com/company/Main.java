package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter number 1: ");

        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        if (num1 > num2) {

            System.out.println(num1 + " is bigger");
        }
        else if (num2 > num1){
            System.out.println(num2 + " is bigger");
        }
        else {
            System.out.println("The numbers are equal.");
        }
    }
}
