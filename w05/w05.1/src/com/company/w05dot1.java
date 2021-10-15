package com.company;

public class w05dot1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This program will output a table showing pounds per kilogram.\n");

        System.out.print("""
                kilograms\t\tpounds
                ---------\t\t------
                """);
        int intKilo;
        double dblPound;

        for (intKilo = 1; intKilo <= 15; intKilo += 2) {
            dblPound = (2.2 * intKilo);
            System.out.printf(intKilo + "\t\t\t\t" + "%-3.1f\n", dblPound);
        }

        System.out.println("\nGoodbye.");
    }
}
