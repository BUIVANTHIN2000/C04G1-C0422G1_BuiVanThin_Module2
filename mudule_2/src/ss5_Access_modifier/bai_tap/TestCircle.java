package ss5_Access_modifier.bai_tap;

public class TestCircle {
    public TestCircle() {
    }

    public static void main(String[] args) {
        Circle tron = new Circle(1.0D);
        System.out.println("radius :" + tron.getRadius());
        System.out.println("Area = " + tron.getArea());
    }
}
