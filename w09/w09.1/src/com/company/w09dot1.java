package com.company;

import java.util.Scanner;

public class w09dot1 {

    public static void main(String[] args) {
        //Tell the user the purpose
        System.out.println("""
                This program creates a point at (0,0) and a point at the coordinates\s
                entered by you. It then computes and displays the distance from (0,0)
                to the point defined by you, using three different methods.""");

//        Create scanner
        Scanner in = new Scanner(System.in);

        //Get X value
        System.out.print("Enter the x coordinate of a point: ");
        int intX = in.nextInt();

        System.out.print("Enter the y coordinate of a point: ");
        int intY = in.nextInt();

//        Create new object. In a fancy way because I can :3
//        This is going to be 0,0.
        MyPoint mp1 = new MyPoint();

        //Create mp2 object
        MyPoint mp2 = new MyPoint(intX, intY);

        System.out.println("mp1.x & y: " + mp1.x + " " + mp1.y);
//        System.out.printf("Using method 1, the distance from (%d,%d) to (%d,%d) is %.2f\n", MyPoint.x, MyPoint.y, x, y, MyPoint.distance(x,y));
    }
}
