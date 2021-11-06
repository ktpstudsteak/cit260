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

    /**
     * the getArea method
     * Purpose: To calculate the area of a rectangle object
     * @param  pWidth the width of the rectangle object
     * @param pHeight the height of the rectangle object
     * @return double
     */
    public static double getArea(double pWidth, double pHeight){
        return pHeight * pWidth;
    }

    /**
     * the getPerimeter method
     * Purpose: To calculate the perimeter of a rectangle object
     * @param  pWidth the width of the rectangle object
     * @param pHeight the height of the rectangle object
     * @return double
     */
    public static double getPerimeter(double pWidth, double pHeight){
        return (pWidth * 2) + (pHeight * 2);
    }
}
