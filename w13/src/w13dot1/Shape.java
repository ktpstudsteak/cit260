package w13dot1;

public abstract class Shape {

    private int id;
    private Point point;

    public Shape(int id, Point point) {
    this.id = id;
    this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract double getArea();
    public abstract String getName();
}

