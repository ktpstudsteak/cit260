package com.company;

import java.awt.geom.Point2D;

public class MyPoint {
    //Params
    public static double x;
    public static double y;

    //Getters and setters

    /**
     * NoArg constructor to set x & y to 0
     */
    public MyPoint(){
        x = 0.0;
        y = 0.0;
    }
    /** Gets the X-Coordinate
     * @return The x value
     */
    public static double getX() {
        return x;
    }

    /**
     * Sets the X-Coordinate
     * @param x The X value
     */
    public static void setX(double x) {
        MyPoint.x = x;
    }

    /**
     * Gets the Y-Coordinate
     * @return  y The Y value
     */
    public static double getY() {
        return y;
    }

    /**
     * Sets the Y-Coordinate
     * @param y The Y value
     */
    public static void setY(double y) {
        MyPoint.y = y;
    }

    /**
     * Calculates and returns the distance between this MyPoint object and another point that is
     * specified by its X & Y coordinates.
     * @param xCoord
     * @param yCoord
     * @return double
     */
    public double distance(int xCoord, int yCoord){
        return Point2D.distance(x,y,xCoord,yCoord);
    }

    /**
     * Calculates and returns the distance between this MyPoint object
     * and another object of the MyPoint class
     * @param p
     * @return double
     */
    public double distance(MyPoint p){
        return Point2D.distance(MyPoint.x, MyPoint.y, p.x, p.y);
    }

    /**
     * Takes two objects of the MyPoint class as parameters, and calculates
     * and returns the distance between the two of them
     * @param mp1
     * @param mp2
     * @return double
     */
    public static double distance (MyPoint mp1, MyPoint mp2){
        return Point2D.distance(mp1.x, mp1.y, mp2.x, mp2.y);
    }
}
