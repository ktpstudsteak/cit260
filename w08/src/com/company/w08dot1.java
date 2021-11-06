package com.company;

public class w08dot1 {

    public static void main(String[] args) {
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter. ");

        //Create objects
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        //Set r1
        r1.height = 4.00;
        r1.width = 40.00;

        //Set r2
        r2.height = 3.50;
        r2.width = 5.00;

        //Output r1
        System.out.printf("""
                        Rectangle 1:
                        height = %.2f
                        width = %.2f
                        area = %.2f
                        perimeter = %.2f
                        
                        Rectangle 2:
                        height = %.2f
                        width = %.2f
                        area = %.2f
                        perimeter = %.2f
                        """,

                r1.getHeight(),
                r1.getWidth(),
                r1.getArea(),
                r1.getPerimeter(),

                r2.getHeight(),
                r2.getWidth(),
                r2.getArea(),
                r2.getPerimeter());
    }
}


