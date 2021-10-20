package com.company;

import java.util.Scanner;

public class Main {

    /**
     * The getRatio Method
     * Purpose: Calculate ratio oof two different numbers
     * @param dbl1 the numerator
     * @param dbl2 the denominator
     * @return dbl1 / dbl2
     */
    public static double getRatio(double dbl1, double dbl2){
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

        double dblResult = getRatio(dbl1, dbl2);

        System.out.printf("The Ratio is %.2f" , dblResult);
    }
}
