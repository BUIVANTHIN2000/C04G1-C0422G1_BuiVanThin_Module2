package ss4_ClassesAndObjectsInJava.Bai_tap;

public class fan {
    final int SLOW = 1;
    final int FAST = 3;
    private int speed = 1;
    private boolean on;
    private double radius = 5.0D;
    private String color = "blue";

    public fan() {
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String fans() {
        return !this.isOn() ? "Fan is Off\nColor: " + this.getColor() + "\nRadius: " + this.getRadius() : "Fan is On\nSpeed: " + this.getSpeed() + "\nColor: " + this.getColor() + "\nRadius: " + this.getRadius();
    }

    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setRadius(10.0D);
        fan1.setOn(true);
        fan1.getClass();
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        System.out.println(fan1.fans());
        System.out.println("===========================================================");
        fan fan2 = new fan();
        System.out.println(fan2.fans());
    }
}