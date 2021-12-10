package w13dot1;

public class Triangle extends Shape {
    double height;
    double base;
    public Triangle(int id, Point p, double height, double base){
        super(id,p);
        this.height = height;
        this.base = base;
    }


}
