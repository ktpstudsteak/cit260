package com.company;

import java.util.Scanner;

public class W04dot2 {

    public static void main(String[] args) {
	// Purpose
        System.out.println("""
                Given your name, hours worked, and hourly wage, this program calculates your\s
                gross pay, state withholding tax, federal withholding tax, and your net pay.
                It then displays your pay stub.""");

        //Scanner
        Scanner in = new Scanner(System.in);

        //First & Last name
        System.out.print("Enter your first and last name: ");
        //Get Names
        String strName = in.nextLine();

        //Hours Worked
        System.out.print("Enter the hours you worked this week: ");
        //Get Hours
        double dblHoursWorked = in.nextDouble();

        //Hourly Wage
        System.out.print("Enter your hourly wage: ");
        //Get Wage
        double dblHourlyWage = in.nextDouble();

        //Calculate Gross Pay
        double dblGross = dblHourlyWage * dblHoursWorked;

        //Calculate State Tax Withheld
        double dblState = .09 * dblGross;

        //Calculate Federal Tax Withheld
        double dblFed = .2 * dblGross;

        //Calculate Net Pay
        double dblNet = dblGross - (dblFed + dblState);

        //Spacer
        System.out.println("\n");

//    ################################################################################################################


        //Output Name
        System.out.print("Pay Stub for " + strName + "\n");

        // Output Hours
        System.out.printf("Hours Worked: %.2f\n", dblHoursWorked);

        //Output Hourly Wage
        System.out.printf("Hourly Wage: $%.2f\n", dblHourlyWage);

        //Output Gross Pay
        System.out.printf("Gross Pay: $%.2f\n", dblGross);

        //Output State Tax Withheld
        System.out.printf("State Tax Withheld: $%.2f\n", dblState);

        //Output Federal Tax Withheld
        System.out.printf("Federal Tax Withheld: $%.2f\n", dblFed);

        //Output Net Pay
        System.out.printf("Net Pay: $%.2f\n", dblNet);


        //Goodbye
        System.out.println("\nGoodbye");
    }
}
