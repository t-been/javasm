package inherit2;

public class Circle extends Shape {
    private int r;
    public Circle() {}
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle [ r: " + r + "]" + super.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double getCircum() {
        return 2 * Math.PI * this.r;
    }
}
