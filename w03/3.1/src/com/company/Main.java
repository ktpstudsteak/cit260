package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Given today's day of the week and some number of days in the future\n" +
                "this program will tell you the day of the week for the future day.\n" +
                "\nEnter today's day of the week (0 for Sunday, 1 for Monday, etc): ");

        Scanner in = new Scanner(System.in);
        int dayOfWeek = in.nextInt();

        System.out.print("\nEnter the number of days in the future: ");
        int daysInFuture = in.nextInt();

        if (dayOfWeek < 0 || dayOfWeek > 6) {
            System.out.print("The input is invalid. \nGoodbye.");
            return;
        }
        if (daysInFuture < 0) {
            System.out.print("The input is invalid. \nGoodbye.");
            return;
        }

        System.out.println(" ");
        int newDayWeek = (dayOfWeek + daysInFuture) % 7;

        String nowDayName = "";
        String newDayName = "";

        switch (dayOfWeek) {
            case 0 -> nowDayName = "Sunday";
            case 1 -> nowDayName = "Monday";
            case 2 -> nowDayName = "Tuesday";
            case 3 -> nowDayName = "Wednesday";
            case 4 -> nowDayName = "Thursday";
            case 5 -> nowDayName = "Friday";
            case 6 -> nowDayName = "Saturday";
        }
        switch (newDayWeek) {
            case 0:
                newDayName = "Sunday";
                break;
            case 1:
                newDayName = "Monday";
                break;
            case 2:
                newDayName = "Tuesday";
                break;
            case 3:
                newDayName = "Wednesday";
                break;
            case 4:
                newDayName = "Thursday";
                break;
            case 5:
                newDayName = "Friday";
                break;
            case 6:
                newDayName = "Saturday";
                break;
        }

        System.out.println("Today is " + nowDayName + " and the future day is " + newDayName + ".");

    }
}
