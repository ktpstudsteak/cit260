package w13dot1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create objects
        Circle cir = new Circle(333, new Point(7, 7), 5);
        Square sq = new Square(237, new Point(1, 3), 2.0);
        Triangle tr = new Triangle(212, new Point(3, 3), 3, 4);

        //        A Circle object at point (1,1) with a radius of 10
        //        inches and an identifier of 156
        //        A Square object at point (1,3) with a side of
        //        2 inches and an identifier of 237
        //        A  Right Triangle at point (3,3) with a height
        //        of 3 inches, a base of 4 inches and a ntifier of 212
        //        //Create arraylist
        ArrayList < Shape > shapes = new ArrayList < > ();
        shapes.add(cir);
        shapes.add(sq);
        shapes.add(tr);

        System.out.println("This program will display the area of predefined shapes using an arraylist:\n");

        try (PrintWriter out = new PrintWriter(new File("text.txt"))) {
            System.out.println("Shape      ID    Position  Area");
            for (Shape shape: shapes) {
                System.out.printf("%-8s   %d   (%d,%d)     %.2f %n", shape.getName(), shape.getId(), shape.getPoint().getX(), shape.getPoint().getY(), shape.getArea());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFile has been written");

        System.out.println("\nRead File");
        try (Scanner in = new Scanner(new File("text.txt"))) {
            while ( in .hasNextLine()) {
                System.out.println( in .nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}