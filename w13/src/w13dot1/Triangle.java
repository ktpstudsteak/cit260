package w13dot1;

public class Triangle extends Shape {
    double height;
    double base;
    public Triangle(int id, Point p, double height, double base){
        super(id,p);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return this.base * this.height / 2;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
