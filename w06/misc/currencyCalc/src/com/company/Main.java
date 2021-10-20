package com.company;

import java.util.Scanner;

public class Main {

    /**
     * The dollarsToPesos Method
     * Purpose: Convert a dollar amount to pesos
     * @param dollars dollar amount
     * @return Pesos conversion of the dollar amount
     */
    public static double dollarsToPesos(double dollars){
        return dollars * 19;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Dollar Amount: ");
        double dblDollars = in.nextDouble();

        double dblResult = dollarsToPesos(dblDollars);

        System.out.printf("$%.2f in Pesos would be Mex$%.2f.\n", dblDollars, dblResult);
    }
}
