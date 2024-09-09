package inherit2;

public class Triangle extends Shape{
    private int w;
    private int h;
    public Triangle() {}
    public Triangle(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Triangle [ w: " + w + ", h: " + h + "]" + super.toString();
    }

    @Override
    public double getArea() {
        return this.w * this.h / 2;
    }

    @Override
    public double getCircum() {
        return this.w + this.h + Math.sqrt(this.w * this.w + this.h * this.h);
    }
}
