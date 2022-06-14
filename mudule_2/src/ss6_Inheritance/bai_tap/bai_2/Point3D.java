package ss6_Inheritance.bai_tap.bai_2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
     this.setX(x);
     this.setY(y);
     this.z = z;
    }
    public float[] getXYZ() {
        float[] array = {super.getX(),super.getY(), this.z};
        return array;
    }
    @Override
    public String toString() {
        return " (x,y,z) "+
                " x = " + getX() +
                " y = " + getY()+
                " z = " + z;
    }
    public static void main(String[] args) {
        Point3D src = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(src);
    }
}
