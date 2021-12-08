package w12dot1;

public class Circle implements Shape{
    private double radius;
    final double PI = Math.PI;

    /**
     * NoArg Constructor
     */
    public Circle() {
        radius = 0.0;
    }

    /**
     * Arg Constructor
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets Radius
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets Radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * The Area Method
     * Purpose: Returns the area in a double. Will be overridden for each class
     * @return
     */
    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }


}
