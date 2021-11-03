package com.company;

public class w07dot2 {

//    private static double[][] array;
//
//    public static double findSum(double[][] array) {
//        w07dot2.array = array;
//        int sum = 0;
//        for (double value : array) {
//            sum += value;
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        //purpose
        System.out.println("This Program computes the number of hours worked for a set of hourly employees.\n");

        // Create array of names
        String[] strNames = {"Tara Teamlead", "Harry Hacker", "Carl Coder", "Paula Programmer", "Darrin Debugger"};

        //Create 2x array
        double[][] dblArray = new double[][]{
                {0.0, 8.0, 8.0, 8.5, 8.0, 9.0, 0.0},
                {0.0, 9.0, 9.0, 8.5, 8.0, 7.5, 0.0},
                {0.0, 8.5, 8.0, 8.6, 8.6, 9.5, 2.0},
                {0.0, 4.75, 6.0, 6.25, 6.5, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 5.25, 5.25, 6.0}
        };

        //Need to find a way to sum up array before I start output
        //Print Headings
        System.out.println("Employee Name \t\t\t Total Hours");
        for (int i  = 0; i >5 ; i++)  {
            System.out.printf("%s \t\t\t ")
        }
    }
}
