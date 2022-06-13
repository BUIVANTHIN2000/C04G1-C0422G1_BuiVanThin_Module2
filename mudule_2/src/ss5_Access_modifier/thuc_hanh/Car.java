package ss5_Access_modifier.thuc_hanh;

public class Car {
    static int numberOfCars;
    private String name;
    private String engine;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        ++numberOfCars;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
