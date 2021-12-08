package w12dot1;

public class Circle extends Shape {
    public double radius;
    final double PI = Math.PI;
    private final int id = 156;

    /**
     * NoArg Constructor
     */
    public Circle() {
        radius = 0.0;
    }

    /**
     * Arg Constructor
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets Radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets Radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * The Area Method
     * Purpose: Returns the area in a double. Will be overridden for each class
     */
    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }
}
