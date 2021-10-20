package com.company;

import java.util.Scanner;

public class Main {
    public static double getDouble(double dbl1, double dbl2){
        return (dbl1 / dbl2);
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("This program returns a ratio of 2 numbers using a method\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        double dbl1 = in.nextDouble();

        System.out.print("Enter 2nd Number: ");
        double dbl2 = in.nextDouble();

        double dblResult = getDouble(dbl1, dbl2);

        System.out.printf("The Ratio is %.2f" , dblResult);
    }
}
