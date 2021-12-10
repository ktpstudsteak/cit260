package w13dot1;

public class Circle extends Shape {
    public double radius;
    final double PI = Math.PI;

    public Circle(int id, Point point, double radius) {
        super(id, point);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * The Area Method
     * Purpose: Returns the area in a double. Will be overridden for each class
     */
    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
