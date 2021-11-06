package com.company;

public class w08dot1 {

    public static void main(String[] args) {
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter. ");

        //Create objects
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        //Set r1
        r1.setWidth(40.00);
        r1.setHeight(4.00);

        //Set r2
        r2.setWidth(5.00);
        r2.setHeight(3.50);

        //Output r1
        System.out.printf("""
                        Rectangle 1:
                        height = %.2f
                        width = %.2f
                        area = %.2f
                        perimeter = %.2f

                        """,


                rectangle.getHeight(),
                rectangle.getWidth(),
                rectangle.getArea(),
                rectangle.getPerimeter());
    }
}


