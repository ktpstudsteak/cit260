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

        if (intMonth > 12 || intMonth < 1) {
            System.out.println(String.valueOf(intMonth) + " is invalid. Month values must be between between 1 and 12, inclusive.\n" +
                    "    Goodbye.");
        }

        else {
//        Do I need to use `==` here?
//        if (intYear % 4 == 0 && intMonth == 2) {
//            System.out.println("February of " + intYear + " has 29 days in it.");
//        }
            int numDays = 0;
            String strMonthName = " ";
            switch (intMonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                case 2:
                    if (((intYear % 4 == 0) &&
                            !(intYear % 100 == 0))
                            || (intYear % 400 == 0))
                        numDays = 29;
                    else
                        numDays = 28;
                    break;
            }
            switch (intMonth) {
                case 1 -> strMonthName = "January";
                case 2 -> strMonthName = "February";
                case 3 -> strMonthName = "March";
                case 4 -> strMonthName = "April";
                case 5 -> strMonthName = "May";
                case 6 -> strMonthName = "June";
                case 7 -> strMonthName = "July";
                case 8 -> strMonthName = "August";
                case 9 -> strMonthName = "September";
                case 10 -> strMonthName = "October";
                case 11 -> strMonthName = "November";
                case 12 -> strMonthName = "December";
            }

            System.out.println("\n" + strMonthName + " of 1953 has " + numDays + " days in it.");
        }
    }
}
