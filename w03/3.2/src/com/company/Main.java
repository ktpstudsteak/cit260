package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Given a year and a month in that year, this program will tell you the number of days in that month.");

        System.out.print("Enter a year: ");
        Scanner in = new Scanner(System.in);

        int intYear = in.nextInt();

        System.out.println(" ");

        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        int intMonth = in.nextInt();

        if (intMonth > 13 || intMonth < 1) {
            System.out.println(intMonth " 13 is invalid. Month values must be between between 1 and 12, inclusive.\n" +
                    "    Goodbye.");
        }
//        Do I need to use `==` here?
        if (year % 4 = 0) {

        }

    }
}
