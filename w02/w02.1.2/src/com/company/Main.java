package com.company;
import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tempScan = new Scanner(System.in); // new scanner object
        System.out.println("This program converts a temperature in degrees Celsius into \n" +
                "a temperature in degrees Fahrenheit. Enter a temperature in" +
                "degrees Celsius: ");

        String cel = tempScan.nextLine(); // Store input to cel

        double dCel = Double.parseDouble(cel);

        double far = (dCel * 1.8) + 32;

        String sCel = String.valueOf(dCel); // string dcel to output

        String sFar = String.valueOf(far); //

        System.out.format(sCel + " degrees Celsius is equal to " + sFar +  " degrees Fahrenheit.\n" +
                "   Goodbye.");


    }
}
