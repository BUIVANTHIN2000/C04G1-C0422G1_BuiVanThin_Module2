package ss7_AbstractClass.bai_tap.bai_1;

import ss6_Inheritance.thuc_hanh.Circle;
import ss6_Inheritance.thuc_hanh.Rectangle;
import ss6_Inheritance.thuc_hanh.Shape;
import ss6_Inheritance.thuc_hanh.Square;

class RunTack {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5.6, 4);
        shapes[2] = new Square(9);
        System.out.println("********************** After resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.random()*100);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.random()*100);
            } else {
                ((Square) shape).resize(Math.random()*100);
            }
        }
        System.out.println("********************** Before resize **********************");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("------------------");
        }
    }
}