package com.company;

public class rectangle {
   private double height;
   private double width;
//   private double area;
//   private double perimeter;

    //Constructors
    rectangle(){
        width = 1;
        height = 1;
    }

    public static double getArea(double pWidth, double pHeight){

        return pHeight * pWidth;
    }
}
