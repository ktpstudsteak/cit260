package com.company;

import java.util.Scanner;

public class w06dot1 {
    /**
     * The futureValue Method
     * Purpose: Determine a future value of an investment
     * @param investmentAmount The principle investment amount
     * @param monthlyInterestRate The monthly interest rate
     */

    public static void futureValue(double investmentAmount, double monthlyInterestRate){
//        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        System.out.println("Years \t Future Value");

        double dblFuture;
        for (int i = 1; i <= 10; i++){
            dblFuture = investmentAmount * Math.pow(1 + monthlyInterestRate, i * 12);
            System.out.printf("%d\t\t$%.2f\n",i, dblFuture);
        }

    }
    public static void main(String[] args) {
        System.out.println("""
                Given an investment amount and an annual interest rate, this program\s
                will calculate the future value of the investment for a period of
                ten years.\s""");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the a positive, non-zero value for the investment: ");
        double dblInvestment = in.nextDouble();
        //Check and reprompt if needed
        while (dblInvestment <= 0) {
            System.out.println("That number is invalid. Please enter a valid number.");
            System.out.print("Enter a positive, non-zero value for the investment: ");
            dblInvestment = in.nextDouble();
        }
        System.out.print("Enter an annual interest rate, between 0 and 100: ");
        double dblRate = in.nextInt();

        //Check and reprompt
        while (dblRate < 0) {
            System.out.println("That number is invalid. Please enter a valid number.");
            System.out.print("Enter an annual interest rate, between 0 and 100: ");
            dblRate = in.nextInt();
        }

        //Convert to a percentage
        dblRate = dblRate / 100;

        //Calculate future investment value
        futureValue(dblInvestment,dblRate);


    }
}
