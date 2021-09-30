package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in); // new scanner object. not sure if I need to do this for each time I input
        System.out.print("Given the price of a meal and a percentage to use for the tip, \n" +
                "    this program calculates the tip, the tax, and the total amount of the bill.\n" +
                "    Enter the cost of the meal: ");
        String meal = scan.nextLine(); //Input meal

        System.out.print("Enter the tip percentage: ");
        String tip = scan.nextLine(); //Input tip perentage

        double dMeal = Double.parseDouble(meal); //parse double meal

        double dTip  = Double.parseDouble(tip);  //parse double tip
        double mTip  = dTip / 100; //divided tip. ie 15% == .15
        double rTip = (mTip * dMeal); // tip for meal in cash is percentage times total

        double tax = dMeal * .032; //meal * tax rate = tax

        double total = dMeal + rTip + tax; // Calc total

        System.out.println("The tip is $" + rTip);
        System.out.println("The tax is $" + tax);
        System.out.println("The total bill is $" + total);
    }

}
