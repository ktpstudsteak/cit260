package com.w07dot1;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {

    /**
     * The mean Method
     * Purpose: Determine a future value of an investment
     * @param x The monthly interest rate
     */
    @Contract(pure = true)
    public static double mean(double[] x) {
        double mean = 0;
        for (double e: x) {
            mean += e;
        }
        return mean / x.length;
    }

    /**
     * The deviation Method
     * Purpose: Determine a future value of an investment
     * @param x The monthly interest rate
     */
    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (double e: x) {
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        // Prompt the user to enter ten numbers
        System.out.print("This program computes the mean and the standard deviation for a set of numbers.\n");
        for (int i = 0; i<numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextDouble();
        }

        // Displays the mean and standard deviation
        System.out.printf("The mean is %.2f", mean(numbers));
        System.out.printf("The standard deviation is %.2f", deviation(numbers));
    }
}