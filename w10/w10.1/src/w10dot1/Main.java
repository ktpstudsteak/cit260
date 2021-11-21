package w10dot1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                This program gets input for a triangle from the user.
                It then creates a Triangle object and displays its description.
                """);
        Scanner in = new Scanner(System.in);

        //get sides
        double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();

        //prompt for color
        System.out.print("Enter the color of the triangle (e.g. \"red\"): ");
		String color = in.next();

        System.out.print("Is the triangle filled (y or n): ");
        boolean filled = in.nextBoolean();

        // create triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        //Output
        System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") + "filled");


    }
}
