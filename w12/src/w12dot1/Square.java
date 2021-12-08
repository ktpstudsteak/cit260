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
    private final int id = 237;

    /**
     * Returns Area
     */
    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
