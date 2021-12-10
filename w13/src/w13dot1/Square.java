package w13dot1;

public class Square extends Shape {

    public double side;

    //Constructor
    public Square(int id, Point point, double side) {
        super(id, point);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Returns Area
     */
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
