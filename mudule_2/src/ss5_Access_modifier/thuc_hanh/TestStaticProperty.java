package ss5_Access_modifier.thuc_hanh;

public class TestStaticProperty {
    public TestStaticProperty() {
    }

    public static void main(String[] args) {
        Car honda = new Car("r100", "ron95");
        System.out.println("name :" + honda.getName());
        System.out.println("engine :" + honda.getEngine());
        System.out.println("number Car :" + Car.numberOfCars);
        Car honda2 = new Car("r2000", "ron92");
        System.out.println("name :" + honda2.getName());
        System.out.println("engine :" + honda2.getEngine());
        System.out.println("number Car :" + Car.numberOfCars);
    }
}