package w13dot1;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //Create objects
        Circle cir = new Circle(10);
        Square sq = new Square(2);
        Triangle tr = new Triangle(3,4);

        //Create arraylist
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(cir);
        shapes.add(sq);
        shapes.add(tr);

        System.out.println("This program will display the area of predefined shapes using an arraylist\n");

        for (Shape i : shapes){
            System.out.printf("""
                    Identifier  Area
                    %d          %.2f sq. inches""", i.getId(), i.area());
        }



    }
}
