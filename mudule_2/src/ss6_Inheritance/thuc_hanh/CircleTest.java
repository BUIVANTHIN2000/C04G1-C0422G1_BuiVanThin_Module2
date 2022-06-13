package ss6_Inheritance.thuc_hanh;

public class CircleTest {
    public CircleTest() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5D);
        System.out.println(circle);
        circle = new Circle(3.5D, "indigo", false);
        System.out.println(circle);
    }
}
