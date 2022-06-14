package ss6_Inheritance.bai_tap.bai_1;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
      return super.getArea()*height;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Cylinder{" +
                "height=" + height +
                " volume = " + getVolume()+
                '}';
    }
    public static void main(String[] args) {
        Cylinder crc = new Cylinder(3.0,"red",2.0);
        System.out.println(crc);

    }
}

