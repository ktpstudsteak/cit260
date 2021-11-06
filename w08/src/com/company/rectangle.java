package com.company;

public class rectangle {
   private double height;
   private double width;

    //Constructors:

    //default
    rectangle(){
        width = 1;
        height = 1;
    }

    //Allows them not to be just one? delete if it doesn't work.
    rectangle(double pWidth, double pHeight){
        width = pWidth;
        height = pHeight;
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
    public double getPerimeter(double pWidth, double pHeight){
        return (pWidth * 2) + (pHeight * 2);
    }

    /**
     * the setHeight method
     * Purpose: Gets the height from input and sets it as the class var height
     * @param pHeight the height of the rectangle object being given by the user
     */
    public void setHeight(double pHeight) {
        this.height = pHeight;
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
     * the setWidth method
     * Purpose: Gets the width from input and sets it as the class var height
     * @param pWidth the width of the rectangle object being given by the user
     */
    public void setWidth(double pWidth) {
        this.width = pWidth;
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
