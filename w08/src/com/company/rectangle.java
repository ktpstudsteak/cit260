package com.company;

public class rectangle {
    double width;
    double height;

    /**
     * the getPerimeter method
     * Purpose: To calculate the perimeter of a rectangle object
     * @return double
     */
    public double getPerimeter(){
        return (width * 2) + (height * 2);
    }

    /**
     * the getArea method
     * Purpose: To calculate the area of a rectangle object
     * @return double
     */
    public double getArea(){
        return width * height;
    }

    /**
     * the getHeight method
     * Purpose: Returns the height AFTER it has been set by setHeight()
     * @return double
     */
    public double getHeight() {
        return height;
    }

    /**
     * the getWidth method
     * Purpose: Returns the height AFTER it has been set by setWidth()
     * @return double
     */
    public double getWidth() {
        return width;
    }
}
