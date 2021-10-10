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

        //

//    ################################################################################################################
        //Output Name
        System.out.print("Pay Stub for " + strName);

        // Output Hours
        String strHours = String.valueOf(dblHoursWorked);
        System.out.print("Hours Worked: " + strHours);

        //Output Hourly Wage
        String strHourlyWage = String.valueOf(dblHourlyWage);
        System.out.print("Hourly Wage: $" + strHourlyWage);

        //Output Gross Pay

        //Output State Tax Withheld

        //Output Federal Tax Withheld

        //Output Net Pay

        System.out.println("Goodbye");
    }
}
