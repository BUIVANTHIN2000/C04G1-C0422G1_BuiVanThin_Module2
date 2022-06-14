package ss6_Inheritance.bai_tap.bai_2;

public class Point2D {
    private float x = 0.0f;
    private  float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] array = {x,y};
        return array;
    }
    @Override
    public String toString() {
        return " (x,y) "+
                " x = " + x +
                " y = " + y;
    }
    public static void main(String[] args) {
        Point2D src = new Point2D(1.0f,2.0f);
        System.out.println(src);
    }
}
