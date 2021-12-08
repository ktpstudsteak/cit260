package w12dot1;

public class Square extends Shape {

    //Constructor
    Square() {
        side = 0.0;
    }

    public Square(double side) {
        this.side = side;
    }

    //Identifier
    public double side;

    /**
     * Get Identifier
     */
    @Override
    public int getId() {
        int id = 237;
        return id;
    }

    /**
     * Returns Area
     */
    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
