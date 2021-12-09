package w13dot1;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    /**
     * Get Identifier
     */
    @Override
    public int getId() {
        //Identifier
        return 212;
    }

    public Triangle() {
        base = 0;
        height = 0;
    }

    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }

    /**
     * Returns Area
     */
    @Override
    public double area() {
        return (base * height) / 2;
    }
}
