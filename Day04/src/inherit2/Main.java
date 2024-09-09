package inherit2;

// 그림판
public class Main {
    public static void main(String[] args) {
        Shape Shapes[] = new Shape[3];
        Shapes[0] = new Circle(10, 10, 54);
        Shapes[1] = new Rectangle(20, 20, 100, 200);
        Shapes[2] = new Triangle(30, 30, 300, 400);

        for (Shape s : Shapes) {
            System.out.println(s);
            System.out.println(s.getArea());
            System.out.println(s.getCircum());
            System.out.println("--------------------");
        }
    }
}
